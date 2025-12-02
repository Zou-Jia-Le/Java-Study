package com.imooc.job_backend.utils.enums;

import lombok.Getter;

//生成getter方法
@Getter
//统一响应状态码信息
public enum ResultCodeEnum {
    //枚举常量
    SUCCESS(200,"请求成功"),
    PARAM_ERROR(400,"参数错误"),
    NOT_FOUND(404,"接口不存在"),
    SERVER_ERROR(500,"服务端错误"),
    DB_ERROR(505,"数据库错误"),
    UNIQUE_KEY_ERROR(506,"唯一键异常"),
    UNKNOWN_ERROR(600,"未知错误");

    //成员变量
    private Integer code;//响应状态码
    private String msg;//状态码的描述信息

    //构造方法
    ResultCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
