package com.imooc.utils.exception_handler.exception;

//自定义异常 --> 目的：统一处理异常信息；便于解耦，可以在拦截器、控制层、业务层去使用
public class MyCustomException extends RuntimeException {
    //构造方法
    public MyCustomException(String errorMsg) {
        super(errorMsg);
    }

    //成员方法
    public static MyCustomException display(String errorMsg) {
        throw new MyCustomException(errorMsg);
    }
}
