
package com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for riskInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="riskInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="accountScore" type="{http://ws.tsm.cup.com/}accountScoreType" minOccurs="0"/>
 *         &lt;element name="deviceScore" type="{http://ws.tsm.cup.com/}deviceScoreType" minOccurs="0"/>
 *         &lt;element name="sourceIp" type="{http://ws.tsm.cup.com/}sourceIpType" minOccurs="0"/>
 *         &lt;element name="color" type="{http://ws.tsm.cup.com/}colorType" minOccurs="0"/>
 *         &lt;element name="reasonCodes" type="{http://ws.tsm.cup.com/}colorReasonCodeType" minOccurs="0"/>
 *         &lt;element name="deviceType" type="{http://ws.tsm.cup.com/}deviceTypeType" minOccurs="0"/>
 *         &lt;element name="deviceName" type="{http://ws.tsm.cup.com/}deviceNameType" minOccurs="0"/>
 *         &lt;element name="deviceNumber" type="{http://ws.tsm.cup.com/}deviceNumberType" minOccurs="0"/>
 *         &lt;element name="accountIdHash" type="{http://ws.tsm.cup.com/}accountIdHashType" minOccurs="0"/>
 *         &lt;element name="deviceLocation" type="{http://ws.tsm.cup.com/}deviceLocationType" minOccurs="0"/>
 *         &lt;element name="billingAddress" type="{http://ws.tsm.cup.com/}billingAddressType" minOccurs="0"/>
 *         &lt;element name="billingZip" type="{http://ws.tsm.cup.com/}billingZipType" minOccurs="0"/>
 *         &lt;element name="colorStandardsVersion" type="{http://ws.tsm.cup.com/}colorStandardVersionType" minOccurs="0"/>
 *         &lt;element name="cardHolderName" type="{http://ws.tsm.cup.com/}cardHolderNameType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "riskInfoType", propOrder = {

})
public class RiskInfoType {

    protected String accountScore;
    protected String deviceScore;
    protected String sourceIp;
    protected String color;
    protected String reasonCodes;
    protected String deviceType;
    protected String deviceName;
    protected String deviceNumber;
    protected String accountIdHash;
    protected String deviceLocation;
    protected String billingAddress;
    protected String billingZip;
    protected String colorStandardsVersion;
    protected String cardHolderName;

    /**
     * Gets the value of the accountScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountScore() {
        return accountScore;
    }

    /**
     * Sets the value of the accountScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountScore(String value) {
        this.accountScore = value;
    }

    /**
     * Gets the value of the deviceScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceScore() {
        return deviceScore;
    }

    /**
     * Sets the value of the deviceScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceScore(String value) {
        this.deviceScore = value;
    }

    /**
     * Gets the value of the sourceIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceIp() {
        return sourceIp;
    }

    /**
     * Sets the value of the sourceIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceIp(String value) {
        this.sourceIp = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the reasonCodes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCodes() {
        return reasonCodes;
    }

    /**
     * Sets the value of the reasonCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCodes(String value) {
        this.reasonCodes = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceType(String value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the deviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Sets the value of the deviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceName(String value) {
        this.deviceName = value;
    }

    /**
     * Gets the value of the deviceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceNumber() {
        return deviceNumber;
    }

    /**
     * Sets the value of the deviceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceNumber(String value) {
        this.deviceNumber = value;
    }

    /**
     * Gets the value of the accountIdHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountIdHash() {
        return accountIdHash;
    }

    /**
     * Sets the value of the accountIdHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountIdHash(String value) {
        this.accountIdHash = value;
    }

    /**
     * Gets the value of the deviceLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceLocation() {
        return deviceLocation;
    }

    /**
     * Sets the value of the deviceLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceLocation(String value) {
        this.deviceLocation = value;
    }

    /**
     * Gets the value of the billingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAddress(String value) {
        this.billingAddress = value;
    }

    /**
     * Gets the value of the billingZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingZip() {
        return billingZip;
    }

    /**
     * Sets the value of the billingZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingZip(String value) {
        this.billingZip = value;
    }

    /**
     * Gets the value of the colorStandardsVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorStandardsVersion() {
        return colorStandardsVersion;
    }

    /**
     * Sets the value of the colorStandardsVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorStandardsVersion(String value) {
        this.colorStandardsVersion = value;
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

}
