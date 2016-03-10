
package com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for mpanCardMetaUpdateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mpanCardMetaUpdateRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mpanId" type="{http://ws.tsm.cup.com/}panIDType"/>
 *         &lt;element name="operationReason" type="{http://ws.tsm.cup.com/}operationReasonType"/>
 *         &lt;element name="newSpan" type="{http://ws.tsm.cup.com/}panType" minOccurs="0"/>
 *         &lt;element name="mpanCardMetaData" type="{http://ws.tsm.cup.com/}cardMetaDataType" minOccurs="0"/>
 *         &lt;element name="spanExpiryDate" type="{http://ws.tsm.cup.com/}expiryDateType" minOccurs="0"/>
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
@XmlType(name = "mpanCardMetaUpdateRequest", propOrder = {
    "mpanId",
    "operationReason",
    "newSpan",
    "mpanCardMetaData",
    "spanExpiryDate",
    "mac"
})
public class MpanCardMetaUpdateRequest {

    @XmlElement(required = true)
    protected String mpanId;
    @XmlElement(required = true)
    protected String operationReason;
    protected String newSpan;
    protected CardMetaDataType mpanCardMetaData;
    protected String spanExpiryDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] mac;

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
     * Gets the value of the operationReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationReason() {
        return operationReason;
    }

    /**
     * Sets the value of the operationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationReason(String value) {
        this.operationReason = value;
    }

    /**
     * Gets the value of the newSpan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSpan() {
        return newSpan;
    }

    /**
     * Sets the value of the newSpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSpan(String value) {
        this.newSpan = value;
    }

    /**
     * Gets the value of the mpanCardMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link CardMetaDataType }
     *     
     */
    public CardMetaDataType getMpanCardMetaData() {
        return mpanCardMetaData;
    }

    /**
     * Sets the value of the mpanCardMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardMetaDataType }
     *     
     */
    public void setMpanCardMetaData(CardMetaDataType value) {
        this.mpanCardMetaData = value;
    }

    /**
     * Gets the value of the spanExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpanExpiryDate() {
        return spanExpiryDate;
    }

    /**
     * Sets the value of the spanExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpanExpiryDate(String value) {
        this.spanExpiryDate = value;
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
