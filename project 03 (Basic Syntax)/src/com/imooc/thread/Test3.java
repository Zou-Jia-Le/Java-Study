package com.imooc.thread;

public class Test3 {
    public static void main(String[] args) {
        DeadLockDemo deadLockDemo = new DeadLockDemo();
        DeadLockDemo.ThreadLeft threadLeft = deadLockDemo.new ThreadLeft();
        DeadLockDemo.ThreadRight threadRight1 = deadLockDemo.new ThreadRight();
        DeadLockDemo.ThreadRight2 threadRight2 = deadLockDemo.new ThreadRight2();

        threadLeft.start();
        //threadRight1.start();//线程 threadLeft 和线程 threadRight1 同时运行会导致死锁
        threadRight2.start();
    }
}
