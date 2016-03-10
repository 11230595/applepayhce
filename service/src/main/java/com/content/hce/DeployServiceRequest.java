
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
 *         &lt;element ref="{http://www.artery.org/projects/NBUnionPayHceBody/}FunctionExecutionStatus"/>
 *         &lt;element ref="{http://www.artery.org/projects/NBUnionPayHceBody/}ResponseData"/>
 *         &lt;element name="Extensions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.artery.org/projects/NBUnionPayHceBody/}HceCardInfo"/>
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
    "functionExecutionStatus",
    "responseData",
    "extensions"
})
@XmlRootElement(name = "DeployServiceRequest")
public class DeployServiceRequest {

    @XmlElement(name = "MessageID", namespace = "http://www.artery.org/projects/NBUnionPayHceHeader/", required = true)
    protected String messageID;
    @XmlElement(name = "FunctionExecutionStatus", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected FunctionExecutionStatus functionExecutionStatus;
    @XmlElement(name = "ResponseData", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected ResponseData responseData;
    @XmlElement(name = "Extensions", required = true)
    protected DeployServiceRequest.Extensions extensions;

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
     * 响应数据
     * 
     * @return
     *     possible object is
     *     {@link FunctionExecutionStatus }
     *     
     */
    public FunctionExecutionStatus getFunctionExecutionStatus() {
        return functionExecutionStatus;
    }

    /**
     * Sets the value of the functionExecutionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionExecutionStatus }
     *     
     */
    public void setFunctionExecutionStatus(FunctionExecutionStatus value) {
        this.functionExecutionStatus = value;
    }

    /**
     * 接口运行结果数据
     * 
     * @return
     *     possible object is
     *     {@link ResponseData }
     *     
     */
    public ResponseData getResponseData() {
        return responseData;
    }

    /**
     * Sets the value of the responseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseData }
     *     
     */
    public void setResponseData(ResponseData value) {
        this.responseData = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link DeployServiceRequest.Extensions }
     *     
     */
    public DeployServiceRequest.Extensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeployServiceRequest.Extensions }
     *     
     */
    public void setExtensions(DeployServiceRequest.Extensions value) {
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
     *         &lt;element ref="{http://www.artery.org/projects/NBUnionPayHceBody/}HceCardInfo"/>
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
        "hceCardInfo"
    })
    public static class Extensions {

        @XmlElement(name = "HceCardInfo", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
        protected HceCardInfo hceCardInfo;

        /**
         * 云卡信息
         * 
         * @return
         *     possible object is
         *     {@link HceCardInfo }
         *     
         */
        public HceCardInfo getHceCardInfo() {
            return hceCardInfo;
        }

        /**
         * Sets the value of the hceCardInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link HceCardInfo }
         *     
         */
        public void setHceCardInfo(HceCardInfo value) {
            this.hceCardInfo = value;
        }

    }

}
