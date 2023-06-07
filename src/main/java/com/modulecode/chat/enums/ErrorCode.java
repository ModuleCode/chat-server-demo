package com.modulecode.chat.enums;

public enum  ErrorCode {
    PARAM_ERROR("1000","参数不正确"),
    BODY_NONE_ERROR("1001","内容不正确"),
    REQUEST_METHODS_ERROR("1002","请求方式错误");
    private String code;
    private String msg;

    ErrorCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
