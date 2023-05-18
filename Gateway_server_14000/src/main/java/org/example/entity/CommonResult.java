package org.example.entity;

import java.io.Serializable;

public class CommonResult<T> implements Serializable {
    private Integer code;
    private String message;

    public CommonResult(){

    }
    public CommonResult(Integer code, String message, T result){
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
