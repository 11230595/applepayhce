
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
 *         &lt;element ref="{http://www.artery.org/projects/NBUnionPayHceHeader/}MessageID"/>
 *         &lt;element ref="{http://www.artery.org/projects/NBUnionPayHceBody/}FunctionCallIdentifier"/>
 *         &lt;element name="Extensions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.artery.org/projects/NBUnionPayHceBody/}ApplyInfo"/>
 *                   &lt;element ref="{http://www.artery.org/projects/NBUnionPayHceBody/}ActivationInfo"/>
 *                   &lt;element name="Service" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SecureElement" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "messageID",
    "functionCallIdentifier",
    "extensions"
})
@XmlRootElement(name = "CheckGlobalEligibilityRequest")
public class CheckGlobalEligibilityRequest {

    @XmlElement(name = "MessageID", namespace = "http://www.artery.org/projects/NBUnionPayHceHeader/", required = true)
    protected String messageID;
    @XmlElement(name = "FunctionCallIdentifier", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String functionCallIdentifier;
    @XmlElement(name = "Extensions", required = true)
    protected CheckGlobalEligibilityRequest.Extensions extensions;

    /**
     * 消息的uuid
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageID() {
        return messageID;
    }

    /**
     * Sets the value of the messageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageID(String value) {
        this.messageID = value;
    }

    /**
     * 请求发起者标识
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionCallIdentifier() {
        return functionCallIdentifier;
    }

    /**
     * Sets the value of the functionCallIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionCallIdentifier(String value) {
        this.functionCallIdentifier = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link CheckGlobalEligibilityRequest.Extensions }
     *     
     */
    public CheckGlobalEligibilityRequest.Extensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckGlobalEligibilityRequest.Extensions }
     *     
     */
    public void setExtensions(CheckGlobalEligibilityRequest.Extensions value) {
        this.extensions = value;
    }


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
     *         &lt;element ref="{http://www.artery.org/projects/NBUnionPayHceBody/}ApplyInfo"/>
     *         &lt;element ref="{http://www.artery.org/projects/NBUnionPayHceBody/}ActivationInfo"/>
     *         &lt;element name="Service" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SecureElement" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "applyInfo",
        "activationInfo",
        "service",
        "secureElement"
    })
    public static class Extensions {

        @XmlElement(name = "ApplyInfo", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
        protected ApplyInfo applyInfo;
        @XmlElement(name = "ActivationInfo", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
        protected ActivationInfo activationInfo;
        @XmlElement(name = "Service", required = true)
        protected String service;
        @XmlElement(name = "SecureElement", required = true)
        protected String secureElement;

        /**
         * 申请信息
         * 
         * @return
         *     possible object is
         *     {@link ApplyInfo }
         *     
         */
        public ApplyInfo getApplyInfo() {
            return applyInfo;
        }

        /**
         * Sets the value of the applyInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ApplyInfo }
         *     
         */
        public void setApplyInfo(ApplyInfo value) {
            this.applyInfo = value;
        }

        /**
         * ActivationInfoType
         * 
         * @return
         *     possible object is
         *     {@link ActivationInfo }
         *     
         */
        public ActivationInfo getActivationInfo() {
            return activationInfo;
        }

        /**
         * Sets the value of the activationInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ActivationInfo }
         *     
         */
        public void setActivationInfo(ActivationInfo value) {
            this.activationInfo = value;
        }

        /**
         * Gets the value of the service property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getService() {
            return service;
        }

        /**
         * Sets the value of the service property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setService(String value) {
            this.service = value;
        }

        /**
         * Gets the value of the secureElement property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecureElement() {
            return secureElement;
        }

        /**
         * Sets the value of the secureElement property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecureElement(String value) {
            this.secureElement = value;
        }

    }

}
