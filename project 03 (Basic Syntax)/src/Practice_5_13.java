public class Practice_5_13 {
    //静态方法
    public static void perPayment(int perInstalled) {
        /*if (perInstalled == 3){
            System.out.println((52.10 * 102.50 / 100) / 3 + "元");
        } else if (perInstalled == 6){
            System.out.println((52.10 * 104.50 / 100) / 6 + "元");
        } else {
            System.out.println((52.10 * 108.80 / 100) / 12 + "元");
        }*/
        switch (perInstalled) {
            case 3:
                /*double res_1 = (52.10 * 102.50 / 100) / 3;
                System.out.println("分3期还款，每期的还款金额为：" + res_1 + "元");*/
                System.out.println("分3期还款，每期的还款金额为：" + (52.10 * 102.50 / 100) / 3 + "元");
                break;
            case 6:
                /*double res_2 = (52.10 * 104.50 / 100) / 6;
                System.out.println("分6期还款，每期的还款金额为：" + res_2 + "元");*/
                System.out.println("分6期还款，每期的还款金额为：" + (52.10 * 104.50 / 100) / 6 + "元");
                break;
            default:
                /*double res_3 = (52.10 * 108.80 / 100) / 12;
                System.out.println("分12期还款，每期的还款金额为：" + res_3 + "元");*/
                System.out.println("分12期还款，每期的还款金额为：" + (52.10 * 108.80 / 100) / 12 + "元");
                break;
        }
    }
    public static void bmiTest(float weight, float height) {
        float bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("偏瘦");
        } else if (bmi <= 25) {
            System.out.println("正常体重");
        } else if (bmi <= 28) {
            System.out.println("有点胖");
        } else if (bmi <= 32) {
            System.out.println("肥胖");
        } else {
            System.out.println("严重肥胖");
        }
    }
    public static void scoreAccess(float score) {
        int res = (int)score / 10;
        switch(res) {
            case 10:
                System.out.println("学霸");
                break;
            case 9:
                System.out.println("优秀");
                break;
            case 8:
                System.out.println("良好");
                break;
            case 7:
                System.out.println("中等");
                break;
            case 6:
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格");
        }
    }

    public static void main(String[] args) {
        System.out.println("=======第一题=======");
        float score_1 = 90.5F;//小慕的成绩
        float score_2 = 99.8F;//大毛的成绩
        System.out.println(score_1 == score_2 ? "小慕和大毛的成绩相同" : "小慕和大毛的成绩不相同");
        System.out.println("");

        System.out.println("===第二题===");
        int x = 80;
        int y = 95;

        System.out.println(x >= 60 && y >= 60);//true
        System.out.println(x >= 90 && y >= 90);//false
        System.out.println(x >= 90 || y >= 90);//true

        if (x >= 80 || y++ >= 90) {
            System.out.println( "y的值是：" + y) ;//95
        }
        if (x >= 90 || y++ >= 90) {
            System.out.println( "y的值是：" + y) ;//96
        }
        if (x >= 90 && y++ >= 90) {
            System.out.println( "y的值是：" + y) ;//不执行
        }
        System.out.println("");

        System.out.println("===================第三题===================");
        perPayment(3);
        perPayment(6);
        perPayment(12);
        System.out.println("");

        System.out.println("第四题：");
        float myWeight = 125F;
        float myHeight = 55;
        bmiTest(myWeight, myHeight);
        System.out.println("");

        System.out.println("第五题：");
        scoreAccess(100);
        scoreAccess(85);
        scoreAccess(80);
        scoreAccess(65);
        scoreAccess(60);
        scoreAccess(55);
    }
}
