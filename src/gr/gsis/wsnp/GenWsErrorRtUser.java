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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenWsErrorRtUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenWsErrorRtUser">
 *   &lt;complexContent>
 *     &lt;extension base="{http://gr/gsis/rgwsbasstoixn/RgWsBasStoixN.wsdl/types/}GenWsErrorRtBase">
 *       &lt;sequence>
 *         &lt;element name="errorDescr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenWsErrorRtUser", propOrder = {
    "errorDescr",
    "errorCode"
})
public class GenWsErrorRtUser
    extends GenWsErrorRtBase
{

    @XmlElement(required = true, nillable = true)
    protected String errorDescr;
    @XmlElement(required = true, nillable = true)
    protected String errorCode;

    /**
     * Gets the value of the errorDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDescr() {
        return errorDescr;
    }

    /**
     * Sets the value of the errorDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDescr(String value) {
        this.errorDescr = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

}
