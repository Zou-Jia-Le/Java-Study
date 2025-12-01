public class CarTest {
    public static void main(String[] args) {
        //this 究竟是什么？ -- 当前对象的引用

        System.out.println("===============1===============");
        Car c3 = new Car();
        System.out.println("");

        //通过一个构造方法调用另一个构造方法的过程如下：
        System.out.println("===============2===============");
        //创建Car对象
        Car c1 = new Car(222222F,550);//Car 的双参构造方法调用了 Car 的无参构造方法
        System.out.println("打印c1：" + c1);
        Car c2 = new Car(333333F,'灰',750);//Car 的三参构造方法调用了 Car 的无参构造方法
        System.out.println("打印c2：" + c2);
        System.out.println("");

        //创建匿名对象以及匿名对象调用成员变量和成员方法的过程如下：
        System.out.println("===============3===============");
        //创建创建两个匿名对象,并分别调用成员方法
        System.out.println("匿名对象1：");
        new Car(100000F,500).drive();
        System.out.println();
        //每次 new 出来的都是一个新的匿名对象，虽然上下两行代码一样，但实际上它们是两个匿名对象(从 this 关键字可以看出它们的地址不同)
        System.out.println("匿名对象2：");
        new Car(200000F,800).drive();
        /*匿名对象只能使用一次，也是在堆内存中开辟空间，由于没有名字，也就不存在栈内存中的引用
        匿名对象是对象的一种简写形式，具有普通对象的所有功能*/
        System.out.println("");

        /*//访问成员变量
        c1.price = 199999F;
        c1.color = '灰';
        c1.mileage = 600;
        System.out.println(c1.price);
        System.out.println(c1.color);
        System.out.println(c1.mileage);*/

        //使用成员方法
        System.out.println("===============4===============");//双参构造方法创建出来的对象使用成员方法
        c2.charge();
        c2.drive();//由于是双参，没有传入 color 的参数，所以Car 类 drive()方法中的 this.color 显示为空字符
        System.out.println("");

        System.out.println("===============5===============");//三参构造方法创建出来的对象使用成员方法
        c1.charge();
        c1.drive();
    }
}
