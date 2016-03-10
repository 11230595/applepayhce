package com.companyName.appName.responseVo;

/**
 * Created by peter on 2016/3/7.
 */
public class CommonResponse {
    /**
     * 成功与否
     */
    private Boolean success;
    /**
     * 返回的内容
     */
    private Object content;
    /**
     * 返回代码
     */
    private String code;
    /**
     * 返回消息
     */
    private String message;

    public CommonResponse(Boolean success, Object content, String code, String message) {
        this.success = success;
        this.content = content;
        this.code = code;
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "CommonResponse{" +
                "success=" + success +
                ", content=" + content +
                ", code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
