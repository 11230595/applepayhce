
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
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PAN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ApplyDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ActivateDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ValidateLUKCount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TokenPAN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Locked" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Lost" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DeviceModel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DeviceSN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OsType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OsVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DeviceID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IMEI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WalletName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WalletSignature" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WalletVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "userId",
    "userName",
    "idType",
    "idValue",
    "email",
    "pan",
    "applyDate",
    "activateDate",
    "validateLUKCount",
    "tokenPAN",
    "expireDate",
    "status",
    "locked",
    "lost",
    "deviceModel",
    "deviceSN",
    "osType",
    "osVersion",
    "deviceID",
    "imei",
    "walletName",
    "walletSignature",
    "walletVersion"
})
@XmlRootElement(name = "HceCardInfo", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/")
public class HceCardInfo {

    @XmlElement(name = "UserId", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String userId;
    @XmlElement(name = "UserName", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String userName;
    @XmlElement(name = "IDType", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String idType;
    @XmlElement(name = "IDValue", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String idValue;
    @XmlElement(name = "Email", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String email;
    @XmlElement(name = "PAN", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String pan;
    @XmlElement(name = "ApplyDate", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String applyDate;
    @XmlElement(name = "ActivateDate", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String activateDate;
    @XmlElement(name = "ValidateLUKCount", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String validateLUKCount;
    @XmlElement(name = "TokenPAN", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String tokenPAN;
    @XmlElement(name = "ExpireDate", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String expireDate;
    @XmlElement(name = "Status", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String status;
    @XmlElement(name = "Locked", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String locked;
    @XmlElement(name = "Lost", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String lost;
    @XmlElement(name = "DeviceModel", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String deviceModel;
    @XmlElement(name = "DeviceSN", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String deviceSN;
    @XmlElement(name = "OsType", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String osType;
    @XmlElement(name = "OsVersion", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String osVersion;
    @XmlElement(name = "DeviceID", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String deviceID;
    @XmlElement(name = "IMEI", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String imei;
    @XmlElement(name = "WalletName", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String walletName;
    @XmlElement(name = "WalletSignature", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String walletSignature;
    @XmlElement(name = "WalletVersion", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String walletVersion;

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
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
     * Gets the value of the applyDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyDate() {
        return applyDate;
    }

    /**
     * Sets the value of the applyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyDate(String value) {
        this.applyDate = value;
    }

    /**
     * Gets the value of the activateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivateDate() {
        return activateDate;
    }

    /**
     * Sets the value of the activateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivateDate(String value) {
        this.activateDate = value;
    }

    /**
     * Gets the value of the validateLUKCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidateLUKCount() {
        return validateLUKCount;
    }

    /**
     * Sets the value of the validateLUKCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidateLUKCount(String value) {
        this.validateLUKCount = value;
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
     * Gets the value of the expireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpireDate(String value) {
        this.expireDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the locked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocked() {
        return locked;
    }

    /**
     * Sets the value of the locked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocked(String value) {
        this.locked = value;
    }

    /**
     * Gets the value of the lost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLost() {
        return lost;
    }

    /**
     * Sets the value of the lost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLost(String value) {
        this.lost = value;
    }

    /**
     * Gets the value of the deviceModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceModel() {
        return deviceModel;
    }

    /**
     * Sets the value of the deviceModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceModel(String value) {
        this.deviceModel = value;
    }

    /**
     * Gets the value of the deviceSN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceSN() {
        return deviceSN;
    }

    /**
     * Sets the value of the deviceSN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceSN(String value) {
        this.deviceSN = value;
    }

    /**
     * Gets the value of the osType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOsType() {
        return osType;
    }

    /**
     * Sets the value of the osType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOsType(String value) {
        this.osType = value;
    }

    /**
     * Gets the value of the osVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * Sets the value of the osVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOsVersion(String value) {
        this.osVersion = value;
    }

    /**
     * Gets the value of the deviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceID() {
        return deviceID;
    }

    /**
     * Sets the value of the deviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceID(String value) {
        this.deviceID = value;
    }

    /**
     * Gets the value of the imei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMEI() {
        return imei;
    }

    /**
     * Sets the value of the imei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMEI(String value) {
        this.imei = value;
    }

    /**
     * Gets the value of the walletName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalletName() {
        return walletName;
    }

    /**
     * Sets the value of the walletName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalletName(String value) {
        this.walletName = value;
    }

    /**
     * Gets the value of the walletSignature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalletSignature() {
        return walletSignature;
    }

    /**
     * Sets the value of the walletSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalletSignature(String value) {
        this.walletSignature = value;
    }

    /**
     * Gets the value of the walletVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalletVersion() {
        return walletVersion;
    }

    /**
     * Sets the value of the walletVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalletVersion(String value) {
        this.walletVersion = value;
    }

}
