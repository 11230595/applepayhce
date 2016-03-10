
package com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for mpanApplyRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mpanApplyRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seId" type="{http://ws.tsm.cup.com/}seIdType"/>
 *         &lt;element name="seType" type="{http://ws.tsm.cup.com/}seTypeType"/>
 *         &lt;element name="seIssuer" type="{http://ws.tsm.cup.com/}seIssuerType"/>
 *         &lt;element name="applyChannel" type="{http://ws.tsm.cup.com/}applyChannelType"/>
 *         &lt;element name="instanceAid" type="{http://ws.tsm.cup.com/}appAidType" minOccurs="0"/>
 *         &lt;element name="accountInfo" type="{http://ws.tsm.cup.com/}accountInfoType"/>
 *         &lt;element name="cardHolderInfo" type="{http://ws.tsm.cup.com/}cardHolderInfoType" minOccurs="0"/>
 *         &lt;element name="bankChannelData" type="{http://ws.tsm.cup.com/}bankDefinedDataType" minOccurs="0"/>
 *         &lt;element name="termAndConditionInfo" type="{http://ws.tsm.cup.com/}termAndConditionInfoType" minOccurs="0"/>
 *         &lt;element name="riskInfo" type="{http://ws.tsm.cup.com/}riskInfoType" minOccurs="0"/>
 *         &lt;element name="casdCertInfo" type="{http://ws.tsm.cup.com/}casdCertInfoType" minOccurs="0"/>
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
@XmlType(name = "mpanApplyRequest", propOrder = {
    "seId",
    "seType",
    "seIssuer",
    "applyChannel",
    "instanceAid",
    "accountInfo",
    "cardHolderInfo",
    "bankChannelData",
    "termAndConditionInfo",
    "riskInfo",
    "casdCertInfo",
    "mac"
})
public class MpanApplyRequest {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] seId;
    @XmlElement(required = true)
    protected String seType;
    @XmlElement(required = true)
    protected String seIssuer;
    @XmlElement(required = true)
    protected String applyChannel;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] instanceAid;
    @XmlElement(required = true)
    protected AccountInfoType accountInfo;
    protected CardHolderInfoType cardHolderInfo;
    protected String bankChannelData;
    protected TermAndConditionInfoType termAndConditionInfo;
    protected RiskInfoType riskInfo;
    protected String casdCertInfo;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] mac;

    /**
     * Gets the value of the seId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getSeId() {
        return seId;
    }

    /**
     * Sets the value of the seId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeId(byte[] value) {
        this.seId = value;
    }

    /**
     * Gets the value of the seType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeType() {
        return seType;
    }

    /**
     * Sets the value of the seType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeType(String value) {
        this.seType = value;
    }

    /**
     * Gets the value of the seIssuer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeIssuer() {
        return seIssuer;
    }

    /**
     * Sets the value of the seIssuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeIssuer(String value) {
        this.seIssuer = value;
    }

    /**
     * Gets the value of the applyChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyChannel() {
        return applyChannel;
    }

    /**
     * Sets the value of the applyChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyChannel(String value) {
        this.applyChannel = value;
    }

    /**
     * Gets the value of the instanceAid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getInstanceAid() {
        return instanceAid;
    }

    /**
     * Sets the value of the instanceAid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceAid(byte[] value) {
        this.instanceAid = value;
    }

    /**
     * Gets the value of the accountInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AccountInfoType }
     *     
     */
    public AccountInfoType getAccountInfo() {
        return accountInfo;
    }

    /**
     * Sets the value of the accountInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountInfoType }
     *     
     */
    public void setAccountInfo(AccountInfoType value) {
        this.accountInfo = value;
    }

    /**
     * Gets the value of the cardHolderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CardHolderInfoType }
     *     
     */
    public CardHolderInfoType getCardHolderInfo() {
        return cardHolderInfo;
    }

    /**
     * Sets the value of the cardHolderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardHolderInfoType }
     *     
     */
    public void setCardHolderInfo(CardHolderInfoType value) {
        this.cardHolderInfo = value;
    }

    /**
     * Gets the value of the bankChannelData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankChannelData() {
        return bankChannelData;
    }

    /**
     * Sets the value of the bankChannelData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankChannelData(String value) {
        this.bankChannelData = value;
    }

    /**
     * Gets the value of the termAndConditionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TermAndConditionInfoType }
     *     
     */
    public TermAndConditionInfoType getTermAndConditionInfo() {
        return termAndConditionInfo;
    }

    /**
     * Sets the value of the termAndConditionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermAndConditionInfoType }
     *     
     */
    public void setTermAndConditionInfo(TermAndConditionInfoType value) {
        this.termAndConditionInfo = value;
    }

    /**
     * Gets the value of the riskInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RiskInfoType }
     *     
     */
    public RiskInfoType getRiskInfo() {
        return riskInfo;
    }

    /**
     * Sets the value of the riskInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskInfoType }
     *     
     */
    public void setRiskInfo(RiskInfoType value) {
        this.riskInfo = value;
    }

    /**
     * Gets the value of the casdCertInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCasdCertInfo() {
        return casdCertInfo;
    }

    /**
     * Sets the value of the casdCertInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCasdCertInfo(String value) {
        this.casdCertInfo = value;
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
