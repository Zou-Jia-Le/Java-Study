package com.imooc.selftest_1;

class Child extends Parent {
    @Override
    public void show() {
        System.out.println("Child's show");
        /*super.show();//调用父类的show方法要用super关键字*/
    }

    /*public static void staticMethod() {
        super.show();//编译错误！不能在静态上下文中使用 super 关键字！
        this.show(); //编译错误！不能在静态上下文中使用 this 关键字！
    }*/
}
