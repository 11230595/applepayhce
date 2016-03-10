
package com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for transactionNotifyRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transactionNotifyRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="spanId" type="{http://ws.tsm.cup.com/}panIDType" minOccurs="0"/>
 *         &lt;element name="mPanId" type="{http://ws.tsm.cup.com/}panIDType" minOccurs="0"/>
 *         &lt;element name="transactionId" type="{http://ws.tsm.cup.com/}transactionIdType" minOccurs="0"/>
 *         &lt;element name="transactionType" type="{http://ws.tsm.cup.com/}transactionTypeType"/>
 *         &lt;element name="transactionDate" type="{http://ws.tsm.cup.com/}transactionDateType"/>
 *         &lt;element name="currencyCode" type="{http://ws.tsm.cup.com/}currencyCodeType"/>
 *         &lt;element name="transactionAmount" type="{http://ws.tsm.cup.com/}transactionAmountType"/>
 *         &lt;element name="transactionStatus" type="{http://ws.tsm.cup.com/}transactionStatusType"/>
 *         &lt;element name="merchantName" type="{http://ws.tsm.cup.com/}merchantNameType"/>
 *         &lt;element name="rawMerchantName" type="{http://ws.tsm.cup.com/}rawMerchantNameType" minOccurs="0"/>
 *         &lt;element name="industryCategory" type="{http://ws.tsm.cup.com/}industryCategoryType" minOccurs="0"/>
 *         &lt;element name="industryCode" type="{http://ws.tsm.cup.com/}industryCodeType" minOccurs="0"/>
 *         &lt;element name="geolocation" type="{http://ws.tsm.cup.com/}deviceLocationType" minOccurs="0"/>
 *         &lt;element name="mac" type="{http://ws.tsm.cup.com/}macType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transactionNotifyRequest", propOrder = {
    "spanId",
    "mPanId",
    "transactionId",
    "transactionType",
    "transactionDate",
    "currencyCode",
    "transactionAmount",
    "transactionStatus",
    "merchantName",
    "rawMerchantName",
    "industryCategory",
    "industryCode",
    "geolocation",
    "mac"
})
public class TransactionNotifyRequest {

    protected String spanId;
    protected String mPanId;
    protected String transactionId;
    @XmlElement(required = true)
    protected TransactionTypeType transactionType;
    @XmlElement(required = true)
    protected String transactionDate;
    @XmlElement(required = true)
    protected String currencyCode;
    @XmlElement(required = true)
    protected String transactionAmount;
    @XmlElement(required = true)
    protected TransactionStatusType transactionStatus;
    @XmlElement(required = true)
    protected String merchantName;
    protected String rawMerchantName;
    protected String industryCategory;
    protected String industryCode;
    protected String geolocation;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] mac;

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
     * Gets the value of the mPanId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMPanId() {
        return mPanId;
    }

    /**
     * Sets the value of the mPanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMPanId(String value) {
        this.mPanId = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionTypeType }
     *     
     */
    public TransactionTypeType getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionTypeType }
     *     
     */
    public void setTransactionType(TransactionTypeType value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDate(String value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the transactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Sets the value of the transactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionAmount(String value) {
        this.transactionAmount = value;
    }

    /**
     * Gets the value of the transactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatusType }
     *     
     */
    public TransactionStatusType getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * Sets the value of the transactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatusType }
     *     
     */
    public void setTransactionStatus(TransactionStatusType value) {
        this.transactionStatus = value;
    }

    /**
     * Gets the value of the merchantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * Sets the value of the merchantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantName(String value) {
        this.merchantName = value;
    }

    /**
     * Gets the value of the rawMerchantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRawMerchantName() {
        return rawMerchantName;
    }

    /**
     * Sets the value of the rawMerchantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRawMerchantName(String value) {
        this.rawMerchantName = value;
    }

    /**
     * Gets the value of the industryCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryCategory() {
        return industryCategory;
    }

    /**
     * Sets the value of the industryCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryCategory(String value) {
        this.industryCategory = value;
    }

    /**
     * Gets the value of the industryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryCode() {
        return industryCode;
    }

    /**
     * Sets the value of the industryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryCode(String value) {
        this.industryCode = value;
    }

    /**
     * Gets the value of the geolocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeolocation() {
        return geolocation;
    }

    /**
     * Sets the value of the geolocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeolocation(String value) {
        this.geolocation = value;
    }

    /**
     * Gets the value of the mac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getMac() {
        return mac;
    }

    /**
     * Sets the value of the mac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMac(byte[] value) {
        this.mac = value;
    }

}
