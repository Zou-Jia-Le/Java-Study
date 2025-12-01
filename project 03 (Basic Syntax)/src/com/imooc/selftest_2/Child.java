package com.imooc.selftest_2;

class Child extends Parent {
    //成员变量
    String name = "Child's name";

    //成员方法
    public void printName() {
        System.out.println(name);
        /*System.out.println(super.name);//调用父类的name变量要用 super 关键字*/
    }

    /*//静态方法
    public static void staticMethod() {
        System.out.println(super.name);//编译错误！不能在静态上下文中使用 super 关键字！
        System.out.println(this.name);//编译错误！不能在静态上下文中使用 this 关键字！
    }*/
}
