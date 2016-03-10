
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
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MSISDN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PAN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ValidDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CVN2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PIN" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "userID",
    "name",
    "idType",
    "idValue",
    "msisdn",
    "email",
    "pan",
    "validDate",
    "cvn2",
    "pin"
})
@XmlRootElement(name = "ApplyInfo", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/")
public class ApplyInfo {

    @XmlElement(name = "UserID", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String userID;
    @XmlElement(name = "Name", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String name;
    @XmlElement(name = "IDType", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String idType;
    @XmlElement(name = "IDValue", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String idValue;
    @XmlElement(name = "MSISDN", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String msisdn;
    @XmlElement(name = "Email", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String email;
    @XmlElement(name = "PAN", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String pan;
    @XmlElement(name = "ValidDate", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String validDate;
    @XmlElement(name = "CVN2", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String cvn2;
    @XmlElement(name = "PIN", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String pin;

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDType(String value) {
        this.idType = value;
    }

    /**
     * Gets the value of the idValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDValue() {
        return idValue;
    }

    /**
     * Sets the value of the idValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDValue(String value) {
        this.idValue = value;
    }

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSISDN() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSISDN(String value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the pan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAN() {
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
    public void setPAN(String value) {
        this.pan = value;
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

    /**
     * Gets the value of the cvn2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVN2() {
        return cvn2;
    }

    /**
     * Sets the value of the cvn2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVN2(String value) {
        this.cvn2 = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIN() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIN(String value) {
        this.pin = value;
    }

}
