
package com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for mappingInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mappingInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="span" type="{http://ws.tsm.cup.com/}panType"/>
 *         &lt;element name="spanId" type="{http://ws.tsm.cup.com/}panIDType"/>
 *         &lt;element name="mpan" type="{http://ws.tsm.cup.com/}panType"/>
 *         &lt;element name="mpanId" type="{http://ws.tsm.cup.com/}panIDType"/>
 *         &lt;element name="seId" type="{http://ws.tsm.cup.com/}seIdType"/>
 *         &lt;element name="mappingStatus" type="{http://ws.tsm.cup.com/}mappingStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mappingInfoType", propOrder = {
    "span",
    "spanId",
    "mpan",
    "mpanId",
    "seId",
    "mappingStatus"
})
public class MappingInfoType {

    @XmlElement(required = true)
    protected String span;
    @XmlElement(required = true)
    protected String spanId;
    @XmlElement(required = true)
    protected String mpan;
    @XmlElement(required = true)
    protected String mpanId;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] seId;
    @XmlElement(required = true)
    protected String mappingStatus;

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
     * Gets the value of the spanId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpanId() {
        return spanId;
    }

    /**
     * Sets the value of the spanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpanId(String value) {
        this.spanId = value;
    }

    /**
     * Gets the value of the mpan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpan() {
        return mpan;
    }

    /**
     * Sets the value of the mpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpan(String value) {
        this.mpan = value;
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

}
