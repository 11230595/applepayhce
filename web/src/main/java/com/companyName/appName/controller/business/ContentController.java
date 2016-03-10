package com.companyName.appName.controller.business;

import com.*;
import com.companyName.appName.controller.BaseController;
import com.companyName.appName.requestVo.*;

import com.companyName.appName.responseVo.CommonResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Holder;
import java.util.Random;
import java.util.UUID;


/**
 * Created by peter on 2016/3/7.
 */
@Controller
public class ContentController extends BaseController {
    private final Logger logger = LoggerFactory.getLogger(ContentController.class);
    private CommonResponse commonSuccessResponse=new CommonResponse(true,null,"0000","发送成功");
    private CommonResponse commonFailResponse=new CommonResponse(false,null,"9999","发送失败");

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showLogin() {
        return "index";
    }


    @RequestMapping(value = "/mappingnotify")
    public void mappingnotify(MappingnotifyRequest mappingnotifyRequest,
                            HttpServletResponse response){
        try {

            TsmBankService service=new TsmBankService();
            AmBankPortType stub=service.getTsmBankPortType();

            MpanApplyRequest mpanApplyRequest=new MpanApplyRequest();
            mpanApplyRequest.setCasdCertInfo("1111");
            mpanApplyRequest.setSeId(mappingnotifyRequest.getSeid().getBytes());
            mpanApplyRequest.setSeType(mappingnotifyRequest.getOperation());
            mpanApplyRequest.setSeIssuer("nbcbts");
            mpanApplyRequest.setApplyChannel("03");

            TermAndConditionInfoType termAndConditionInfoType=new TermAndConditionInfoType();
            termAndConditionInfoType.setTermAndConditionAcceptedDate("1234");

            RiskInfoType riskInfoType=new RiskInfoType();
            riskInfoType.setBillingZip("liuyufu412");
            AccountInfoType accountInfoType=new AccountInfoType();
            CardHolderInfoType cardHolderInfoType =new CardHolderInfoType();
            cardHolderInfoType.setCardHolderIdNo("1234");
            accountInfoType.setPan(mappingnotifyRequest.getCardNo());

            mpanApplyRequest.setAccountInfo(accountInfoType);
            mpanApplyRequest.setCardHolderInfo(cardHolderInfoType);
            mpanApplyRequest.setTermAndConditionInfo(termAndConditionInfoType);
            mpanApplyRequest.setRiskInfo(riskInfoType);


            MpanApplyResponse mpanApplyResponse=stub.mpanApply(
                    new Holder<String>("1.0"),
                    new Holder<String>("123412"),
                    new Holder<String>("09"),
                    new Holder<String>("07"),
                    new Holder<String>("76"),
                    new Holder<String>("2001"),
                    new Holder<String>("54"),
                    new Holder<String>("12"),
                    mpanApplyRequest
            );
            System.out.print(mpanApplyResponse.toString());

            System.out.println(mpanApplyResponse.getStatus().getStatusCode());

            if(mpanApplyResponse.getStatus().getStatusCode().equals("0000")){

                MappingNotifyRequest mapNotifyreq=new MappingNotifyRequest();
                mapNotifyreq.setSeId(mappingnotifyRequest.getSeid().getBytes());

                MappingInfoType info =new MappingInfoType();

                info.setSeId(mappingnotifyRequest.getSeid().getBytes());
                info.setSpan(mappingnotifyRequest.getCardNo());
                info.setMpanId(UUID.randomUUID().toString());
                Random rand = new Random();
                String randomStr = "";
                for(int i=0;i<19;i++) {
                        randomStr = randomStr + Math.abs(rand.nextInt(10)
                        );
                }
                info.setMpan(randomStr);
                info.setMappingStatus("00");
                mapNotifyreq.setMappingInfo(info);

                MappingNotifyResponse mappingNotifyResponse =stub.mappingNotify(
                        new Holder<String>("1.0"),
                        new Holder<String>("123412"),
                        new Holder<String>("09"),
                        new Holder<String>("07"),
                        new Holder<String>("76"),
                        new Holder<String>("1002"),
                        new Holder<String>("54"),
                        new Holder<String>("12"),
                        mapNotifyreq
                );

                logger.debug(mappingNotifyResponse.getStatus().getStatusCode());
            }
            logger.debug(mappingnotifyRequest.toString());

            super.writeJson(response, commonSuccessResponse);
        }catch (Exception e){
            super.writeJson(response, commonFailResponse);
        }
    }


    @RequestMapping(value = "/triggerotp")
    public void mappingnotify(TriggerotpRequest triggerotpRequest,
                              HttpServletResponse response){
        try {

            TsmBankService service=new TsmBankService();
            AmBankPortType stub=service.getTsmBankPortType();

            TriggerOtpRequest  triggerOtpRequest=new TriggerOtpRequest();
            triggerOtpRequest.setSeId(triggerotpRequest.getSeid().getBytes());
            triggerOtpRequest.setMpanId(triggerotpRequest.getMpan());
            triggerOtpRequest.setOtpResolutionId("01");
            TriggerOtpResponse triggerOtpResponse=stub.triggerOtp(
                    new Holder<String>("1.0"),
                    new Holder<String>("123412"),
                    new Holder<String>("09"),
                    new Holder<String>("07"),
                    new Holder<String>("76"),
                    new Holder<String>("1003"),
                    new Holder<String>("54"),
                    new Holder<String>("12"),
                    triggerOtpRequest
            );

            logger.debug(triggerOtpResponse.getStatus().getStatusCode());
            super.writeJson(response, new CommonResponse(true,triggerOtpResponse.getStatus().getStatusCode(),"0000","发送成功"));
        }catch (Exception e){
            super.writeJson(response, commonFailResponse);
        }
    }


    @RequestMapping(value = "/verifyotp")
    public void mappingnotify(VerifyotpRequest verifyotpRequest,
                              HttpServletResponse response){
        try {
            TsmBankService service=new TsmBankService();
            AmBankPortType stub=service.getTsmBankPortType();
            VerifyOtpRequest  verifyOtpRequest=new VerifyOtpRequest();
            verifyOtpRequest.setMpanId(verifyotpRequest.getMpanid());
            verifyOtpRequest.setSeId(verifyotpRequest.getSeid().getBytes());
            verifyOtpRequest.setOtp(verifyotpRequest.getOtp());

            VerifyOtpResponse verifyOtpResponse= stub.verifyOtp(new Holder<String>("1.0"),
                    new Holder<String>("123412"),
                    new Holder<String>("09"),
                    new Holder<String>("07"),
                    new Holder<String>("76"),
                    new Holder<String>("1004"),
                    new Holder<String>("54"),
                    new Holder<String>("12"),
                    verifyOtpRequest
            );

            logger.debug(verifyOtpResponse.getStatus().getStatusCode());
            super.writeJson(response, commonSuccessResponse);
        }catch (Exception e){
            super.writeJson(response, commonFailResponse);
        }
    }

    @RequestMapping(value = "/cupdpanoperationnotify")
    public void mappingnotify(CupdpanoperationnotifyRequest cupdpanoperationnotifyRequest,
                              HttpServletResponse response){
        try {

            TsmBankService service=new TsmBankService();
            AmBankPortType stub=service.getTsmBankPortType();
            CupMpanOperationNotifyRequest cupMpanOperationNotifyRequest =new CupMpanOperationNotifyRequest();
            logger.debug(cupdpanoperationnotifyRequest.toString());

            cupMpanOperationNotifyRequest.setMpanId(cupdpanoperationnotifyRequest.getMpanid());
            cupMpanOperationNotifyRequest.setMappingStatus(cupdpanoperationnotifyRequest.getOperation());
          //  cupMpanOperationNotifyRequest.setSeid(cupdpanoperationnotifyRequest.getSeid().getBytes());
            cupMpanOperationNotifyRequest.setOperationChannelId("02");



            CupMpanOperationNotifyResponse  cupMpanOperationNotifyResponse= stub.cupMpanOperationNotify(new Holder<String>("1.0"),
                    new Holder<String>("123412"),
                    new Holder<String>("09"),
                    new Holder<String>("07"),
                    new Holder<String>("76"),
                    new Holder<String>("1007"),
                    new Holder<String>("54"),
                    new Holder<String>("12"),
                    cupMpanOperationNotifyRequest);

            logger.debug(cupMpanOperationNotifyResponse.getStatus().getStatusCode());
            super.writeJson(response, commonSuccessResponse);
        }catch (Exception e){
            super.writeJson(response, commonFailResponse);
        }
    }

    @RequestMapping(value = "/getStatus")
    public void mappingnotify(GetStatusRequest getStatusRequest,
                              HttpServletResponse response){
        try {
            logger.debug(getStatusRequest.toString());
            super.writeJson(response, commonSuccessResponse);
        }catch (Exception e){
            super.writeJson(response, commonFailResponse);
        }
    }

    @RequestMapping(value = "/bankoprate")
    public void mappingnotify(BankOprateRequest bankOprateRequest,
                              HttpServletResponse response){
        try {
            logger.debug(bankOprateRequest.toString());
            String  re =
                    SocketClient.sendMsgDo(MessageFactory.getStatusChangeMsg(bankOprateRequest.getCardNo(), bankOprateRequest.getOperation()),"127.0.0.1","8703",4);
            logger.debug(re);

            super.writeJson(response, commonSuccessResponse);
        }catch (Exception e){
            super.writeJson(response, commonFailResponse);
        }
    }


}
