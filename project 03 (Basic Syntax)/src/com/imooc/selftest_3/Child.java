package com.imooc.selftest_3;

public class Child extends Parent {
    //成员变量
    public int num;

    //成员方法
    @Override//重写 Object 类的 toString 方法
    public String toString() {
        return "Child{" +
                "num=" + num +
                '}';
    }
}
