package com.imooc.thread;

public class Test2 {
    public static void main(String[] args) {
        LockDemo runnableDemo = new LockDemo();
        Thread thread1 = new Thread(runnableDemo,"窗口1");
        Thread thread2 = new Thread(runnableDemo,"窗口2");

        thread1.start();
        thread2.start();
    }
}

/*实现线程同步的两种方式总结:
方式一：使用 synchronized 代码块，或者使用 synchronized 访问修饰符来对成员方法进行修饰
方式二： 1、ReentrantLock lock = new ReentrantLock();//创建锁对象
        2、lock.lock();
        3、lock.unlock();//必须在 finally 中释放！！！*/

