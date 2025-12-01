public class ArgsTest {
    //静态方法
    public static void guessAge(int age) {//形参
        age --;
        System.out.println("guessAge 方法中，age = " + age);
    }
    //方法重载
    public static void guessAge(Args args) {//形参
        args.setAge(20);
        System.out.println("guessAge 方法中，age = " + args.getAge());
    }

    public static void main(String[] args1) {
        int age = 18;//实参
        System.out.println("age = " + age);
        guessAge(18);
        System.out.println("main 方法中，age = " + age);

        System.out.println("");

        Args args2 = new Args(18);//实参
        System.out.println("args1 = " + args2);
        guessAge(args2);
        System.out.println("main 方法中，age = " + args2.getAge());
    }
}

/*有关参数传递的总结：
1、参数为基本数据类型时，把实参变量的值传递给形参，对形参的处理，不会影响到实参
2、参数为引用数据类型时，把实参的地址值传递给形参，对形参的处理，会影响到形参*/
