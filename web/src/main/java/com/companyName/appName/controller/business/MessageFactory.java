package com.companyName.appName.controller.business;
/*
 * 报文内容转换类
 */
public class MessageFactory {
	/*
	 * 补换交易码
	 */
	private static String BHTranCode = "1013";
	/*
	 * 挂失/解挂/注销交易码
	 */
	private static String SCTranCode = "1006";
	static{
		BHTranCode=System.getProperty("BH_TranCode", "1013");
		SCTranCode=System.getProperty("SC_TranCode", "1006");
	}
	  /*
	   * 拼补换报文
	   */
	  public static String getBHMsg(String span, String newSpan)
	  {
	    StringBuffer sendMsg = new StringBuffer("<Document>")
	    	.append("<TranCode>").append(BHTranCode).append("</TranCode>")
	    	.append("<span>").append(span).append("</span>")
	    	.append("<newSpan>").append(newSpan).append("</newSpan>")
	    	.append("</Document>");
	    return sendMsg.toString();
	  }
	  
	  /*
	   * 拼挂失/解挂/注销报文
	   */
	  public static String getStatusChangeMsg(String span, String transactionType)
	  {
	    StringBuffer sendMsg = new StringBuffer("<Document>")
	    	.append("<TranCode>").append(SCTranCode).append("</TranCode>")
	    	.append("<span>").append(span).append("</span>")
	    	.append("<transactionType>").append(transactionType).append("</transactionType>")
	    	.append("</Document>");
	    return sendMsg.toString();
	  }
	  
	  /*
	   * 拼挂失/解挂/注销报文
	   */
	  public static String getAutoLogoutMsg(String mpanId)
	  {
	    StringBuffer sendMsg = new StringBuffer("<Document>")
	    	.append("<LOCAL_HEAD>")
	    	.append("<TranCode>0400200000111</TranCode>")
	    	.append("</LOCAL_HEAD>")
	    	.append("<BODY>")
	    	.append("<TxnTp>03</TxnTp>")
	    	.append("<EqmtCardNo>").append(mpanId).append("</EqmtCardNo>")
	    	.append("</BODY>")
	    	.append("</Document>");
	    return sendMsg.toString();
	  }
}
