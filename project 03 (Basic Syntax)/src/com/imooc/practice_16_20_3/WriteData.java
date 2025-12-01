package com.imooc.practice_16_20_3;

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
    public WriteData (String filePath, String fileName) {
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
            fileWriter = new FileWriter(file,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            scanner = new Scanner(System.in);
            System.out.println("请输入数据（空白行结束）:");
            while (true) {
                String line = scanner.nextLine();
                if(line.isEmpty()){
                    break;
                }
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (bufferedWriter != null && fileWriter != null) {
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    fileWriter.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        if(scanner != null) {
            scanner.close();
        }
        System.out.println("数据已保存");
    }
}
