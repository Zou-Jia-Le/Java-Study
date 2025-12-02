package com.imooc.job_backend.utils;

import com.imooc.job_backend.utils.enums.ResultCodeEnum;
import lombok.Data;

@Data//生成getter、setter、toString等方法
public class ReponseResult {
    //成员变量
    private Integer code;//状态码
    private String msg;//状态码描述信息
    private Object data;//返回对象

    //构造方法
    //请求成功：返回状态码、描述信息、数据对象
    public ReponseResult(Object data) {
        this.code = ResultCodeEnum.SUCCESS.getCode();
        this.msg = ResultCodeEnum.SUCCESS.getMsg();
        this.data = data;
    }
    //请求成功：返回状态码、描述信息
    public ReponseResult() {
        this.code = ResultCodeEnum.SUCCESS.getCode();
        this.msg = ResultCodeEnum.SUCCESS.getMsg();
        this.data = null;
    }
    //返回指定状态码、描述信息、数据对象
    public ReponseResult(ResultCodeEnum resultCodeNum,Object data) {
        this.code = resultCodeNum.getCode();
        this.msg = resultCodeNum.getMsg();
        this.data = data;
    }
    //返回指定状态码、描述信息
    public ReponseResult(ResultCodeEnum resultCodeNum) {
        this.code = resultCodeNum.getCode();
        this.msg = resultCodeNum.getMsg();
        this.data = null;
    }
    //手动设置状态码、描述信息、数据对象
    public ReponseResult(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    //手动设置状态码、描述信息
    public ReponseResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
        this.data = null;
    }
}
