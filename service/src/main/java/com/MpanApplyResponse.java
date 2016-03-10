
package com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Arrays;


/**
 * <p>Java class for mpanApplyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mpanApplyResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://ws.tsm.cup.com/}statusType"/>
 *         &lt;element name="mpanId" type="{http://ws.tsm.cup.com/}panIDType" minOccurs="0"/>
 *         &lt;element name="mpanPersoDataInfo" type="{http://ws.tsm.cup.com/}mpanPersoDataInfoType" minOccurs="0"/>
 *         &lt;element name="initQuota" type="{http://ws.tsm.cup.com/}quotaType" minOccurs="0"/>
 *         &lt;element name="mpanCardMetaData" type="{http://ws.tsm.cup.com/}cardMetaDataType" minOccurs="0"/>
 *         &lt;element name="otpResolutionList" type="{http://ws.tsm.cup.com/}otpResolutionListType" minOccurs="0"/>
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
@XmlType(name = "mpanApplyResponse", propOrder = {
    "status",
    "mpanId",
    "mpanPersoDataInfo",
    "initQuota",
    "mpanCardMetaData",
    "otpResolutionList",
    "mac"
})
public class MpanApplyResponse {

    @XmlElement(required = true)
    protected StatusType status;
    protected String mpanId;
    protected MpanPersoDataInfoType mpanPersoDataInfo;
    protected String initQuota;
    protected CardMetaDataType mpanCardMetaData;
    protected OtpResolutionListType otpResolutionList;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] mac;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the mpanId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpanId() {
        return mpanId;
    }

    /**
     * Sets the value of the mpanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpanId(String value) {
        this.mpanId = value;
    }

    /**
     * Gets the value of the mpanPersoDataInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MpanPersoDataInfoType }
     *     
     */
    public MpanPersoDataInfoType getMpanPersoDataInfo() {
        return mpanPersoDataInfo;
    }

    /**
     * Sets the value of the mpanPersoDataInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MpanPersoDataInfoType }
     *     
     */
    public void setMpanPersoDataInfo(MpanPersoDataInfoType value) {
        this.mpanPersoDataInfo = value;
    }

    /**
     * Gets the value of the initQuota property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitQuota() {
        return initQuota;
    }

    /**
     * Sets the value of the initQuota property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitQuota(String value) {
        this.initQuota = value;
    }

    /**
     * Gets the value of the mpanCardMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link CardMetaDataType }
     *     
     */
    public CardMetaDataType getMpanCardMetaData() {
        return mpanCardMetaData;
    }

    /**
     * Sets the value of the mpanCardMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardMetaDataType }
     *     
     */
    public void setMpanCardMetaData(CardMetaDataType value) {
        this.mpanCardMetaData = value;
    }

    /**
     * Gets the value of the otpResolutionList property.
     * 
     * @return
     *     possible object is
     *     {@link OtpResolutionListType }
     *     
     */
    public OtpResolutionListType getOtpResolutionList() {
        return otpResolutionList;
    }

    /**
     * Sets the value of the otpResolutionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtpResolutionListType }
     *     
     */
    public void setOtpResolutionList(OtpResolutionListType value) {
        this.otpResolutionList = value;
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


    @Override
    public String toString() {
        return "MpanApplyResponse{" +
                "status=" + status +
                ", mpanId='" + mpanId + '\'' +
                ", mpanPersoDataInfo=" + mpanPersoDataInfo +
                ", initQuota='" + initQuota + '\'' +
                ", mpanCardMetaData=" + mpanCardMetaData +
                ", otpResolutionList=" + otpResolutionList +
                ", mac=" + Arrays.toString(mac) +
                '}';
    }
}
