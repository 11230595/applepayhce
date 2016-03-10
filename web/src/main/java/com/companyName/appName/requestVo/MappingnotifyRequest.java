package com.companyName.appName.requestVo;

/**
 * Created by peter on 2016/3/7.
 */
public class MappingnotifyRequest {

    private  String  seid; //设备卡ID

    private String  cardNo; //卡号

    private String  operation;//操作类型

    public String getSeid() {
        return seid;
    }
    public void setSeid(String seid) {
        this.seid = seid;
    }

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
        return "MappingnotifyRequest{" +
                "seid='" + seid + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", operation='" + operation + '\'' +
                '}';
    }
}
