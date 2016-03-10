package com.companyName.appName.requestVo;

/**
 * Created by liuyufu on 2016/3/8.
 */
public class BankOprateRequest {


    private  String  cardNo;//¿¨ºÅ
    private  String operation;// ²Ù×÷ÀàÐÍ

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    @Override
    public String toString() {
        return "BankOprateRequest{" +
                "cardNo='" + cardNo + '\'' +
                ", operation='" + operation + '\'' +
                '}';
    }
}
