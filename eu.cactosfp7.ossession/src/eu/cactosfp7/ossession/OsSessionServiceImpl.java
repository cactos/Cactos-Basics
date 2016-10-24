package eu.cactosfp7.ossession;

import java.util.Dictionary;
import java.util.logging.Logger;

import org.openstack4j.api.Apis;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedService;

import eu.cactosfp7.ossession.service.OsSession;
import eu.cactosfp7.ossession.service.OsSessionService;

public class OsSessionServiceImpl implements OsSessionService, ManagedService {

	private static final Logger logger = Logger.getLogger(OsSessionServiceImpl.class.getName());
	
	/** Session handling access to the OpenStack platform. */
	private OsSession osSession;
	/** Settings used to establish the session. */
	private OsSettings settings;
	/** The context class loader of this bundle. Required to switch context for creation of sessions if within jersey context. */
	private ClassLoader contextLoader;
	
	/**
	 * Take care: call this method only after the configuration params have been read.
	 * TODO implement sth to wait for config data when called too early 
	 */
	@Override
	public OsSession getCactosOsSession() {
		// create an osSession if not available
		if (osSession == null){
			createSession();
		}
		return osSession;
	}

	public void activate() {
		contextLoader = Thread.currentThread().getContextClassLoader();
		logger.info("Class loader: " + Thread.currentThread().getContextClassLoader());
		// intentionally left empty. Creates class with OSGi class loader instead of jersey class loader.
	}

	private final void createSession() {
		logger.info("Class loader: " + Thread.currentThread().getContextClassLoader());
		// switch thread context loader
		Thread thread = Thread.currentThread();
		ClassLoader loader = thread.getContextClassLoader();
		thread.setContextClassLoader(contextLoader);
		try {
			// create session
			logger.info("Creating new session for open-stack platform based on settings.");
			osSession = OsSession.build(settings, contextLoader);
			// register API provider within class loader context
			Apis.getComputeServices();
		} finally {
		  thread.setContextClassLoader(loader);
		}
	}

	/**
	 * Updated by ConfigAdminService when the config file specified in
	 * "OSGI-INF/session.xml" as "service.pid" is changed.
	 */
	@Override
	public void updated(Dictionary<String, ?> properties)
			throws ConfigurationException {
		settings = new OsSettings(properties);
		// Note: contents of properties is not logged as it contains credentials and the log is not necessarily protected.
		logger.info("New session configuration was set.");
	}

}
