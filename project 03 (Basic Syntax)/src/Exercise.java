public class Exercise {
    //静态方法
    public static void distance_1() {//for 循环
        int speed = 50;
        int hour = 1;
        int n = 5;
        double distance = 0;
        for (; hour <= n ;) {
            hour++;
            double hourDistance = speed * 1;
            distance += hourDistance;
            speed += 10;
            System.out.println("第" + hour + "个小时的行驶里程为：" + distance + "公里");
        }
        System.out.println("");
    }
    public static void distance_2() {//while 循环
        int speed = 50;
        int hour = 1;
        double distance = 0;
        while (hour <= 5) {
            double hourDistance = speed * 1;
            distance += hourDistance;
            System.out.println("第" + hour + "个小时的行驶里程为：" + distance + "公里");
            speed += 10;
            hour++;
        }
        System.out.println("");
    }
    public static void distance_3() {//do while 循环
        int speed = 50;
        int hour = 1;
        double distance = 0;
        do {
            double hourDistance = speed * 1;
            distance += hourDistance;
            System.out.println("第" + hour + "个小时的行驶里程为：" + distance + "公里");
            speed += 10;
            hour++;
        } while (hour <= 5);
    }

    public static void main(String[] args) {
        distance_1();
        distance_2();
        distance_3();
    }
}
