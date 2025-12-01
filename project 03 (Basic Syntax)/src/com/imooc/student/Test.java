package com.imooc.student;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入学籍号：");
        String code = scanner.next();
        Teacher teacher = new Teacher();
        try {
            teacher.studentCodeValidate(code);
            System.out.println("学籍号正确，可以录入");
        } catch (StudentCodeException e) {
            System.out.println(e.getMessage());
        }
    }
}
