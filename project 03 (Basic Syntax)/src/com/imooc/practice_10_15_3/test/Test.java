package com.imooc.practice_10_15_3.test;

//import com.imooc.practice_10_15_3.teacher.Score;
//import com.imooc.practice_10_15_3.student.Score;

public class Test {
    public static void main(String[] args) {
        com.imooc.practice_10_15_3.student.Score test1 = new com.imooc.practice_10_15_3.student.Score("小明",666.50);
        test1.show();
        com.imooc.practice_10_15_3.teacher.Score test2 = new com.imooc.practice_10_15_3.teacher.Score("七年八班",555.50);
        test2.show();
    }
}
