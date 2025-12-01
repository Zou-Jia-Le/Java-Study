package com.imooc.practice_16_20_2;

public class Test {
    public static void main(String[] args) {
        Race contestant1 = new Race("乌龟");
        Race contestant2 = new Race("兔子");
        Thread t1 = new Thread(contestant1);
        Thread t2 = new Thread(contestant2);
        t1.start();
        t2.start();
    }
}
