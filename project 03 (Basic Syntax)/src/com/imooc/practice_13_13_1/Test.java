package com.imooc.practice_13_13_1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.print("请输入取款金额：");
        Scanner scanner = new Scanner(System.in);
        int withdrawalAmount = scanner.nextInt();
        ATM ATM = new ATM();
        if (withdrawalAmount % 100 != 0) {
            System.out.println("输入的金额只能为百元数字，如100、200、300等");
        } else if (withdrawalAmount >= 1000) {
            System.out.println("账户余额不足");
        }
        try {
            ATM.withdrawal(withdrawalAmount);
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        finally {
            scanner.close();
        }
    }
}
