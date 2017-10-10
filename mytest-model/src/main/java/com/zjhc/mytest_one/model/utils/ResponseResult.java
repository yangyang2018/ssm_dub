package com.zjhc.mytest_one.model.utils;

/**
 * Created by yangyang on 2017/10/10.
 */
public class ResponseResult <T> {

    private boolean success = false;
    private String message = null;
    private T data = null;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
