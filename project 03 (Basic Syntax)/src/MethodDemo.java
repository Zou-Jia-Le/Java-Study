public class MethodDemo {
    //静态方法
    //定义方法，判断小邹得的成绩
    public static void scoreAccess(float score) {
        if (score >= 60F) {
            System.out.println("成绩及格了");
        } else {
            System.out.println("仍需要努力");
        }
    }
    public static void heightAccess(float height) {
        if (height >= 150F) {
            System.out.println("身高过关");
        } else {
            System.out.println("加强营养");
        }
    }
    public static void weekPlan(int day) {
        if ((day >= 1) && (day <= 5)) {
            System.out.println("小邹要去学校上课");
        } else {
            if (day == 6) {
                System.out.println("小邹要在家写作业");
            } else {
                System.out.println("小邹要出去看电影");
            }
        }
    }
    public static void scoreAccess_2(float score) {
        if (score == 100F) {
            System.out.println("学霸");
        } else if (score>=90) {
            System.out.println("优秀");
        } else if (score>=80) {
            System.out.println("良好");
        } else if (score>=70) {
            System.out.println("中等");
        } else if (score>=60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
    }

    public static void main(String[] args) {
        float xiaozouScore = 66F;
        scoreAccess(xiaozouScore);
        float damaoScore = 80F;
        scoreAccess(damaoScore);
        System.out.println("");

        float xiaozouheight = 185F;
        heightAccess(xiaozouheight);
        float damaoheight = 111F;
        heightAccess(damaoheight);
        System.out.println("");

        int day1 = 2;
        weekPlan(day1);
        int day2 = 7;
        weekPlan(day2);
        System.out.println("");

        float xiaozouscore = 77F;
        scoreAccess_2(xiaozouscore);
        float xiaozouscore_2 = 88F;
        scoreAccess_2(xiaozouscore_2);
    }
}
