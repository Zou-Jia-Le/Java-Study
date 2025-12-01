package com.imooc.lottery;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class CarLotteryTest {
    //静态方法
    //生成文件名：当前日期 + ".txt"，并返回文件名
    public static String createFileName() {
        LocalDateTime now = LocalDateTime.now();//当前日期时间对象
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");//指定日期格式
        String dateString = now.format(formatter);//格式化成字符串
        String fileName = dateString + ".txt";
        return fileName;
    }

    public static void main(String[] args) {
        //============================================读取============================================
        //从文件中读取所有参与摇号的编码数据
        DataRead dataRead = new DataRead("./data/serial_number.txt");
        ArrayList<String> serialNumberList = dataRead.readByLine();//按行读取 serial_number.txt 中的数据
        //============================================写入============================================
        //本期要摇出的编码数量
        int count = 5;

        //指定文件写入的目录
        String pathName = "./result";//写入文件路径
        String fileName = createFileName();//写入文件名称

        //创建目录
        File directory = new File(pathName);
        if (!directory.exists()) {
            directory.mkdir();
        }

        //创建文件对象
        File file = new File(directory,fileName);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            //创建 fileWriter 输出流对象
            fileWriter = new FileWriter(file,true);
            //创建 bufferedWriter 缓冲流对象
            bufferedWriter = new BufferedWriter(fileWriter);

            //实例化 carLotterySystem 类（carLotterySystem 是多线程的实现类（run 方法中，文件写入操作），同时继承了 DataWrite 类）
            CarLotterySystem carLotterySystem = new CarLotterySystem(bufferedWriter,serialNumberList, count);

            //创建线程
            Thread thread1 = new Thread(carLotterySystem);
            Thread thread2 = new Thread(carLotterySystem);

            //启动线程
            thread1.start();
            thread2.start();

            //阻塞线程
            try {
                thread1.join();
                thread2.join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if(fileWriter != null && bufferedWriter != null) {
                    bufferedWriter.flush();//刷新 bufferedWriter 缓冲流对象
                    bufferedWriter.close();//释放资源
                    fileWriter.close();//释放资源
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("文件写入完成，并关闭");
        //============================================结束============================================
    }
}
