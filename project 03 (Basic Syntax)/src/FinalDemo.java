public class FinalDemo {
    public static void main(String[] args) {
        final int TANK_VALUE = 50;
        //TANK_VALUE = 55;//常量不能再次赋值
        float price = 9.5F;//当前油价
        float totalPrice;//总花销

        totalPrice = price * TANK_VALUE;
        System.out.println("油价是 9.5 元，总花销是 " + totalPrice + " 元");

        price = 10.2F;//油价变化后
        totalPrice = price * TANK_VALUE;
        System.out.println("油价是 10.2 元，总花销是 " + totalPrice + " 元");
    }
}
