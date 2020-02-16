package com.zxxhw.jsrmock.reponse;

public enum ProspectCode implements ResultCode{
    PROSPECT_NOT_FOUND(false,20404,"客户不存在!"),
    PROSPECT_UPDATE_FAILED(false,20400,"客户信息更新失败!"),
    PROSPECT_INSERT_FAILED(false,20401,"插入客户信息失败")
    ;

    boolean success;
    int code;
    String message;

    ProspectCode(boolean success, int code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    ProspectCode() {
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
}
