import java.util.Random;

public class EnumDemoTest {
    //静态方法
    public static void showOrderStatus_1() {
        //这不是创建新对象，而是获取已经存在的枚举实例
        //局部变量
        EnumDemo orderStatus = EnumDemo.UNPAID;
        switch (orderStatus) {
            case UNPAID:
                System.out.println("您还没有付款");
                break;
            case PAID:
                System.out.println("支付成功");
                break;
            case CHCKED:
                System.out.println("订单已确认");
                break;
            case DELIVERED:
                System.out.println("已发货");
                break;
            case FINISHED:
                System.out.println("订单已完成");
                break;
        }
    }
    public static void showOrderStatus_2() {
        System.out.println(EnumDemo.FINISHED.getOrderCode() + " -> " + EnumDemo.FINISHED.getOrderDesc());
        System.out.println("=============");

        for(EnumDemo orderStatus : EnumDemo.values()) {//values()是枚举类自动提供的一个静态方法，它返回包含该枚举所有常量的数组
            System.out.println(orderStatus.getOrderCode() + " -> " + orderStatus.getOrderDesc());
        }
        System.out.println("=============");

        Random random = new Random();
        int code = random.nextInt(5) + 1;//[1,6)
        System.out.print("code:" + code + " --> ");

        switch (code) {
            case 1:
                System.out.println(EnumDemo.UNPAID.getOrderDesc());
                break;
            case 2:
                System.out.println(EnumDemo.PAID.getOrderDesc());
                break;
            case 3:
                System.out.println(EnumDemo.CHCKED.getOrderDesc());
                break;
            case 4:
                System.out.println(EnumDemo.DELIVERED.getOrderDesc());
                break;
            case 5:
                System.out.println(EnumDemo.FINISHED.getOrderDesc());
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println(EnumDemo.CHCKED);
        EnumDemo enumDemo = EnumDemo.PAID;
        System.out.println(enumDemo);
        System.out.println("");

        showOrderStatus_1();
        System.out.println("");

        showOrderStatus_2();
    }
}