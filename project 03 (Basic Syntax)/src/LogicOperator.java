public class LogicOperator {
    public static void main(String[] args) {
        int time = 5;
        //逻辑或运算
        boolean res1 = (time < 7) || (time > 20);
        System.out.println("res1: " + res1);

        int num = 100;
        System.out.println("-num: " + (-num));//取相反数
        //逻辑非运算
        System.out.println("!res1: " + !res1);

        int age1 = 18;
        //逻辑与运算
        boolean res2 = (age1 >= 18) && (age1 <= 70);
        System.out.println("res2: " + res2);

        int age2 = 78;
        //逻辑与运算
        boolean res3 = (age2 >= 18) && (age2 <= 70);
        System.out.println("res3: " + res3);
    }
}
