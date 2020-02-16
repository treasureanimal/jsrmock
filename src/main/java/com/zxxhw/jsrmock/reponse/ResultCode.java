package com.zxxhw.jsrmock.reponse;

public interface ResultCode {

    //操作是否成功
    public boolean success();
    //操作代码
    public int code();
    //提示信息
    public String message();
}
