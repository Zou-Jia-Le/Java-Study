package com.imooc.thread;

public class ThreadDemo extends Thread {//继承 Thread 类
    //构造方法
    public ThreadDemo() {
    }
    public ThreadDemo(String name) {
        super(name);//调用 Thread 类的构造方法
    }

    //成员方法
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + "卖出第" + i + "张票");
            try {
                sleep(200);//线程休眠0.2秒
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
