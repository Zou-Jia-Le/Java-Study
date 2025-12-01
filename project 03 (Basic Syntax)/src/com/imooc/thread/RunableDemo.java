package com.imooc.thread;

public class RunableDemo implements Runnable {//实现 Runnable 接口
    //成员变量
    private int ticketCount = 5;//总票数

    //方法实现
    @Override
    public void run() {
        /*for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + "卖出第" + i + "张票");
        }*/

        while(true) {
            //将可能有安全问题的代码加锁
            synchronized (this) {
                if (ticketCount > 0) {
                    ticketCount--;
                    System.out.println(Thread.currentThread().getName() + "卖出一张票，还剩" + ticketCount + "张票");
                    try {
                        Thread.sleep(200);//线程休眠0.2秒
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    break;
                }
            }
        }
    }
}
