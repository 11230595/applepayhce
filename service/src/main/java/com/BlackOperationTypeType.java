
package com;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for blackOperationTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="blackOperationTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="D"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "blackOperationTypeType")
@XmlEnum
public enum BlackOperationTypeType {

    I,
    D;

    public String value() {
        return name();
    }

    public static BlackOperationTypeType fromValue(String v) {
        return valueOf(v);
    }

}
