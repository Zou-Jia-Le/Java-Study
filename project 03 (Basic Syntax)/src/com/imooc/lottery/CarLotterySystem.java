package com.imooc.lottery;

import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Collections;

public class CarLotterySystem extends DataWrite implements Runnable {
    //成员变量
    private ArrayList<String> serialNumber;//申请编码池
    private int count;//本期指标数

    //方法实现
    @Override
    public void run() {//run方法中执行文件写入操作
        while (true) {
            synchronized (this) {
                if(count==0) {
                    break;
                }else {
                    Collections.shuffle(serialNumber);//随机打乱元素顺序
                    String selectNumber = serialNumber.remove(0);
                    System.out.println(Thread.currentThread().getName() + "摇出的编码为：" + selectNumber);
                    writeStringLine(selectNumber);//将摇出的编码写入文件（多个线程写同一个文件，所以要放在 synchronized 代码块中进行写入操作）
                    count--;
                }
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    //构造方法
    public CarLotterySystem(BufferedWriter bufferedWriter, ArrayList<String> serialNumber, int count) {
        super(bufferedWriter);
        this.serialNumber = serialNumber;
        this.count = count;
    }
}
