package com.imooc.lottery;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataRead {
    //成员变量
    private String fileName;

    //构造方法
    public DataRead(String fileName) {
        this.fileName = fileName;
    }

    //成员方法
    public void readByChar() {//按字符读取数据
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(fileName);
            //循环读取字符
            while(true) {
                int ch = fileReader.read();//read 方法返回 int 值
                if(ch == -1){
                    break;
                }
                System.out.println((char)ch);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if(fileReader != null) {
                    fileReader.close();//关闭资源
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public ArrayList<String> readByLine(){//按行读取数据3
        ArrayList<String> arrayList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);
            //循环按行读取字符
            while(true) {
                String str = bufferedReader.readLine();//readLine 方法返回 String 字符串
                if(str == null) {
                    break;
                }
                if(!str.isEmpty()) {
                    arrayList.add(str.trim());//trim() 方法舍去字符串两边空格
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if(fileReader != null && bufferedReader != null) {
                    bufferedReader.close();
                    fileReader.close();//关闭资源
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }
}
