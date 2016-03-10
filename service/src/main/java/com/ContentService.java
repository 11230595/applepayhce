package com;
import javax.xml.ws.Holder;

/**
 * Created by peter on 2016/3/7.
 */
public class ContentService {
    public static void main(String[] args){
        TsmBankService service=new TsmBankService();
        AmBankPortType stub=service.getTsmBankPortType();

        MpanApplyRequest mpanApplyRequest=new MpanApplyRequest();
        mpanApplyRequest.setCasdCertInfo("1111");
        mpanApplyRequest.setSeId("000088888888".getBytes());
        mpanApplyRequest.setSeType("333");
        mpanApplyRequest.setSeIssuer("555");
        mpanApplyRequest.setApplyChannel("03");

        TermAndConditionInfoType termAndConditionInfoType=new TermAndConditionInfoType();
        termAndConditionInfoType.setTermAndConditionAcceptedDate("edfd");

        RiskInfoType riskInfoType=new RiskInfoType();
        riskInfoType.setBillingZip("dfdfd");
        AccountInfoType accountInfoType=new AccountInfoType();
        CardHolderInfoType cardHolderInfoType =new CardHolderInfoType();
        cardHolderInfoType.setCardHolderIdNo("erere");
        accountInfoType.setPan("1234555599999999");

        mpanApplyRequest.setAccountInfo(accountInfoType);
        mpanApplyRequest.setCardHolderInfo(cardHolderInfoType);
        mpanApplyRequest.setTermAndConditionInfo(termAndConditionInfoType);
        mpanApplyRequest.setRiskInfo(riskInfoType);


        MpanApplyResponse mpanApplyResponse=stub.mpanApply(
                new Holder<String>("1"),
                new Holder<String>("1"),
                new Holder<String>("1"),
                new Holder<String>("1"),
                new Holder<String>("1"),
                new Holder<String>("2001"),
                new Holder<String>("1"),
                new Holder<String>("1"),
                mpanApplyRequest
        );
        System.out.print(mpanApplyResponse.toString());

        System.out.println(mpanApplyResponse.getStatus().getStatusCode());
    }
}
