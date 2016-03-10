
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
 *         &lt;element name="OrginalPAN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NewPAN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ValidDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "orginalPAN",
    "newPAN",
    "validDate"
})
@XmlRootElement(name = "PanUpdateInfo", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/")
public class PanUpdateInfo {

    @XmlElement(name = "OrginalPAN", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String orginalPAN;
    @XmlElement(name = "NewPAN", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String newPAN;
    @XmlElement(name = "ValidDate", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String validDate;

    /**
     * Gets the value of the orginalPAN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrginalPAN() {
        return orginalPAN;
    }

    /**
     * Sets the value of the orginalPAN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrginalPAN(String value) {
        this.orginalPAN = value;
    }

    /**
     * Gets the value of the newPAN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPAN() {
        return newPAN;
    }

    /**
     * Sets the value of the newPAN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPAN(String value) {
        this.newPAN = value;
    }

    /**
     * Gets the value of the validDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidDate() {
        return validDate;
    }

    /**
     * Sets the value of the validDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidDate(String value) {
        this.validDate = value;
    }

}
