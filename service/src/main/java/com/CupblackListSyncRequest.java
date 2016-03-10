
package com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for cupblackListSyncRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cupblackListSyncRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="blackListCategory" type="{http://ws.tsm.cup.com/}blackListCategoryType"/>
 *         &lt;element name="blackList" type="{http://ws.tsm.cup.com/}blackListType"/>
 *         &lt;element name="mac" type="{http://ws.tsm.cup.com/}macType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cupblackListSyncRequest", propOrder = {
    "blackListCategory",
    "blackList",
    "mac"
})
public class CupblackListSyncRequest {

    @XmlElement(required = true)
    protected String blackListCategory;
    @XmlElement(required = true)
    protected BlackListType blackList;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] mac;

    /**
     * Gets the value of the blackListCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlackListCategory() {
        return blackListCategory;
    }

    /**
     * Sets the value of the blackListCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlackListCategory(String value) {
        this.blackListCategory = value;
    }

    /**
     * Gets the value of the blackList property.
     * 
     * @return
     *     possible object is
     *     {@link BlackListType }
     *     
     */
    public BlackListType getBlackList() {
        return blackList;
    }

    /**
     * Sets the value of the blackList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlackListType }
     *     
     */
    public void setBlackList(BlackListType value) {
        this.blackList = value;
    }

    /**
     * Gets the value of the mac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getMac() {
        return mac;
    }

    /**
     * Sets the value of the mac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMac(byte[] value) {
        this.mac = value;
    }

}
