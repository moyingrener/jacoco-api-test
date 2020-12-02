package com.moyingren.result;


import java.io.Serializable;

public class ResponseResult<T> implements Serializable {
    private Integer code;
    private String msg;
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ResponseResult() {
        this.code= ResultEnum.SUCCESS.getCode();
        this.msg= ResultEnum.SUCCESS.getMsg();
    }

    public ResponseResult(T data) {
        this.code= ResultEnum.SUCCESS.getCode();
        this.msg= ResultEnum.SUCCESS.getMsg();
        this.data=data;
    }

    @Override
    public String toString() {
        return "ResponseResult{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public ResponseResult(ResultEnum r, T data) {
        this.code=r.getCode();
        this.msg=r.getMsg();
        this.data=data;
    }
    public ResponseResult(Integer code,String msg,T data) {
        this.code=code;
        this.msg=msg;
        this.data=data;
    }

}
