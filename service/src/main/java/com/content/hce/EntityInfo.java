
package com.content.hce;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EntityType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OperationReason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "entityType",
    "value",
    "operationReason"
})
@XmlRootElement(name = "EntityInfo", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/")
public class EntityInfo {

    @XmlElement(name = "EntityType", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String entityType;
    @XmlElement(name = "Value", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String value;
    @XmlElement(name = "OperationReason", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String operationReason;

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityType(String value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
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

}
