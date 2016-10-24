package eu.cactosfp7.ossession;

import java.util.Dictionary;
public class OsSettings {

	
	
	private static final String OS_ENDPOINT = "os_endpoint";
	private static final String OS_USER = "os_user";
	private static final String OS_PASS = "os_pass";
	private static final String OS_TENANT = "os_tenant";
	private static final String OS_ENDPOINT_AS_PROXY = "os_endpoint_as_proxy";
	
	private Dictionary<String, ?> properties;
	
	public OsSettings(Dictionary<String, ?> _properties){
		properties = _properties;
	}
	
	public String getEndpoint(){
		return (String)properties.get(OS_ENDPOINT);
	}
	
	public String getEndpointAsProxy(){
		return (String)properties.get(OS_ENDPOINT_AS_PROXY);
	}	
	
	public String getUser(){
		return (String)properties.get(OS_USER);
	}	
	
	public String getPass(){
		return (String)properties.get(OS_PASS);
	}

	public String getTenant(){
		return (String)properties.get(OS_TENANT);
	}
	
	@Override
	public String toString() {
		return "OsSettings [getEndpoint()=" + getEndpoint() + ", getUser()="
				+ getUser() + ", getTenant()=" + getTenant() + "]";
	}	

	
	
}
