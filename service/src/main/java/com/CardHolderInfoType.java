
package com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cardHolderInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cardHolderInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cardHolderName" type="{http://ws.tsm.cup.com/}cardHolderNameType" minOccurs="0"/>
 *         &lt;element name="cardHolderIdType" type="{http://ws.tsm.cup.com/}cardHolderIdTypeType" minOccurs="0"/>
 *         &lt;element name="cardHolderIdNo" type="{http://ws.tsm.cup.com/}cardHolderIdNoType" minOccurs="0"/>
 *         &lt;element name="msisdn" type="{http://ws.tsm.cup.com/}msisdnType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cardHolderInfoType", propOrder = {
    "cardHolderName",
    "cardHolderIdType",
    "cardHolderIdNo",
    "msisdn"
})
public class CardHolderInfoType {

    protected String cardHolderName;
    protected String cardHolderIdType;
    protected String cardHolderIdNo;
    protected String msisdn;

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
     * Gets the value of the cardHolderIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderIdType() {
        return cardHolderIdType;
    }

    /**
     * Sets the value of the cardHolderIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderIdType(String value) {
        this.cardHolderIdType = value;
    }

    /**
     * Gets the value of the cardHolderIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderIdNo() {
        return cardHolderIdNo;
    }

    /**
     * Sets the value of the cardHolderIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderIdNo(String value) {
        this.cardHolderIdNo = value;
    }

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
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
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

}
