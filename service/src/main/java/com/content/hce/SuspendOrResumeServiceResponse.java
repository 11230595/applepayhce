
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
    "functionExecutionStatus"
})
@XmlRootElement(name = "SuspendOrResumeServiceResponse")
public class SuspendOrResumeServiceResponse {

    @XmlElement(name = "FunctionExecutionStatus", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected FunctionExecutionStatus functionExecutionStatus;

    /**
     * ÏìÓ¦Êý¾Ý
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

}
