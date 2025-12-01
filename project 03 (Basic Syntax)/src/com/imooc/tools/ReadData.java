package com.imooc.tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadData {
    //成员变量
    private String fileName;//文件名字
    private String filePath;//文件路径

    //getter、setter方法
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
    public ReadData(String filePath, String fileName) {
        this.filePath = filePath;
        this.fileName = fileName;
    }

    //成员方法
    public void readData() {
        File path = new File(this.filePath);
        if (!path.exists()) {
            System.out.println("文件不存在");
        }
        File file = new File(this.filePath,this.fileName);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);//创建输入流对象(根据File对象创建FileReader对象)
            bufferedReader = new BufferedReader(fileReader);//创建缓冲输入流对象(根据输入流对象创建FileReader对象)
            System.out.println("文件内容如下：");
            while(true) {//读取数据
                String line = bufferedReader.readLine();//按行读取
                if (line == null) {//没有数据
                    System.out.println("文件读取结束");
                    break;
                }
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (bufferedReader != null && fileReader != null) {
                    bufferedReader.close();//关闭 BufferedReader 缓冲输出流对象
                    fileReader.close();//关闭 FileReader 输出流对象
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
