package com.example.bx_web.utils;

import com.example.bx_web.pojo.VueResultInfo;

public class ResultFactory {
    public static VueResultInfo buildSuccessResult(Object data) {
        return buidResult(ResultCode.SUCCESS, "成功", data);
    }

    public static VueResultInfo buildFailResult(String message) {
        return buidResult(ResultCode.FAIL, message, null);
    }

    public static VueResultInfo buidResult(ResultCode resultCode, String message, Object data) {
        return buidResult(resultCode.code, message, data);
    }

    public static VueResultInfo buidResult(int resultCode, String message, Object data) {
        return new VueResultInfo(resultCode, message, data);
    }

}
