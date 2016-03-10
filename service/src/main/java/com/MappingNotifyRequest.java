
package com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for mappingNotifyRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mappingNotifyRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seId" type="{http://ws.tsm.cup.com/}seIdType"/>
 *         &lt;element name="mappingInfo" type="{http://ws.tsm.cup.com/}mappingInfoType"/>
 *         &lt;element name="mpanPersoResult" type="{http://ws.tsm.cup.com/}operationResultType" minOccurs="0"/>
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
@XmlType(name = "mappingNotifyRequest", propOrder = {
    "seId",
    "mappingInfo",
    "mpanPersoResult",
    "mac"
})
public class MappingNotifyRequest {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] seId;
    @XmlElement(required = true)
    protected MappingInfoType mappingInfo;
    protected String mpanPersoResult;
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
     * Gets the value of the mpanPersoResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpanPersoResult() {
        return mpanPersoResult;
    }

    /**
     * Sets the value of the mpanPersoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpanPersoResult(String value) {
        this.mpanPersoResult = value;
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
