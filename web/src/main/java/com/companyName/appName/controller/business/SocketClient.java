package com.companyName.appName.controller.business;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;

//import org.apache.log4j.Logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/*
 * 通讯类
 */
public class SocketClient {
	/*
	 * 日志
	 */
    private final Logger  LOG = LoggerFactory.getLogger(SocketClient.class);
    /*
     * 字符类型是UTF-8
     */
    private static String CHARSET = "UTF-8";
    /*
     * 内容长度
     */
    private static int MSG_LEN = 4;
    /*
     * 大小
     */
    private static int BUFFER_SIZE = 1024;
    /*
     * 主机地址
     */
    private static String host = "127.0.0.1";
    /*
     * 端口
     */
    private static String port = "8703";
    /*
     * 发送消息方法
     */
    public static String sendMsgDo(String sendMsg,String ip, String port1,int MSG_LEN1){
    	host = ip;
    	port = port1;
    	MSG_LEN = MSG_LEN1;
       // LOG.debug("send xml:" + sendMsg + " ;host:" + host + " ;port:" + port + " ;MSG_LEN="+MSG_LEN);
        try {
            byte[] responseStr = send(sendMsg);
            String xmlMsg = new String(responseStr);
            //LOG.debug("back xml:" + xmlMsg);
            return xmlMsg;
        } catch (Exception e) {
           // LOG.error("socket client 链接失败"+e.getMessage());
        }
        return "";
    }
    /*
     * 发送方法
     */
    public static byte[] send(Socket client,byte[] sendBuf) throws Exception {
        byte[] tempBuf = new byte[BUFFER_SIZE];
        OutputStream out = null;
        InputStream in = null;
        try {
            out = client.getOutputStream();
            in = client.getInputStream();

            ByteBuffer totalBuf = ByteBuffer.allocate(sendBuf.length + MSG_LEN);

            byte[] lenBuf = String.format("%0" + MSG_LEN + "d", new Object[]{Integer.valueOf(sendBuf.length)}).getBytes();
            totalBuf.put(lenBuf);
            totalBuf.put(sendBuf);
           // if (LOG.isDebugEnabled())
             //   LOG.debug("SEND MSG IS:[" + new String(totalBuf.array(), CHARSET) + "]");
            out.write(totalBuf.array());
            out.flush();

            lenBuf = new byte[MSG_LEN];
            if (in.read(lenBuf) != MSG_LEN)
                throw new Exception("读取报文长度异常!");
            int len = Integer.parseInt(new String(lenBuf));

            byte[] respBuf = new byte[len];
            int num = 0;
            int realLen = 0;
            while (((num = in.read(tempBuf)) != -1) && (realLen < len)) {
                System.arraycopy(tempBuf, 0, respBuf, realLen, num);
                realLen += num;
            }
            //if (LOG.isDebugEnabled())
              //  LOG.debug("RECV MSG IS:[" + new String(respBuf, CHARSET) + "]");
            byte[] arrayOfByte1 = respBuf;
            return arrayOfByte1;
        } catch (Exception e) {
           // LOG.error(e.getMessage(), e);
            throw e;
        } finally {
            if (out != null)
                out.close();
            if (in != null)
                in.close();
        }
    }
    /*
     * 发送方法
     */
    public static byte[] send(String msg) throws Exception {
        Socket client=new Socket(host, Integer.parseInt(port));
        return send(client,msg.getBytes(CHARSET));
    }
}
