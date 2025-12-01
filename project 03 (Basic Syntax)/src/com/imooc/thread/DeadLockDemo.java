package com.imooc.thread;

public class DeadLockDemo {
    //成员对象
    Object lock1 = new Object();//钥匙1
    Object lock2 = new Object();//钥匙2

    //成员内部类
    public class ThreadLeft extends Thread {//参照标准
        //方法实现
        @Override
        public void run() {
            synchronized (lock1) {//拿到钥匙1，进入房间1
                System.out.println("线程 Left 获得了 lock1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("线程 Left 尝试获取 lock2");
                synchronized (lock2) {//还想拿到钥匙2进入房间2
                    System.out.println("线程 Left 获得了 lock2");
                }//如果能拿到钥匙2，这里会放下钥匙2
            }//放下钥匙1
            System.out.println("线程Left执行完毕");
        }
    }
    public class ThreadRight extends Thread {//死锁
        @Override
        public void run() {
            synchronized (lock2) {//拿到钥匙2，进入房间2
                System.out.println("线程 Right 获得了 lock2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("线程 Right 尝试获取 lock1");
                synchronized (lock1) {//还想拿到钥匙1进入房间1
                    System.out.println("线程 Right 获得了 lock1");
                }//如果能拿到钥匙1，这里会放下钥匙1
            }//放下钥匙2
            System.out.println("线程 Right 执行完毕");
        }
    }
    public class ThreadRight2 extends Thread {//统一的锁获取顺序，不会发生死锁
        @Override
        public void run() {
            synchronized (lock1) {//拿到钥匙1，进入房间1
                System.out.println("线程 Right2 获得了 lock1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("线程 Right2 尝试获取 lock2");
                synchronized (lock2) {//还想拿到钥匙2进入房间2
                    System.out.println("线程 Right2 获得了 lock2");
                }//如果能拿到钥匙2，这里会放下钥匙2
            }//放下钥匙1
            System.out.println("线程 Right2 执行完毕");
        }
    }
}
