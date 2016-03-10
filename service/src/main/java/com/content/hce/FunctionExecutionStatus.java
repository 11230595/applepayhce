
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
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StatusCodeData">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "status",
    "statusCodeData"
})
@XmlRootElement(name = "FunctionExecutionStatus", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/")
public class FunctionExecutionStatus {

    @XmlElement(name = "Status", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String status;
    @XmlElement(name = "StatusCodeData", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected FunctionExecutionStatus.StatusCodeData statusCodeData;

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
     * Gets the value of the statusCodeData property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionExecutionStatus.StatusCodeData }
     *     
     */
    public FunctionExecutionStatus.StatusCodeData getStatusCodeData() {
        return statusCodeData;
    }

    /**
     * Sets the value of the statusCodeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionExecutionStatus.StatusCodeData }
     *     
     */
    public void setStatusCodeData(FunctionExecutionStatus.StatusCodeData value) {
        this.statusCodeData = value;
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
     *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "subject",
        "reason",
        "message"
    })
    public static class StatusCodeData {

        @XmlElement(name = "Subject", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
        protected String subject;
        @XmlElement(name = "Reason", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
        protected String reason;
        @XmlElement(name = "Message", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
        protected String message;

        /**
         * Gets the value of the subject property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubject() {
            return subject;
        }

        /**
         * Sets the value of the subject property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubject(String value) {
            this.subject = value;
        }

        /**
         * Gets the value of the reason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReason() {
            return reason;
        }

        /**
         * Sets the value of the reason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReason(String value) {
            this.reason = value;
        }

        /**
         * Gets the value of the message property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMessage() {
            return message;
        }

        /**
         * Sets the value of the message property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMessage(String value) {
            this.message = value;
        }

    }

}
