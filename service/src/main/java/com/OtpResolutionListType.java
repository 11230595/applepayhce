
package com;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for otpResolutionListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="otpResolutionListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="otpResolution" type="{http://ws.tsm.cup.com/}otpResolutionType" maxOccurs="10" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "otpResolutionListType", propOrder = {
    "otpResolution"
})
public class OtpResolutionListType {

    protected List<OtpResolutionType> otpResolution;

    /**
     * Gets the value of the otpResolution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otpResolution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtpResolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtpResolutionType }
     * 
     * 
     */
    public List<OtpResolutionType> getOtpResolution() {
        if (otpResolution == null) {
            otpResolution = new ArrayList<OtpResolutionType>();
        }
        return this.otpResolution;
    }

}
