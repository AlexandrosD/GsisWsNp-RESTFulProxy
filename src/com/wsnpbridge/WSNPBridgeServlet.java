package com.wsnpbridge;
import gr.gsis.wsnp.WSNPProxy;
import gr.gsis.wsnp.WSNPResponse;
import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/afm")
public class WSNPBridgeServlet{
	private final static Logger logger = Logger.getLogger(WSNPBridgeServlet.class.getName());
	WSNPProxy proxy;
	
	public WSNPBridgeServlet(){
		proxy = new WSNPProxy("https://www1.gsis.gr/wsgsis/RgWsBasStoixN/RgWsBasStoixNSoapHttpPort");
	}
	
	/**
	 * This method calls the 'rgWsBasStoixN' service in 
	 * order to retrieve the details of a non physical person
	 * taking its AFM as parameter
	 * Target URI is /{afm} as defined by @Path
	 * 
	 * @return WSNPResponse as JSON representation
	 */
	@GET
	@Path("/{afm}")
	@Produces("application/json; charset=UTF-8")
	public WSNPResponse getDetails(@PathParam("afm")String afm){
		WSNPResponse response  = proxy.rgWsBasStoixN(afm);
		logger.info("AFM: " + afm + " - Onomasia: " + response.pBasStoixNRecOut.getOnomasia());		
		return response;
	}
	
	/**
	 * This method calls the 'rgWsBasStoixNVersionInfo' service in 
	 * order to retrieve the version of the WebService.
	 * Target URI is /version as defined by @Path
	 * 
	 * @return String
	 */
	@GET
	@Path("/version")
	public String getVersion() {
		String version = proxy.rgWsBasStoixNVersionInfo();
		logger.info("Service Version: " + version);
		return version;
	}
}
