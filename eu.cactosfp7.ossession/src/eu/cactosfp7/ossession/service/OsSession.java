package eu.cactosfp7.ossession.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openstack4j.api.Apis;
import org.openstack4j.api.OSClient;
import org.openstack4j.api.client.IOSClientBuilder.V2;
import org.openstack4j.api.compute.FlavorService;
import org.openstack4j.model.compute.Flavor;
import org.openstack4j.openstack.OSFactory;

import eu.cactosfp7.ossession.OsSettings;

public class OsSession {
	/** Established OpenStack client connection. */
	private OSClient osClient;
	/** Map for looking up existing flavors. */
	private final Map<String, Flavor> flavors = new HashMap<String, Flavor>();
	private final OsSettings settings;
	private final ClassLoader contextLoader;
	
	public OsSession (OsSettings settings, ClassLoader contextLoader){
		this.settings = settings;
		this.contextLoader = contextLoader;
	}
	
	public OSClient getOsClient(){
		authenticate();
		return osClient;
	}
	
	/**Checks if there is a flavor defined for the given string. 
	 * May cause reloading of flavor definitions from the platform.
	 * @param flavorRef The string representation.
	 * @return The flavor. <code>null</code> if there is no according flavor.
	 */
	public Flavor lookupFlavor(String flavorRef) {
		if (!flavors.containsKey(flavorRef)) {
			List<? extends Flavor> flavors_list = getFlavors();
			// store entries in map
			while (!flavors_list.isEmpty()) {
				Flavor flavor = flavors_list.remove(0);
				flavors.put(flavor.getId(), flavor);
			}
		}
		return flavors.get(flavorRef);
	}
	
	public List<? extends Flavor> getFlavors() {
		authenticate();
		FlavorService flavors = osClient.compute().flavors();
		return flavors.list();
	}
	
	private void authenticate() {
		// login to openstack first
		// switch thread context loader
		Thread thread = Thread.currentThread();
		ClassLoader loader = thread.getContextClassLoader();
		thread.setContextClassLoader(contextLoader);
		try {
			// create session
			V2 v2 = OSFactory.builder();
			v2.endpoint(settings.getEndpoint());
			v2.credentials(settings.getUser(), settings.getPass());
			v2.tenantName(settings.getTenant());
			try {
				osClient = v2.authenticate(); 
			} catch (Exception e){
				throw e;
			}
			// register API provider within class loader context
			Apis.getComputeServices();
		} finally {
		  thread.setContextClassLoader(loader);
		}			
	}

	public String getEndpointAsProxy(){
		return settings.getEndpointAsProxy();
	}
	
	public static OsSession build(OsSettings settings, ClassLoader contextLoader){
		return new OsSession(settings, contextLoader);
	}

}
