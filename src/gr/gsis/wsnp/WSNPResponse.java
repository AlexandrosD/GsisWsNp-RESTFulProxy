package gr.gsis.wsnp;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="WSNPResponse")
public class WSNPResponse {
	@XmlElement
	public RgWsBasStoixNRtUser pBasStoixNRecOut;
	
	@XmlElement
	public BigDecimal pCallSeqIdOut;
	
	@XmlElement
	public GenWsErrorRtUser pErrorRecOut;

}
