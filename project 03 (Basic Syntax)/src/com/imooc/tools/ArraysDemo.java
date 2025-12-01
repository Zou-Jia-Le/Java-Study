package com.imooc.tools;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        //创建两个 int 型数组
        int[] array1 = new int[]{981, 125, 666, 35, 1024};
        int[] array2 = new int[]{981, 125, 666, 35, 1231};

        //比较两个数组是否相等
        Boolean result = Arrays.equals(array1, array2);
        System.out.println(result);
        System.out.println("");

        //数组排序
        Arrays.sort(array1);
        //将数组转换为格式化的字符串打印
        System.out.println(Arrays.toString(array1));
        System.out.println("");

        //查找元素
        int index1 = Arrays.binarySearch(array1,666);
        System.out.println("index1:" + index1);
        int index2 = Arrays.binarySearch(array1,123);
        System.out.println("index2:" + index2);
    }
}
