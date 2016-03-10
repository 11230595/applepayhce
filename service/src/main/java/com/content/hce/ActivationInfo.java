
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
 *         &lt;element name="TokenPAN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ActivationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "tokenPAN",
    "activationCode"
})
@XmlRootElement(name = "ActivationInfo", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/")
public class ActivationInfo {

    @XmlElement(name = "UserID", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String userID;
    @XmlElement(name = "TokenPAN", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String tokenPAN;
    @XmlElement(name = "ActivationCode", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String activationCode;

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
     * Gets the value of the tokenPAN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenPAN() {
        return tokenPAN;
    }

    /**
     * Sets the value of the tokenPAN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenPAN(String value) {
        this.tokenPAN = value;
    }

    /**
     * Gets the value of the activationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationCode() {
        return activationCode;
    }

    /**
     * Sets the value of the activationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationCode(String value) {
        this.activationCode = value;
    }

}
