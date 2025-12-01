public class AssignDemo {
    public static void main(String[] args) {
        int a = 5;
        a += 50;//加赋值
        System.out.println("a 的值是：" + a);

        byte b = 20;
        //b = b + 30;//b + 30 => int,不能赋值给byte型变量
        b += 30;//b + 30 结果为 int 型，之后 又强制转换成 byte 型赋给 byte 型变量 b
        System.out.println("b 的值是：" + b);

        //总结：b += 30;内部其实发生了强制类型转换
    }
}
