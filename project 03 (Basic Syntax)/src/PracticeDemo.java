public class PracticeDemo {
    public static void main(String[] args) {
        int speed = 50;//初始速度是50
        int hour = 1;//行驶时长
        double distance = speed*hour;
        System.out.println("一小时后的行驶里程为：" + distance + " 公里");

        speed += 10;//第二个小时速度为60
        //hour++;
        distance += speed * 1;//先算乘法，再做加赋值运算
        System.out.println("两小时后的行驶里程为：" + distance + " 公里");
    }
}
