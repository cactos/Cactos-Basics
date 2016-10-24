package eu.cactosfp7.ossessionclient;

import java.util.logging.Logger;

import eu.cactosfp7.ossession.service.OsSessionService;

public final class OsSessionClient {
	
	public static OsSessionClient INSTANCE;
	
	// Class is meant to be a singleton. I would prefer using an enum.
	// Unfortunately OSGi DS cannot use enums.
	public OsSessionClient(){
		if(INSTANCE != null)
			throw new RuntimeException("Instantiating new OsSessionClient is not allowed!");
		INSTANCE = this;
	}
	
	private static final Logger logger = Logger.getLogger(OsSessionClient.class.getName());
	private OsSessionService service;
	
	/**Bind method for discovered service.
	 * @param service The discovered service.
	 */
	public synchronized void bindService(OsSessionService _service) {
		service = _service;
		logger.info("OsSessionService connected.");
	}
	
	/**Unbind method for discovered service.
	 * @param service The removed service.
	 */
	public synchronized void unbindService(OsSessionService _service) {
		service = null;
		logger.info("OsSessionService disconnected.");
	} 
	
	public OsSessionService getService(){
		if(service == null)
			throw new RuntimeException("OsSessionService unbound.");
		return service;
	}
	
}
