package com.imooc.thread;

public class Test {
    public static void main(String[] args) {
        //获取主线程
        Thread thread = java.lang.Thread.currentThread();
        System.out.println("主线程名：" + thread.getName());
        System.out.println("");

        ThreadDemo thread1 = new ThreadDemo("窗口1");
        ThreadDemo thread2 = new ThreadDemo("窗口2");
        ThreadDemo thread3 = new ThreadDemo("窗口3");
        DaemonThread thread4 = new DaemonThread("临时售票窗口");

        //设置线程优先级
        thread1.setPriority(java.lang.Thread.MIN_PRIORITY);//线程优先级为1
        thread2.setPriority(java.lang.Thread.MAX_PRIORITY);//线程优先级为10
        System.out.println("thread1 优先级：" + thread1.getPriority());
        System.out.println("thread2 优先级：" + thread2.getPriority());
        System.out.println("thread3 优先级：" + thread3.getPriority());//默认线程优先级为5
        System.out.println("");

        //下面三个是非守护线程，也叫做用户线程
        thread1.start();
        thread2.start();
        thread3.start();
        //将 thread4 设置为守护线程 ==> 为其它线程服务的线程，当运行的线程都是守护线程，JVM结束运行
        thread4.setDaemon(true);
        //守护线程必须设置在其 start() 之前
        thread4.start();

        try {
            thread1.join();//主线程被阻塞，等待 thread1 执行结束
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("主线程执行结束");
    }
}

/*创建线程的两种方式总结：
方式一：
1、创建子类继承 Thread 类
2、用子类的构造方法调用 Thread 类的构造方法
（不调用父类的构造方法也行，但调用了父类的构造方法能方便设置线程名）
3、子类重写 Thread 类的 run() 方法
4、用第二步的构造方法来创建子类对象
5、通过子类对象调用 start() 来启动线程

方式二：
1、创建子类实现 Runnable 接口
2、重写子类的 run() 方法
3、创建子类对象
4、创建 Thread 类对象，子类对象作为其构造方法的参数,也可额外传入一个 String 类参数作为线程名
5、通过 Thread 类对象调用 start() 来启动线程*/

