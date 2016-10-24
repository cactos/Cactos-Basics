package eu.cactosfp7.cdosession;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

import org.apache.log4j.Logger;
import org.eclipse.emf.cdo.common.CDOCommonSession.Options.PassiveUpdateMode;
import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.net4j.CDONet4jSessionConfiguration;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.IPluginContainer;
import org.eclipse.net4j.util.lifecycle.LifecycleUtil;
import org.eclipse.net4j.util.security.IPasswordCredentialsProvider;

import eu.cactosfp7.cdosession.service.CdoSession;
import eu.cactosfp7.optimisationplan.OptimisationplanPackage;

final class SessionHolder {

	/* ensure that all methods are synchronized and this
	 * class functions as a real monitor */
	private static int RECREATION_TIMESPAN_IN_MINUTES = 10;
	private static int CLOSING_TIMESPAN_IN_MINUTES = 20;
	
	private static final Logger log = Logger.getLogger(CdoSession.class);
	
	private List<InnerHolder> oldSessions = new ArrayList<>();
	// no, we do need an atomic reference here; but I like 
	// final fields
	private final AtomicReference<InnerHolder> sessionRef;
	private final IPasswordCredentialsProvider credentialsProvider;
	private final String repoName;
	private final String endpoint;

	
	private SessionHolder(CDONet4jSession _session, IPasswordCredentialsProvider credentialsProvider, String repoName, String endpoint) {
		sessionRef = new AtomicReference<>(new InnerHolder(_session));
		
		this.credentialsProvider = credentialsProvider;
		this.repoName = repoName;
		this.endpoint = endpoint;
	}

	synchronized CDOView createView(CactosCdoSession cdoSession) {
		log.info("created view, printing other open views/transactions: ");
		CDOView view = openView();
		printOpenConnections(cdoSession, "view " + view.getViewID());
		return view;
	}

	synchronized CDOTransaction createTransaction(CactosCdoSession cdoSession) {
		log.info("created transaction, printing other open views/transactions: ");
		CDOTransaction transaction = openTransaction();
		printOpenConnections(cdoSession, "transaction " + transaction.getViewID());
		// transaction.options().addConflictResolver(new CDOMergingConflictResolver());
		return transaction;
	}

	synchronized void printOpenConnections(CactosCdoSession cdoSession, String moreInfo) {
		int tx = this.getSession().getTransactions().length;
		int vs = this.getSession().getViews().length;		
		log.info("For cactosCdoSession " + cdoSession + " " + moreInfo + ": " + tx + " open transactions, " + vs + " open views.");	
	}
	
	private CDOTransaction openTransaction() {
//		getSession().refresh();
		return getSession().openTransaction();
	}
	
	private CDOView openView() {
//		getSession().refresh();
		return getSession().openView();
	}
	
	private long computeAgeInMinutes(long referenceTime, InnerHolder h) {
		return TimeUnit.MINUTES.convert(referenceTime - h.creationTime, TimeUnit.MILLISECONDS);
	}
	
	private CDONet4jSession getSession() {
		/*
		CDONet4jSession retVal = null;
		
		long now = System.currentTimeMillis();
		InnerHolder h = sessionRef.get();
		long ageInSecs = computeAgeInMinutes(now, h);
		
		log.info("current session is " + ageInSecs + " seconds old.");
		if(ageInSecs > RECREATION_TIMESPAN_IN_MINUTES) {
			retVal = createAndSetNewSession();
		} else {
			retVal = h.theSession;
		}
		cleanOldReferences(now);
		return retVal;
		*/
		return sessionRef.get().theSession;
	}
	
	private void cleanOldReferences(long now) {
		Iterator<InnerHolder> it = oldSessions.iterator();
		log.info("iterating old references: " + oldSessions.size() + ": elements available.");
		while(it.hasNext()) {
			InnerHolder h = it.next();
			long ageInSecs = computeAgeInMinutes(now, h);
			if(ageInSecs > CLOSING_TIMESPAN_IN_MINUTES
					&& h.closeIfPossible()) {
				it.remove();
			}
		}
	}

	private CDONet4jSession createAndSetNewSession() {
		CDONet4jSession newSession = createCdoSession(credentialsProvider, repoName, endpoint);
		InnerHolder newH = new InnerHolder(newSession);
		InnerHolder oldH = sessionRef.getAndSet(newH);
		oldSessions.add(oldH);
		return newSession;
	}
	
	

	private static class InnerHolder {
		private final CDONet4jSession theSession;
		private final long creationTime = System.currentTimeMillis();
		
		InnerHolder(CDONet4jSession _session) {
			theSession = _session;
		}

		public boolean closeIfPossible() {
			boolean retVal = false;
			int openTransactions = theSession.getTransactions().length;
			int openViews = theSession.getViews().length;
			if(openTransactions < 1 && openViews < 1) {
				log.info("closing CDONet4jSession " + theSession + ", as time elapsed and no open views/transactions remain.");
				theSession.close();
				retVal= true;
			} else {
				log.warn("cannot close CDONet4jSession " + theSession + " as still open views/transactions exist: " + openTransactions + "/" + openViews);
			}
			return retVal;
		}
	}
	
	private static CDONet4jSession createCdoSession(IPasswordCredentialsProvider credentialsProvider, String repoName, String endpoint) {
		Net4jUtil.prepareContainer(IPluginContainer.INSTANCE); // Register Net4j
																// factories
		TCPUtil.prepareContainer(IPluginContainer.INSTANCE); // Register TCP
																// factories
		CDONet4jUtil.prepareContainer(IPluginContainer.INSTANCE); // Register													// CDO
																	// factories
		// OCLQueryHandler.prepareContainer(IPluginContainer.INSTANCE);

		LifecycleUtil.activate(IPluginContainer.INSTANCE);

		final IConnector connector = TCPUtil.getConnector(IPluginContainer.INSTANCE, endpoint);

		final CDONet4jSessionConfiguration config = CDONet4jUtil.createNet4jSessionConfiguration();
		config.setConnector(connector);
		config.setRepositoryName(repoName);
		config.setCredentialsProvider(credentialsProvider);
		config.setPassiveUpdateMode(PassiveUpdateMode.ADDITIONS);
//		config.setPassiveUpdateEnabled(false);

		final CDONet4jSession session = config.openNet4jSession();
		session.options().setCollectionLoadingPolicy(CDOUtil.createCollectionLoadingPolicy(0, 300));
		session.getPackageRegistry().putEPackage(OptimisationplanPackage.eINSTANCE);
		
		log.info("opened a new CDONet4jSession " + session + ".");
		return session;
	}

	public static SessionHolder create(IPasswordCredentialsProvider credentialsProvider, String repoName, String endpoint) {
		CDONet4jSession cdoSession = createCdoSession(credentialsProvider, repoName, endpoint);
		return new SessionHolder(cdoSession, credentialsProvider, repoName, endpoint);
	}

	synchronized String getSessionString() {
		return "CDONet4jSession: " + getSession();
	}
}
