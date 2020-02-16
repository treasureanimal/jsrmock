package com.zxxhw.jsrmock.reponse;

public enum CommonCode implements ResultCode {
    SUCCESS(true,10000,"操作成功"),
    FAIL(false,11111,"操作失败"),
    UNAUTHENTICATED(false,10001,"请登录系统"),
    UNATHORISE(false,10002,"对不起，权限不足"),
    ERROR(false,99999,"抱歉，系统繁忙，请稍后再试"),
    PARAM_ERROR(false,10003,"参数校验有误")
    ;
    boolean succes;
    int code;
    String message;

    CommonCode(boolean succes, int code, String message) {
        this.succes = succes;
        this.code = code;
        this.message = message;
    }

    @Override
    public boolean success() {
        return false;
    }

    @Override
    public int code() {
        return 0;
    }

    @Override
    public String message() {
        return null;
    }

    public boolean isSucces() {
        return succes;
    }

    public void setSucces(boolean succes) {
        this.succes = succes;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
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
        return "CommonCode{" +
                "succes=" + succes +
                ", code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
