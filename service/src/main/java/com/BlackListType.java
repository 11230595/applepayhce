
package com;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for blackListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="blackListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="span" type="{http://ws.tsm.cup.com/}panblackListType" maxOccurs="100" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="mpan" type="{http://ws.tsm.cup.com/}panblackListType" maxOccurs="100" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "blackListType", propOrder = {
    "span",
    "mpan"
})
public class BlackListType {

    protected List<PanblackListType> span;
    protected List<PanblackListType> mpan;

    /**
     * Gets the value of the span property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the span property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PanblackListType }
     * 
     * 
     */
    public List<PanblackListType> getSpan() {
        if (span == null) {
            span = new ArrayList<PanblackListType>();
        }
        return this.span;
    }

    /**
     * Gets the value of the mpan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mpan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMpan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PanblackListType }
     * 
     * 
     */
    public List<PanblackListType> getMpan() {
        if (mpan == null) {
            mpan = new ArrayList<PanblackListType>();
        }
        return this.mpan;
    }

}
