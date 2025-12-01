package com.imooc.student;

public class StudentCodeException extends RuntimeException {//继承 RuntimeException 类,自定义异常
    //构造方法
    public StudentCodeException() {
    }
    public StudentCodeException(String message) {
        super(message);//调用父类的构造方法
    }
}
