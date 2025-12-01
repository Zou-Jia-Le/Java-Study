public class FinallyDemo {
    //静态方法
    public static int test(int a, int b) {
        try {
            double result = a / b;
            System.out.println("result = " + result);
            return 1;
        } catch (Exception e) {
            System.out.println("除数不能为 0");
            return 2;
        } finally {
            System.out.println("这是 finally 代码块");
            //return 3;
        }
    }

    public static void main(String[] args) {
        System.out.println(test(10, 5));
        System.out.println("");
        System.out.println(test(10, 0));
    }
}

/*总结：
1、finally遇上try语句块中的return，或者catch语句块中的return，finally仍然会被执行
2、finally语句块中有return语句时，返回finally语句块中的return值（try语句块中的return值，或者catch语句块中的return值将不再返回），实际开发中要避免finally语句块中有return语句*/
