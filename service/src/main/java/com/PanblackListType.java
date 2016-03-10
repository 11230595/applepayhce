
package com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for panblackListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="panblackListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pan" type="{http://ws.tsm.cup.com/}panType"/>
 *         &lt;element name="blackInvalidTime" type="{http://ws.tsm.cup.com/}blackInvalidTimeType"/>
 *         &lt;element name="blackOperationType" type="{http://ws.tsm.cup.com/}blackOperationTypeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "panblackListType", propOrder = {
    "pan",
    "blackInvalidTime",
    "blackOperationType"
})
public class PanblackListType {

    @XmlElement(required = true)
    protected String pan;
    @XmlElement(required = true)
    protected String blackInvalidTime;
    @XmlElement(required = true)
    protected BlackOperationTypeType blackOperationType;

    /**
     * Gets the value of the pan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPan() {
        return pan;
    }

    /**
     * Sets the value of the pan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPan(String value) {
        this.pan = value;
    }

    /**
     * Gets the value of the blackInvalidTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlackInvalidTime() {
        return blackInvalidTime;
    }

    /**
     * Sets the value of the blackInvalidTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlackInvalidTime(String value) {
        this.blackInvalidTime = value;
    }

    /**
     * Gets the value of the blackOperationType property.
     * 
     * @return
     *     possible object is
     *     {@link BlackOperationTypeType }
     *     
     */
    public BlackOperationTypeType getBlackOperationType() {
        return blackOperationType;
    }

    /**
     * Sets the value of the blackOperationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlackOperationTypeType }
     *     
     */
    public void setBlackOperationType(BlackOperationTypeType value) {
        this.blackOperationType = value;
    }

}
