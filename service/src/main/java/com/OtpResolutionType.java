
package com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for otpResolutionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="otpResolutionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="otpType" type="{http://ws.tsm.cup.com/}otpTypeType"/>
 *         &lt;element name="otpResolutionValue" type="{http://ws.tsm.cup.com/}otpResolutionValueType"/>
 *         &lt;element name="otpResolutionId" type="{http://ws.tsm.cup.com/}otpResolutionIdType"/>
 *         &lt;element name="otpSourceAddress" type="{http://ws.tsm.cup.com/}otpSourceAddressType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "otpResolutionType", propOrder = {
    "otpType",
    "otpResolutionValue",
    "otpResolutionId",
    "otpSourceAddress"
})
public class OtpResolutionType {

    @XmlElement(required = true)
    protected String otpType;
    @XmlElement(required = true)
    protected String otpResolutionValue;
    @XmlElement(required = true)
    protected String otpResolutionId;
    protected String otpSourceAddress;

    /**
     * Gets the value of the otpType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtpType() {
        return otpType;
    }

    /**
     * Sets the value of the otpType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtpType(String value) {
        this.otpType = value;
    }

    /**
     * Gets the value of the otpResolutionValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtpResolutionValue() {
        return otpResolutionValue;
    }

    /**
     * Sets the value of the otpResolutionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtpResolutionValue(String value) {
        this.otpResolutionValue = value;
    }

    /**
     * Gets the value of the otpResolutionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtpResolutionId() {
        return otpResolutionId;
    }

    /**
     * Sets the value of the otpResolutionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtpResolutionId(String value) {
        this.otpResolutionId = value;
    }

    /**
     * Gets the value of the otpSourceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtpSourceAddress() {
        return otpSourceAddress;
    }

    /**
     * Sets the value of the otpSourceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtpSourceAddress(String value) {
        this.otpSourceAddress = value;
    }

}
