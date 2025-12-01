package com.imooc.student;

public class Teacher {
    //构造方法
    public Teacher() {
    }

    //成员方法
    //验证输入的学籍号是否正确
    public boolean studentCodeValidate (String studentCode) throws StudentCodeException {//声明异常
        if (studentCode.length() != 19) {
            throw new StudentCodeException("学籍号长度必须是19位");//抛出异常对象
        } else if (studentCode.charAt(0) != 'G') {
            throw new StudentCodeException("学籍号以大写字母G开头");//抛出异常对象
        }
        return true;
    }
}
