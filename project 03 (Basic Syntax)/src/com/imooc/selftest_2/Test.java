package com.imooc.selftest_2;

public class Test {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.printName();//优先访问子类自己的name变量，输出："Child's name"
    }
}

/*有关父类和子类成员变量访问顺序的总结：
1、如果成员变量同名，子类对象优先访问子类自己的成员变量
2、要想访问父类的成员变量，需要使用 super 关键字
3、但 super 关键字无法在静态上下文中使用（之前学的 this 关键字也一样）
//（实际开发中父类的很多变量都属于私有变量，一般不会直接写 super.变量名 ，而是调用 getter 方法进行访问）*/
