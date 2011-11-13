/**
 * Copyright 2011 DALLAS Alexandros
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

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
