
package com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for mpanPersoDataInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mpanPersoDataInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mpan" type="{http://ws.tsm.cup.com/}panType"/>
 *         &lt;element name="spPersodata" type="{http://ws.tsm.cup.com/}spPersoDataType"/>
 *         &lt;element name="kekKeyValue" type="{http://ws.tsm.cup.com/}keyValueType" minOccurs="0"/>
 *         &lt;element name="kekKeyMac" type="{http://ws.tsm.cup.com/}macType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mpanPersoDataInfoType", propOrder = {
    "mpan",
    "spPersodata",
    "kekKeyValue",
    "kekKeyMac"
})
public class MpanPersoDataInfoType {

    @XmlElement(required = true)
    protected String mpan;
    @XmlElement(required = true)
    protected String spPersodata;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] kekKeyValue;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] kekKeyMac;

    /**
     * Gets the value of the mpan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpan() {
        return mpan;
    }

    /**
     * Sets the value of the mpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpan(String value) {
        this.mpan = value;
    }

    /**
     * Gets the value of the spPersodata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpPersodata() {
        return spPersodata;
    }

    /**
     * Sets the value of the spPersodata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpPersodata(String value) {
        this.spPersodata = value;
    }

    /**
     * Gets the value of the kekKeyValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getKekKeyValue() {
        return kekKeyValue;
    }

    /**
     * Sets the value of the kekKeyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKekKeyValue(byte[] value) {
        this.kekKeyValue = value;
    }

    /**
     * Gets the value of the kekKeyMac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getKekKeyMac() {
        return kekKeyMac;
    }

    /**
     * Sets the value of the kekKeyMac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKekKeyMac(byte[] value) {
        this.kekKeyMac = value;
    }

}
