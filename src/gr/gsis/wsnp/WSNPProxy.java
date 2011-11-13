package gr.gsis.wsnp;

import java.math.BigDecimal;
import javax.xml.ws.Holder;

public class WSNPProxy {
	
	protected RgWsBasStoixN service;
	protected String endpoint;
	
	public WSNPProxy(String endpoint) {
		service = new RgWsBasStoixN_Service().getRgWsBasStoixNSoapHttpPort();
		((javax.xml.ws.BindingProvider)service).getRequestContext().put(javax.xml.ws.BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);
	}

	public String rgWsBasStoixNVersionInfo() {
		return service.rgWsBasStoixNVersionInfo();
	}
	
	public WSNPResponse rgWsBasStoixN(String afm) {
		// pErrorRecOut
		Holder<GenWsErrorRtUser> pErrorRecOut = new Holder<GenWsErrorRtUser>();
		GenWsErrorRtUser genWsErrorRtUser = new GenWsErrorRtUser();
		pErrorRecOut.value = genWsErrorRtUser;
		
		// pBasStoixNRecOut
		Holder<RgWsBasStoixNRtUser> pBasStoixNRecOut = new Holder<RgWsBasStoixNRtUser>();
		RgWsBasStoixNRtUser rgWsBasStoixNRtUser = new RgWsBasStoixNRtUser();
		rgWsBasStoixNRtUser.setRegistDate("2011-01-01");
		rgWsBasStoixNRtUser.setStopDate("2011-01-01");
		rgWsBasStoixNRtUser.setDeactivationFlag("1");
		rgWsBasStoixNRtUser.setFacActivity(BigDecimal.ZERO);
		pBasStoixNRecOut.value = rgWsBasStoixNRtUser;
		
		// pCallSeqIdOut
		Holder<BigDecimal> pCallSeqIdOut = new Holder<BigDecimal>();
		pCallSeqIdOut.value = BigDecimal.ZERO;
		
		// Fetch the response
		service.rgWsBasStoixN(afm, pBasStoixNRecOut, pCallSeqIdOut, pErrorRecOut);
		WSNPResponse response = new WSNPResponse();
		
		response.pErrorRecOut = pErrorRecOut.value;
		response.pBasStoixNRecOut = pBasStoixNRecOut.value;
		response.pCallSeqIdOut = pCallSeqIdOut.value;
		
		return response;
	}
	
}
