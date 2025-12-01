package com.imooc.practice_16_20_1;

public class Test {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread t1 = new Thread(printer,"打印机 1");
        Thread t2 = new Thread(printer,"打印机 2");
        t1.start();
        t2.start();
    }
}
