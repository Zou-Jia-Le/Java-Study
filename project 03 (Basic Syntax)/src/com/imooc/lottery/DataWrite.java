package com.imooc.lottery;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DataWrite {
    //成员对象
    public FileWriter fileWriter;
    public BufferedWriter bufferedWriter;

    //构造方法
    public DataWrite(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }
    public DataWrite(BufferedWriter bufferedWriter) {
        this.bufferedWriter = bufferedWriter;
    }

    //成员方法
    public void writeString(String content) {//写入字符串数据
        try {
            fileWriter.write(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void writeStringLine(String content) {//写入字符串和换行符
        try {
            bufferedWriter.write(content);
            bufferedWriter.newLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
