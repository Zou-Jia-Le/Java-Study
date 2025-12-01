package com.imooc.demo;

public class GetCurrentDirectory {
    public static void main(String[] args) {
        String currentPath = System.getProperty("user.dir");
        System.out.println("当前工作目录是: " + currentPath);
    }
}