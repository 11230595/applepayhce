
package com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for triggerOtpRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="triggerOtpRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seId" type="{http://ws.tsm.cup.com/}seIdType"/>
 *         &lt;element name="mpanId" type="{http://ws.tsm.cup.com/}panIDType"/>
 *         &lt;element name="msisdn" type="{http://ws.tsm.cup.com/}msisdnType" minOccurs="0"/>
 *         &lt;element name="otpResolutionId" type="{http://ws.tsm.cup.com/}otpResolutionIdType"/>
 *         &lt;element name="mac" type="{http://ws.tsm.cup.com/}macType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "triggerOtpRequest", propOrder = {
    "seId",
    "mpanId",
    "msisdn",
    "otpResolutionId",
    "mac"
})
public class TriggerOtpRequest {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] seId;
    @XmlElement(required = true)
    protected String mpanId;
    protected String msisdn;
    @XmlElement(required = true)
    protected String otpResolutionId;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] mac;

    /**
     * Gets the value of the seId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getSeId() {
        return seId;
    }

    /**
     * Sets the value of the seId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeId(byte[] value) {
        this.seId = value;
    }

    /**
     * Gets the value of the mpanId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpanId() {
        return mpanId;
    }

    /**
     * Sets the value of the mpanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpanId(String value) {
        this.mpanId = value;
    }

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
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
     * Gets the value of the mac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getMac() {
        return mac;
    }

    /**
     * Sets the value of the mac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMac(byte[] value) {
        this.mac = value;
    }

}
