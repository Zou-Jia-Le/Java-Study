public class ThrowsDemo {
    //静态方法
    public static void test1 (int a, int b) throws ArithmeticException {//throws：声明异常
        double result = a / b;
        System.out.println("result = " + result);
    }
    public static void test2 (int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("除法运算中，除数不能为 0");//throw：抛出一个异常对象
        }
        double result = a / b;
        System.out.println("result = " + result);
    }

    public static void main(String[] args) {
        try {
            test1(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("数学计算异常，除数不能为0");
        }
        System.out.println("");

        test2(10, 2);
        test2(10, 0);
        test2(10, 2);//不会执行
    }
}
