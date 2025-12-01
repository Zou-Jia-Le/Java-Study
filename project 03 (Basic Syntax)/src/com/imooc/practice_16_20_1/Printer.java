package com.imooc.practice_16_20_1;

public class Printer implements Runnable {
    //方法实现
    @Override
    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + "---正在打印第 " + i + " 张纸");
            }
        }
    }
}
