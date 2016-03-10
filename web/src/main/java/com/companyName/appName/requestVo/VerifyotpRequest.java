package com.companyName.appName.requestVo;

/**
 * Created by peter on 2016/3/7.
 */
public class VerifyotpRequest {

  private  String  mpanid;
  private  String  seid;
  private String  otp;

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

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    @Override
    public String toString() {
        return "VerifyotpRequest{" +
                "mpanid='" + mpanid + '\'' +
                ", seid='" + seid + '\'' +
                ", otp='" + otp + '\'' +
                '}';
    }
}
