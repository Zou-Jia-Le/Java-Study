package com.imooc.practice_15_16_3;

import java.util.Scanner;

public class Test {
    //静态方法
    public static void searchForPositions (int num) {
        switch (num) {
            case 1:
                System.out.println(Position.VISITOR.getStatusCode() + " -> " + Position.VISITOR.getDescriptionInformation());
                break;
            case 2:
                System.out.println(Position.TRAINEE.getStatusCode() + " -> " + Position.TRAINEE.getDescriptionInformation());
                break;
            case 3:
                System.out.println(Position.INSTRUCTOR.getStatusCode() + " -> " + Position.INSTRUCTOR.getDescriptionInformation());
                break;
            case 4:
                System.out.println(Position.ADMINISTRATOR.getStatusCode() + " -> " + Position.ADMINISTRATOR.getDescriptionInformation());
                 break;
            case 5:
                 System.out.println(Position.SUPERADMINISTRATOR.getStatusCode() + " -> " + Position.SUPERADMINISTRATOR.getDescriptionInformation());
                 break;
        }
    }

    public static void main(String[] args) {
        System.out.print("请输入您想查询职位的状态码(1~5)：");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        searchForPositions(num);
    }
}
