
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
 *         &lt;element name="ReferenceOwner" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "referenceOwner",
    "reference"
})
@XmlRootElement(name = "ServiceInstanceReference", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/")
public class ServiceInstanceReference {

    @XmlElement(name = "ReferenceOwner", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String referenceOwner;
    @XmlElement(name = "Reference", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String reference;

    /**
     * Gets the value of the referenceOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceOwner() {
        return referenceOwner;
    }

    /**
     * Sets the value of the referenceOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceOwner(String value) {
        this.referenceOwner = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

}
