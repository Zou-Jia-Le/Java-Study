public class TryDemo_1 {
    //静态方法
    public static void divide(int n1,int n2) {
        try {
            //可能会产生异常的语句
            System.out.println("n1 / n2 = " + n1 / n2);
        } catch (Throwable throwable) {
            //处理异常
            System.out.println("getMessage(): " + throwable.getMessage());
            System.out.println("toString(): " + throwable.toString());
            System.out.println("printStackTrace()输出信息如下: ");
            throwable.printStackTrace();
        }
    }

    public static void main(String[] args) {
        divide(99,0);
        //divide(99,25);
    }
}
