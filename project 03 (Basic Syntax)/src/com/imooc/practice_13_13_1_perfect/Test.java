package com.imooc.practice_13_13_1_perfect;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        double balance = 1000.0;//账户余额
        System.out.print("请输入取款金额（必须是百元整数，如100、200、300等）: ");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        ATM atm = new ATM();
        try {
            atm.amountValidate(balance,amount);//验证输入的取款金额是否正确
            System.out.println("本次取款金额为：" + amount + "元，感谢您的使用～");
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
