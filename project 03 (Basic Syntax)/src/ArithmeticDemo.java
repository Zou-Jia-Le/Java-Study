public class ArithmeticDemo {
    public static void main(String[] args) {
        int num_1 = 100;
        int num_2 = 9;
        int remainder = num_1 % num_2;
        System.out.println("num_1 除以 num_2 的余数：" + remainder);

        //System.out.println(num_1 / 0);

        int i =100;//声明int型变量
        float f = 13.14F;//声明float型变量
        double d = 125.125;//声明double型变量
        System.out.println("int 型与 float 型做加法运算：" + (i + f));
        System.out.println("float 型与 double 型做乘法运算：" + (f * d));
        System.out.println("int 型与 double 型做除法运算：" + (i / d));
    }
}
