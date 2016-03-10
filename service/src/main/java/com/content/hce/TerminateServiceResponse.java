
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
 *                   &lt;element ref="{http://www.artery.org/projects/NBUnionPayHceBody/}EntityInfo"/>
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
    "functionExecutionStatus",
    "extensions"
})
@XmlRootElement(name = "TerminateServiceResponse")
public class TerminateServiceResponse {

    @XmlElement(name = "FunctionExecutionStatus", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected FunctionExecutionStatus functionExecutionStatus;
    @XmlElement(name = "Extensions", required = true)
    protected TerminateServiceResponse.Extensions extensions;

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
     *     {@link TerminateServiceResponse.Extensions }
     *     
     */
    public TerminateServiceResponse.Extensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminateServiceResponse.Extensions }
     *     
     */
    public void setExtensions(TerminateServiceResponse.Extensions value) {
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
     *         &lt;element ref="{http://www.artery.org/projects/NBUnionPayHceBody/}EntityInfo"/>
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
        "entityInfo"
    })
    public static class Extensions {

        @XmlElement(name = "EntityInfo", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
        protected EntityInfo entityInfo;

        /**
         * 操作实体类型
         * 
         * @return
         *     possible object is
         *     {@link EntityInfo }
         *     
         */
        public EntityInfo getEntityInfo() {
            return entityInfo;
        }

        /**
         * Sets the value of the entityInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link EntityInfo }
         *     
         */
        public void setEntityInfo(EntityInfo value) {
            this.entityInfo = value;
        }

    }

}
