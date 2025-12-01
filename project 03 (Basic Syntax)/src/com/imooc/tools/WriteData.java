package com.imooc.tools;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteData {
    //成员变量
    private String fileName ;//文件名字
    private String filePath ;//文件路径

    //setter、getter方法
    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public String getFilePath() {
        return filePath;
    }
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    //构造方法
    public WriteData(String filePath, String fileName) {
        this.fileName = fileName;
        this.filePath = filePath;
    }

    //成员方法
    public void writeData() {//创建路径
        File directory = new File(this.filePath);
        if(!directory.exists()) {
            directory.mkdirs();
        }
        File file = new File(this.filePath,this.fileName);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        Scanner scanner = null;
        try {
            fileWriter = new FileWriter(file,true);//创建输出流对象(根据File对象创建FileWriter对象，true表示在原文件之后追加内容)
            bufferedWriter = new BufferedWriter(fileWriter);//创建缓冲流对象(根据输出流对象创建FileWriter对象)
            scanner = new Scanner(System.in);
            System.out.println("请输入数据（空白行结束）:");
            while(true) {//写入数据
                String line = scanner.nextLine();
                if(line.isEmpty()) {//出现空行
                    break;
                }
                bufferedWriter.write(line);//将数据写入到缓冲区
                bufferedWriter.newLine();//写入一个换行符
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (bufferedWriter != null && fileWriter != null) {
                    bufferedWriter.flush();//刷新 BufferedWriter 缓冲输入流对象
                    fileWriter.close();//刷新 FileWriter 输入流对象
                    bufferedWriter.close();//关闭 BufferedWriter 缓冲输入流对象
                    fileWriter.close();//关闭 FileWriter 输入流对象
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        if (scanner != null) {//Scanner 对象为空对象
            scanner.close();//关闭 Scanner 对象，并释放相关的系统资源
        }
        System.out.println("数据已保存");
    }
}
