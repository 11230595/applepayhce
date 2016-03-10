
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
 *         &lt;element ref="{http://www.artery.org/projects/NBUnionPayHceBody/}FunctionExecutionStatus"/>
 *         &lt;element name="Extensions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.artery.org/projects/NBUnionPayHceBody/}ApplyResponse"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.artery.org/projects/NBUnionPayHceBody/}ResponseData"/>
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
    "functionExecutionStatus",
    "extensions",
    "responseData"
})
@XmlRootElement(name = "CheckGlobalEligibilityResponse")
public class CheckGlobalEligibilityResponse {

    @XmlElement(name = "FunctionExecutionStatus", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected FunctionExecutionStatus functionExecutionStatus;
    @XmlElement(name = "Extensions", required = true)
    protected CheckGlobalEligibilityResponse.Extensions extensions;
    @XmlElement(name = "ResponseData", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected ResponseData responseData;

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
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link CheckGlobalEligibilityResponse.Extensions }
     *     
     */
    public CheckGlobalEligibilityResponse.Extensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckGlobalEligibilityResponse.Extensions }
     *     
     */
    public void setExtensions(CheckGlobalEligibilityResponse.Extensions value) {
        this.extensions = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.artery.org/projects/NBUnionPayHceBody/}ApplyResponse"/>
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
        "applyResponse"
    })
    public static class Extensions {

        @XmlElement(name = "ApplyResponse", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
        protected ApplyResponse applyResponse;

        /**
         * 申请的验证结果
         * 
         * @return
         *     possible object is
         *     {@link ApplyResponse }
         *     
         */
        public ApplyResponse getApplyResponse() {
            return applyResponse;
        }

        /**
         * Sets the value of the applyResponse property.
         * 
         * @param value
         *     allowed object is
         *     {@link ApplyResponse }
         *     
         */
        public void setApplyResponse(ApplyResponse value) {
            this.applyResponse = value;
        }

    }

}
