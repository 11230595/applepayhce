
package com;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transactionStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="transactionStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Approved"/>
 *     &lt;enumeration value="Declined"/>
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="Refunded"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "transactionStatusType")
@XmlEnum
public enum TransactionStatusType {

    @XmlEnumValue("Approved")
    APPROVED("Approved"),
    @XmlEnumValue("Declined")
    DECLINED("Declined"),
    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("Refunded")
    REFUNDED("Refunded");
    private final String value;

    TransactionStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionStatusType fromValue(String v) {
        for (TransactionStatusType c: TransactionStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
