
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
 *         &lt;element name="Eligible" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ServiceInstanceState" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "eligible",
    "serviceInstanceState"
})
@XmlRootElement(name = "ResponseData", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/")
public class ResponseData {

    @XmlElement(name = "Eligible", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String eligible;
    @XmlElement(name = "ServiceInstanceState", namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", required = true)
    protected String serviceInstanceState;

    /**
     * Gets the value of the eligible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligible() {
        return eligible;
    }

    /**
     * Sets the value of the eligible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligible(String value) {
        this.eligible = value;
    }

    /**
     * Gets the value of the serviceInstanceState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceInstanceState() {
        return serviceInstanceState;
    }

    /**
     * Sets the value of the serviceInstanceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceInstanceState(String value) {
        this.serviceInstanceState = value;
    }

}
