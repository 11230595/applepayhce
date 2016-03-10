
package com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for termAndConditionInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="termAndConditionInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="termAndConditionId" type="{http://ws.tsm.cup.com/}termAndConditionIdType"/>
 *         &lt;element name="termAndConditionAcceptedDate" type="{http://ws.tsm.cup.com/}termAndConditionAcceptedDateType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "termAndConditionInfoType", propOrder = {
    "termAndConditionId",
    "termAndConditionAcceptedDate"
})
public class TermAndConditionInfoType {

    @XmlElement(required = true)
    protected String termAndConditionId;
    @XmlElement(required = true)
    protected String termAndConditionAcceptedDate;

    /**
     * Gets the value of the termAndConditionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermAndConditionId() {
        return termAndConditionId;
    }

    /**
     * Sets the value of the termAndConditionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermAndConditionId(String value) {
        this.termAndConditionId = value;
    }

    /**
     * Gets the value of the termAndConditionAcceptedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermAndConditionAcceptedDate() {
        return termAndConditionAcceptedDate;
    }

    /**
     * Sets the value of the termAndConditionAcceptedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermAndConditionAcceptedDate(String value) {
        this.termAndConditionAcceptedDate = value;
    }

}
