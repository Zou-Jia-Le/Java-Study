package com.imooc.thread;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo implements Runnable {
    //成员变量
    private int ticketCount = 5;//总票数

    //成员对象
    ReentrantLock lock = new ReentrantLock();//创建锁对象

    //方法实现
    @Override
    public void run() {
        while (true) {
            lock.lock();//上锁
            try {
                if(ticketCount > 0) {
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
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();//开锁，必须在finally中释放！！！
            }
        }
    }
}
