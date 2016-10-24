package eu.cactosfp7.cdosession;

import java.util.Dictionary;

import org.apache.log4j.Logger;
import org.eclipse.emf.cdo.common.CDOCommonSession.Options.PassiveUpdateMode;
import org.eclipse.emf.cdo.common.commit.CDOCommitInfo;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.net4j.CDONet4jSessionConfiguration;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.util.ConcurrentAccessException;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.spi.cdo.CDOMergingConflictResolver;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.IPluginContainer;
import org.eclipse.net4j.util.lifecycle.LifecycleUtil;
import org.eclipse.net4j.util.security.IPasswordCredentialsProvider;

import eu.cactosfp7.cdosession.service.CdoSession;
import eu.cactosfp7.cdosession.settings.CactosUser;
import eu.cactosfp7.optimisationplan.OptimisationplanPackage;

public class CactosCdoSession {

	/** The logger for this class. */
	private static final Logger log = Logger.getLogger(CdoSession.class);
	
	private final SessionHolder session;
	private final Dictionary<String, ?> settings;
	
	private CactosCdoSession(Dictionary<String, ?> _settings, IPasswordCredentialsProvider credentialsProvider, String repoName, String endpoint) {
		session = SessionHolder.create(credentialsProvider, repoName, endpoint);
		settings = _settings;
	}

	public String getOptimisationPlanPath() {
		return (String) settings.get(CdoSession.OPTIMISATIONPLANRESOURCE);
	}

	public String getLogicalModelPath() {
		return (String) settings.get(CdoSession.LOGICALMODELRESOURCE);
	}

	public String getPhysicalModelPath() {
		return (String) settings.get(CdoSession.PHYSICALMODELRESOURCE);
	}

	public String getLogicalLoadPath() {
		return (String) settings.get(CdoSession.LOGICALLOADRESOURCE);
	}

	public String getPhysicalLoadPath() {
		return (String) settings.get(CdoSession.PHYSICALLOADRESOURCE);
	}

	public String getHypervisorPath() {
		return (String) settings.get(CdoSession.HYPERVISORRESOURCE);
	}

	public String getArchitectureTypePath() {
		return (String) settings.get(CdoSession.ARCHITECTURETYPERESOURCE);
	}

	@Deprecated
	public CDONet4jSession getCdoSession() {
		log.fatal("do not use getCdoSession().");
		return null;
	}

	/**
	 * create a new view on the current session (read-only).
	 * 
	 * @return
	 */
	public synchronized CDOView createView() {
		return session.createView(this);
	}

	/**
	 * create a new transaction on the current session (read-write).
	 * 
	 * @return
	 */
	public synchronized CDOTransaction createTransaction() {
		return session.createTransaction(this);
	}

	/**
	 * Get a read-only resource from a temporary created CDOView.
	 * 
	 * @param resourcePath
	 * @return
	 */
	public CDOResource getResource(String resourcePath) {
		CDOView connection = createView();
		CDOResource resource = getResource(connection, resourcePath);
		connection.close();
		return resource;
	}

	/**
	 * Get a resource from a previously opened CDOTransaction. Creates it, if
	 * not available.
	 * 
	 * @param connection
	 * @param resourcePath
	 * @return
	 */
	public CDOResource getResource(CDOTransaction connection, String resourcePath) {
		return connection.getOrCreateResource(resourcePath);
	}

	/**
	 * Get a resource from a previously opened CDOView. Fails if not existing!
	 * 
	 * @param connection
	 * @param resourcePath
	 * @return
	 */
	public CDOResource getResource(CDOView connection, String resourcePath) {
		CDOResource resource = connection.getResource(resourcePath);
		if (resource == null)
			throw new RuntimeException("Cannot load CDOResource " + resourcePath + " since its not there!");
		return resource;
	}

	/**
	 * Get Repository by resourcePath. Internally, a new view is opened,
	 * resource is loaded, view is closed. This might not work for some
	 * repositories. Alternatively, you should open your view by yourself and
	 * use getRepository(view, resource) instead!
	 * 
	 * @param resourcePath
	 * @return
	 */
	public EObject getRepository(String resourcePath) {
		CDOResource resource = getResource(resourcePath);
		return getRepository(resource);
	}

	/**
	 * Get repository by resourcePath. The connection is used for getting the
	 * resource form the cdo server. Please specify either a CDOView or a
	 * CDOTransaction, depending if you want to read-only or read/write.
	 * 
	 * @param connection
	 * @param resourcePath
	 * @return the resource, null if non-existent.
	 */
	public EObject getRepository(CDOView connection, String resourcePath) {
		try {
			CDOResource resource = getResource(connection, resourcePath);
			return getRepository(resource);
		} catch (Exception x) {
			return null;
		}
	}

	/**
	 * Get Repository from a CDOResource. CACTOS defines one root element for
	 * each resource as Repository. This methods simply gets the first element
	 * (EObject) from a resource.
	 * 
	 * @param resource
	 * @return
	 */
	private EObject getRepository(CDOResource resource) {
		EList<EObject> contents = resource.getContents();
		if (contents.isEmpty())
			throw new RuntimeException("Cannot read repository from CDOResource since the Resource has no content!");
		EObject repository = contents.get(0);
		return repository;
	}

	/**
	 * Close a previously opened connection (transaction or view)
	 * 
	 * @param connection
	 */
	public void closeConnection(CDOView connection) {
		if(connection != null)
			connection.close();
	}

	public void commitAndCloseConnection(CDOTransaction connection) throws ConcurrentAccessException, CommitException {
		CDOCommitInfo info = connection.commit();
		log.info("commit: " + info);
		connection.close();
	}
	
	public synchronized void printOpenConnections(String moreInfo) {
		session.printOpenConnections(this, moreInfo);
	}
	
	public static CactosCdoSession createSession(IPasswordCredentialsProvider credentialsProvider, String repoName, String endpoint, Dictionary<String, ?> properties) {
		CactosCdoSession cactosCdoSession = new CactosCdoSession(properties, credentialsProvider, repoName, endpoint);
		log.info("New CactosCdoSession created for user " + credentialsProvider.getCredentials() + ", " + cactosCdoSession.getSessionString() + ", CactosCdoSession: " + cactosCdoSession);
		return cactosCdoSession;
	}

	private String getSessionString() {
		return session.getSessionString();
	}
}
