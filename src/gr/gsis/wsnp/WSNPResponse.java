/**
 * Copyright 2011 DALLAS Alexandros (dallas.alexandros@gmail.com)
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

package gr.gsis.wsnp;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Java Class Representation for the rgWsBasStoixN web method response
 * JAXB Annotated in order to be converted to JSON Format by Jersey/JAX-RS
 *
 */

@XmlRootElement(name="WSNPResponse")
public class WSNPResponse {
	@XmlElement
	public RgWsBasStoixNRtUser pBasStoixNRecOut;
	
	@XmlElement
	public BigDecimal pCallSeqIdOut;
	
	@XmlElement
	public GenWsErrorRtUser pErrorRecOut;

}
