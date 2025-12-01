package com.imooc.practice_16_20_4;

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
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            System.out.println("文件内容如下：");
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
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
                    bufferedReader.close();
                    fileReader.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
