import java.util.Scanner;

public class Practice_6_13 {
    //静态方法
    public static void arithmeticFlip() {
        int num = 5678;
        int num_1 = num % 10;
        int num_2 = num / 10 % 10;
        int num_3 = num / 100 % 10;
        int num_4 = num / 1000 % 10;
        int res = num_1 * 1000 +  num_2 * 100 + num_3 * 10 + num_4;
        System.out.println(res);
    }
    public static void fourLeafRoseNumber() {
        int num = 1000;
        while (num < 10000) {
            int num_1 = num % 10;
            int num_2 = num / 10 % 10;
            int num_3 = num / 100 % 10;
            int num_4 = num / 1000 % 10;
            if ((num_1 * num_1 * num_1 * num_1) + (num_2 * num_2 * num_2 * num_2) + (num_3 * num_3 * num_3 * num_3) + (num_4 * num_4 * num_4 * num_4) == num) {
                System.out.println(num + " 是四叶玫瑰数");
            }
            num++;
        }
    }
    public static void totalCose() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入钢笔的价格（元）：");
        double cose_1 = sc.nextDouble();
        System.out.print("请输入水杯的价格（元）：");
        double cose_2 = sc.nextDouble();
        System.out.println("一共需要支付 " + (cose_1 + cose_2) + " 元");
    }
    public static void ageGame() {
        int n = 3;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= n; i++) {
            System.out.print("请输入年龄：");
            int age = sc.nextInt();
            if (age == 18) {
                System.out.println("恭喜你，猜对了");
                break;
            } else {
                System.out.println("没猜对，再来一次吧");
            }
        }
    }
    public static void seatNumber() {
        for (int i = 1; i <= 10; i++) {
            for (char j = 'A'; j <= 'F'; j++) {
                if (j != 'E') {
                    System.out.print(i + "" + j + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("=========第一题=========");
        arithmeticFlip();
        System.out.println("");

        System.out.println("=========第二题=========");
        fourLeafRoseNumber();
        System.out.println("");

        System.out.println("=========第三题=========");
        totalCose();
        System.out.println("");

        System.out.println("=========第四题=========");
        ageGame();
        System.out.println("");

        System.out.println("=========第五题=========");
        seatNumber();
    }
}
