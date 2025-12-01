package com.imooc.lottery;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
    //静态方法
    public static void createFile() {
        File directory = new File("./test");//创建File对象，表示要创建的目录路径

        /*File file1 = new File("./test/file1.txt");//方式1：直接路径
          File file2 = new File(directory,"file2.txt");//方式2：目录对象+文件名*/
        File file3 = new File("./test","file3.txt");//方式3：目录路径+文件名

        System.out.println(file3.getName() + " 是否存在：" + file3.exists());//检查文件是否存在

        try {
            directory.mkdir();//创建单级目录，如果父目录不存在会失败
            file3.createNewFile();//创建新文件，如果文件已存在返回 false;创建成功返回 true
        } catch (IOException e) {//异常处理
            throw new RuntimeException(e);//将受检异常转化为运行时异常
        }
        System.out.println(file3.getName() + " 是否存在：" + file3.exists());//再次检查文件是否存在
    }

    public static void main(String[] args) {
        String pathName = "./result";//写入文件路径
        String fileName = "res_data.txt";//写入文件名称

        File directory = new File(pathName);
        if (!directory.exists()) {
            directory.mkdir();//创建目录
        }

        File file = new File(directory,fileName);//实例化 File 类，file为文件路径

        FileWriter fileWriter = null;//声明 fileWriter 输出流对象
        BufferedWriter bufferedWriter = null;//声明 bufferedWriter 缓冲流对象

        try {
            fileWriter = new FileWriter(file,true);//创建 fileWriter 输出流对象
            bufferedWriter = new BufferedWriter(fileWriter);//创建 bufferedWriter 缓冲流对象

            DataWrite dataWrite = new DataWrite(bufferedWriter);//实例化 DataWrite 类
            dataWrite.writeStringLine("test1");
            dataWrite.writeStringLine("test2");
            System.out.println("写入数据完成");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if(fileWriter != null && bufferedWriter != null) {
                    fileWriter.flush();//刷新 fileWriter 输出流对象
                    bufferedWriter.flush();//刷新 bufferedWriter 缓冲流对象
                    bufferedWriter.close();//关闭 fileWriter 输出流对象
                    fileWriter.close();//关闭 bufferedWriter 缓冲流对象
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
