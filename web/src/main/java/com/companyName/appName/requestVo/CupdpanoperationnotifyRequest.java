package com.companyName.appName.requestVo;

/**
 * Created by peter on 2016/3/7.
 */
public class CupdpanoperationnotifyRequest {

     private  String   mpanid;

    private  String seid;

    private  String  operation;

    public String getMpanid() {
        return mpanid;
    }

    public void setMpanid(String mpanid) {
        this.mpanid = mpanid;
    }

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

    @Override
    public String toString() {
        return "CupdpanoperationnotifyRequest{" +
                "mpanid='" + mpanid + '\'' +
                ", seid='" + seid + '\'' +
                ", operation='" + operation + '\'' +
                '}';
    }
}
