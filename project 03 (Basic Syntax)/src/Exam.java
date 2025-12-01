import java.util.Scanner;

public class Exam {
    //静态方法
    public static void exam() {
        int count = 0;//抽题次数
        int score_1 = 0;//笔试成绩
        int score_2 = 0;//机试成绩
        Scanner sc = new Scanner(System.in);
        while (count < 5) {
            count++;
            System.out.println("=======第" + count + "次考试=======");
            System.out.print("请输入笔试的成绩：");
            score_1 = sc.nextInt();
            if (score_1 >= 60) {
                System.out.println("笔试成绩合格,请进行机试");
                System.out.print("请输入机试的成绩：");
                score_2 = sc.nextInt();
                if (score_2 >= 60) {
                    System.out.println("恭喜你！考试合格！");
                    System.out.println("考试总成绩为：" + (score_1 + score_2));
                    break;
                } else {
                    System.out.println("机试成绩不合格，请重考!");
                }
            } else {
                if(count < 5){
                System.out.println("笔试成绩不合格，请重考笔试!");
                } else {
                    System.out.println("成绩不合格，5次机会用完啦!");
                    System.out.println("最后的一次笔试成绩为：" + score_1);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        exam();
    }
}
