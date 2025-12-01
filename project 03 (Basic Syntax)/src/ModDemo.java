public class ModDemo {
    public static void main(String[] args) {
        int a = 5;

        int res_1 = a++ + 15;//1、res_1 = a+15 = 20 || 2、a+1 = 6
        System.out.println("res_1：" + res_1);
        System.out.println("a：" + a);

        int res_2 = ++a + 15;//1、a+1 = 6+1 = 7 || 2、res_2 = 7+15 = 22
        System.out.println("res_2：" + res_2);
        System.out.println("a：" + a);
    }
}