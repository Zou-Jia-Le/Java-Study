import java.util.Scanner;

public class LoopDemo {
    //静态方法
    public static void whileDemo() {
        int remainCharge = 65;//剩余电量
        int count = 0;//记录圈数
        while (remainCharge >= 10) {
            count++;//每跑一圈，圈数+1圈
            System.out.print("第 " + count + " 圈跑完后，");
            remainCharge -= 10;//每跑一圈，电量-10度
            System.out.println("剩余电量为：" + remainCharge);
        }
        System.out.println("车子要没电了，不够再跑一圈啦~");
    }
    public static void doWhileDemo() {
        int num = 100;
        int n1;//个位
        int n2;//十位
        int n3;//百位
        do {
            n1 = num % 10;//取个位
            n2 = num / 10 % 10;//取十位
            n3 = num / 100 % 10;//取百位
            if (n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3 == num) {
                System.out.println(num + " 是水仙花数");
            }
            num++;
        } while (num <= 999);
    }
    public static void forDemo() {
        int num = 1;
        for ( ; ; ) {
            num++;
            //System.out.println("第" + num + "次循环");
            if ((num % 10 == 7) || (num / 10 % 10 == 7) || (num % 7 == 0)) {//个位是7、十位是7、能被7整除
                System.out.println(num + " 拍拍手");
            }
            if (num > 100) {
                break;
            }
        }
    }
    public static void continueDemo() {
        int num = 1;//接收从键盘输入的数字，表示用户输入的号码
        int count = 3;
        Scanner sc = new Scanner(System.in);
        while (count >= 1) {
            count--;
            System.out.print("请输入你的幸运数字：");
            num = sc.nextInt();
            if(num != 7) {
                System.out.println("没有中奖,剩余次数为：" + count);
                continue;
            }
            System.out.println("恭喜你，请前去兑换奖品！");
            break;
        }
    }

    public static void main(String[] args) {
        whileDemo();
        System.out.println("");

        doWhileDemo();
        System.out.println("");

        forDemo();
        System.out.println("");

        System.out.print("请输入本次比赛得分：");
        Scanner sc = new Scanner(System.in);
        int score1 = sc.nextInt();//接收int型数据
        System.out.println("您输入的比赛分数是：" + score1);
        System.out.print("请输入科目二的分数：");
        float score2 = sc.nextFloat();//接收float型数据
        System.out.println("您输入的科目二得分：" + score2);
        System.out.println("");

        continueDemo();
    }
}
