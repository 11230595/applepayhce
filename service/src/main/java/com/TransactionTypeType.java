
package com;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transactionTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="transactionTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Purchase"/>
 *     &lt;enumeration value="Refund"/>
 *     &lt;enumeration value="preAuthorized"/>
 *     &lt;enumeration value="CashATM"/>
 *     &lt;enumeration value="DepositATM"/>
 *     &lt;enumeration value="TransferATM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "transactionTypeType")
@XmlEnum
public enum TransactionTypeType {

    @XmlEnumValue("Purchase")
    PURCHASE("Purchase"),
    @XmlEnumValue("Refund")
    REFUND("Refund"),
    @XmlEnumValue("preAuthorized")
    PRE_AUTHORIZED("preAuthorized"),
    @XmlEnumValue("CashATM")
    CASH_ATM("CashATM"),
    @XmlEnumValue("DepositATM")
    DEPOSIT_ATM("DepositATM"),
    @XmlEnumValue("TransferATM")
    TRANSFER_ATM("TransferATM");
    private final String value;

    TransactionTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionTypeType fromValue(String v) {
        for (TransactionTypeType c: TransactionTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
