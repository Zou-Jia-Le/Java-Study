public class ConvertDemo {
    public static void main(String[] args) {
        int i_1 = 25;
        int i_2 = 250;
        byte b_1 = (byte) i_1;//int 类型强制转换为 byte 型
        byte b_2 = (byte) i_2;//byte 型的取值范围 -128 到 127
        System.out.println("b_1的值为：" + b_1);
        System.out.println("b_2的值为：" + b_2);//超出了 byte 型范围，b_2的值产生了错误
        System.out.println("");

        int price_1 = 970;
        int price_2 = 1285;
        int price_3 = 3582;
        int sum = price_1 + price_2 + price_3;
        System.out.println("小明第一季度加油一共花了：" + sum + "元");
        float avg_1 = sum / 3;//整数 / 整数 = 整数 => float
        System.out.println("平均每个月的花销为：" + avg_1 + "元");
        float avg_2 = (float)sum / 3;//浮点数 / 整数 = 浮点数 //有时候为了提高精度，小范围向大范围进行转换时，我们也会使用强制类型转换
        System.out.println("强制转换后平均每个月的花销为：" + avg_2 + "元");
    }
}
