
package com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for mappingInquiryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mappingInquiryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://ws.tsm.cup.com/}statusType"/>
 *         &lt;element name="mappingInfo" type="{http://ws.tsm.cup.com/}mappingInfoType" minOccurs="0"/>
 *         &lt;element name="operationChannelId" type="{http://ws.tsm.cup.com/}operationChannelIdType" minOccurs="0"/>
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
@XmlType(name = "mappingInquiryResponse", propOrder = {
    "status",
    "mappingInfo",
    "operationChannelId",
    "mac"
})
public class MappingInquiryResponse {

    @XmlElement(required = true)
    protected StatusType status;
    protected MappingInfoType mappingInfo;
    protected String operationChannelId;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] mac;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the mappingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MappingInfoType }
     *     
     */
    public MappingInfoType getMappingInfo() {
        return mappingInfo;
    }

    /**
     * Sets the value of the mappingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MappingInfoType }
     *     
     */
    public void setMappingInfo(MappingInfoType value) {
        this.mappingInfo = value;
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
