import java.util.LinkedList;
import java.util.List;

public class Practice_15_16_2 {
    //静态方法
    public static void calculateAmount() {
        List<Float> amounts = new LinkedList<>();
        amounts.add(99.5F);
        amounts.add(188.56F);
        amounts.add(50.12F);
        amounts.add(108.6F);
        amounts.add(23.42F);
        amounts.add(360.9F);
        amounts.add(15F);
        amounts.add(38.28F);
        amounts.add(88.8F);
        amounts.add(125.6F);
        double total1 = 0.0;

        System.out.print("所有数据向上取整后分别为：");
        for (double amount : amounts) {
            double ceil_number = Math.ceil(amount);
            total1 += ceil_number;
            System.out.print(ceil_number + "\t");
        }
        System.out.println();
        System.out.println("所有数据向上取整后的总金额为：" +  total1);

        double total2 = 0.0;
        System.out.print("所有数据向下取整后分别为：");
        for (double amount : amounts) {
            double floor_number = Math.floor(amount);
            total2 += floor_number;
            System.out.print(floor_number + "\t");
        }
        System.out.println();
        System.out.println("所有数据向下取整后的总金额为：" +  total2);

        double total3 = 0.0;
        System.out.print("所有数据四舍五入后分别为：");
        for (double amount : amounts) {
            long round_number = Math.round(amount);
            total3 += round_number;
            System.out.print(round_number + "\t");
        }
        System.out.println();
        System.out.println("所有数据四舍五入后的总金额为：" +  total3);
    }

    public static void main(String[] args) {
        calculateAmount();
    }
}
