
package com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for cupMpanOperationNotifyRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cupMpanOperationNotifyRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mpanId" type="{http://ws.tsm.cup.com/}panIDType"/>
 *         &lt;element name="mappingStatus" type="{http://ws.tsm.cup.com/}mappingStatusType"/>
 *         &lt;element name="operationChannelId" type="{http://ws.tsm.cup.com/}operationChannelIdType"/>
 *         &lt;element name="operationReason" type="{http://ws.tsm.cup.com/}operationReasonType"/>
 *         &lt;element name="ecashBalance" type="{http://ws.tsm.cup.com/}ecashBalanceType" minOccurs="0"/>
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
@XmlType(name = "cupMpanOperationNotifyRequest", propOrder = {
    "mpanId",
    "mappingStatus",
    "operationChannelId",
    "operationReason",
    "ecashBalance",
    "mac"
})
public class CupMpanOperationNotifyRequest {

    @XmlElement(required = true)
    protected String mpanId;
    @XmlElement(required = true)
    protected String mappingStatus;
    @XmlElement(required = true)
    protected String operationChannelId;
    @XmlElement(required = true)
    protected String operationReason;
    protected String ecashBalance;
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
     * Gets the value of the mappingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMappingStatus() {
        return mappingStatus;
    }

    /**
     * Sets the value of the mappingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMappingStatus(String value) {
        this.mappingStatus = value;
    }

    /**
     * Gets the value of the operationChannelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationChannelId() {
        return operationChannelId;
    }

    /**
     * Sets the value of the operationChannelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationChannelId(String value) {
        this.operationChannelId = value;
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
     * Gets the value of the ecashBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEcashBalance() {
        return ecashBalance;
    }

    /**
     * Sets the value of the ecashBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEcashBalance(String value) {
        this.ecashBalance = value;
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
