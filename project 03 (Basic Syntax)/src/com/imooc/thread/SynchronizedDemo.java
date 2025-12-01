package com.imooc.thread;

public class SynchronizedDemo implements Runnable {
    //成员变量
    private int ticketCount = 5;//总票数

    //方法实现
    @Override
    public void run() {
        while (true) {
            boolean result = this.sellTicket();
            if (!result) {
                break;
            }
        }
    }

    //成员方法
    //售票
    public synchronized boolean sellTicket() {//用 synchronized 来修饰方法
        if (ticketCount > 0) {
            ticketCount--;
            System.out.println(Thread.currentThread().getName() + "卖出一张票，还剩" + ticketCount + "张票");
            try {
                Thread.sleep(200);//线程休眠0.2秒
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {
            return false;//票卖完了
        }
        return true;
    }
}
