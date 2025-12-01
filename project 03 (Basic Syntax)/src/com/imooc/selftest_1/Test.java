package com.imooc.selftest_1;

public class Test {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();//优先访问子类自己的show方法，输出 Child's show
    }
}

/*有关父类和子类成员方法访问顺序的总结：
1、如果成员方法同名，子类对象优先访问子类自己的成员方法
2、要想访问父类的成员方法，需要使用 super 关键字
3、但 super 关键字无法在静态上下文中使用（之前学的 this 关键字也一样）*/
