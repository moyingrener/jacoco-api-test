package com.moyingren.result;


public enum ResultEnum {
    SUCCESS(200,"成功"),
    ERROR(500,"错误"),
    UNKNOWN(404,"未知错误");
    private Integer code;
    private String msg;
    ResultEnum(Integer code, String msg) {
        this.code=code;
        this.msg=msg;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }

    public Integer getCode(){
        return code;
    }

    public String getMsg(){
        return msg;
    }
}
