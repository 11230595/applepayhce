
package com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for mpanApplyExceptionNotifyRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mpanApplyExceptionNotifyRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seId" type="{http://ws.tsm.cup.com/}seIdType"/>
 *         &lt;element name="span" type="{http://ws.tsm.cup.com/}panType"/>
 *         &lt;element name="applyExceptionResult" type="{http://ws.tsm.cup.com/}applyProcessResultType"/>
 *         &lt;element name="exceptionResultReason" type="{http://ws.tsm.cup.com/}operationReasonType" minOccurs="0"/>
 *         &lt;element name="applyChannel" type="{http://ws.tsm.cup.com/}applyChannelType" minOccurs="0"/>
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
@XmlType(name = "mpanApplyExceptionNotifyRequest", propOrder = {
    "seId",
    "span",
    "applyExceptionResult",
    "exceptionResultReason",
    "applyChannel",
    "mac"
})
public class MpanApplyExceptionNotifyRequest {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] seId;
    @XmlElement(required = true)
    protected String span;
    @XmlElement(required = true)
    protected String applyExceptionResult;
    protected String exceptionResultReason;
    protected String applyChannel;
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
     * Gets the value of the span property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpan() {
        return span;
    }

    /**
     * Sets the value of the span property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpan(String value) {
        this.span = value;
    }

    /**
     * Gets the value of the applyExceptionResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyExceptionResult() {
        return applyExceptionResult;
    }

    /**
     * Sets the value of the applyExceptionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyExceptionResult(String value) {
        this.applyExceptionResult = value;
    }

    /**
     * Gets the value of the exceptionResultReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionResultReason() {
        return exceptionResultReason;
    }

    /**
     * Sets the value of the exceptionResultReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionResultReason(String value) {
        this.exceptionResultReason = value;
    }

    /**
     * Gets the value of the applyChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyChannel() {
        return applyChannel;
    }

    /**
     * Sets the value of the applyChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyChannel(String value) {
        this.applyChannel = value;
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
