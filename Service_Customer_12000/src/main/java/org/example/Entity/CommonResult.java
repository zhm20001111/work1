package org.example.Entity;

import java.io.Serializable;

public class CommonResult<T> implements Serializable {
    private Integer code;
    private String message;
    private T result;

    public CommonResult(){

    }

    public CommonResult(Integer code, String message, T result){
        this.code = code;
        this.message = message;
        this.result = result;
    }
    public Integer getCode() {
        return code;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setCode(Integer code) {
        this.code = code;
    }




}
