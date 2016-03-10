
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
 *         &lt;element name="ImageId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PanExpire" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CardExpire" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "imageId",
    "cardHolderName",
    "panExpire",
    "cardExpire"
})
@XmlRootElement(name = "ApplyResponse", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/")
public class ApplyResponse {

    @XmlElement(name = "ImageId", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String imageId;
    @XmlElement(name = "CardHolderName", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String cardHolderName;
    @XmlElement(name = "PanExpire", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String panExpire;
    @XmlElement(name = "CardExpire", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String cardExpire;

    /**
     * Gets the value of the imageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * Sets the value of the imageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageId(String value) {
        this.imageId = value;
    }

    /**
     * Gets the value of the cardHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * Sets the value of the cardHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderName(String value) {
        this.cardHolderName = value;
    }

    /**
     * Gets the value of the panExpire property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPanExpire() {
        return panExpire;
    }

    /**
     * Sets the value of the panExpire property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPanExpire(String value) {
        this.panExpire = value;
    }

    /**
     * Gets the value of the cardExpire property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardExpire() {
        return cardExpire;
    }

    /**
     * Sets the value of the cardExpire property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardExpire(String value) {
        this.cardExpire = value;
    }

}
