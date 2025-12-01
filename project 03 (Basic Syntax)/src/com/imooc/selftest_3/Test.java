package com.imooc.selftest_3;

public class Test extends Object {//Object 类：默认所有类的“祖先”
    public static void main(String[] args) {
        Parent test1 = new Parent();
        System.out.println(test1);//默认打印地址
        Child test2 = new Child();
        System.out.println(test2);//Child 类重写了父类的 toString 方法,自定义了打印输出内容

        // Object ==> equals()，比较两个对象的引用地址是否相等
        System.out.println("test1.equals(test2)：" + test1.equals(test2));
        System.out.println("");

        String name1 = "小邹";
        System.out.println(name1);//默认打印字符串
        String name2 = "小邹";
        System.out.println(name2);//默认打印字符串

        //String ==> equals()，比较两个字符串的内容是否相等
        System.out.println("name1.equals(name2)：" + name1.equals(name2));
    }
}

//总结：string 类重写了 Object 类中的 tostring() 和 equals() 方法
