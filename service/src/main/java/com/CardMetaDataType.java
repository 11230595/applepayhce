
package com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cardMetaDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cardMetaDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cardArtId" type="{http://ws.tsm.cup.com/}cardArtIdType"/>
 *         &lt;element name="cardHolderName" type="{http://ws.tsm.cup.com/}cardHolderNameType" minOccurs="0"/>
 *         &lt;element name="expiryDate" type="{http://ws.tsm.cup.com/}expiryDateType"/>
 *         &lt;element name="storeIdentifierList" type="{http://ws.tsm.cup.com/}storeIdentifierListType" minOccurs="0"/>
 *         &lt;element name="applicationIdList" type="{http://ws.tsm.cup.com/}applicationIdListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cardMetaDataType", propOrder = {
    "cardArtId",
    "cardHolderName",
    "expiryDate",
    "storeIdentifierList",
    "applicationIdList"
})
public class CardMetaDataType {

    @XmlElement(required = true)
    protected String cardArtId;
    protected String cardHolderName;
    @XmlElement(required = true)
    protected String expiryDate;
    protected StoreIdentifierListType storeIdentifierList;
    protected ApplicationIdListType applicationIdList;

    /**
     * Gets the value of the cardArtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardArtId() {
        return cardArtId;
    }

    /**
     * Sets the value of the cardArtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardArtId(String value) {
        this.cardArtId = value;
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
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the storeIdentifierList property.
     * 
     * @return
     *     possible object is
     *     {@link StoreIdentifierListType }
     *     
     */
    public StoreIdentifierListType getStoreIdentifierList() {
        return storeIdentifierList;
    }

    /**
     * Sets the value of the storeIdentifierList property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreIdentifierListType }
     *     
     */
    public void setStoreIdentifierList(StoreIdentifierListType value) {
        this.storeIdentifierList = value;
    }

    /**
     * Gets the value of the applicationIdList property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationIdListType }
     *     
     */
    public ApplicationIdListType getApplicationIdList() {
        return applicationIdList;
    }

    /**
     * Sets the value of the applicationIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationIdListType }
     *     
     */
    public void setApplicationIdList(ApplicationIdListType value) {
        this.applicationIdList = value;
    }

}
