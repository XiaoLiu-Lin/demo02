package com.example.demo.entity.util;

import java.io.Serializable;

public class PesponseResult<T> implements Serializable {

    private static final long serialVersionUID = -1626793180717240861L;
    
    private Integer state;
    private String message;
    private T data;


    public PesponseResult() {
        super();
    }

    public PesponseResult(Integer state) {
        super();
        this.state = state;
    }

    public PesponseResult(Integer state, T data) {
        super();
        this.state = state;
        this.data = data;
    }

    public PesponseResult(Integer state, Exception e) {
        super();
        this.state = state;
        this.message = e.getMessage();
    }


    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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

    @Override
    public String toString() {
        return "PesponseResult{" +
                "state=" + state +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
