package com.companyName.appName.requestVo;

/**
 * Created by peter on 2016/3/7.
 */
public class TriggerotpRequest {


    private  String  mpan;
    private  String  seid;


    public String getMpan() {
        return mpan;
    }

    public void setMpan(String mpan) {
        this.mpan = mpan;
    }

    public String getSeid() {
        return seid;
    }

    public void setSeid(String seid) {
        this.seid = seid;
    }

    @Override
    public String toString() {
        return "VerifyotpRequest{" +
                "mpan='" + mpan + '\'' +
                ", seid='" + seid + '\'' +
                '}';
    }
}
