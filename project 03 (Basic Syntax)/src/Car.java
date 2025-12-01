public class Car {
    //this指当前对象的引用！！！

    //成员变量
    public float price;//价格
    public char color;//颜色
    public int mileage;//里程

    //构造方法
    //如果不写构造方法，Java 默认无参构造
    public Car() {
        System.out.println("无参构造方法");
    }
    public Car (float price, int mileage) {//构造方法重载
        /*用一个构造方法去调用另一个构造方法，被构用构造方法必须放在调用构造方法的第一行
        用构造方法去调用另一个构造方法，最多只能放一个被调用构造方法，否则编译器会报错！！！*/
        this();//Car 的双参构造方法调用了 Car 的无参构造方法
        this.price = price;
        this.mileage = mileage;
        System.out.println("双参构造方法--this：" + this);
    }
    public Car (float price, char color, int mileage) {//构造方法重载
        /*用一个构造方法去调用另一个构造方法，被构用构造方法必须放在调用构造方法的第一行
        用构造方法去调用另一个构造方法，最多只能放一个被调用构造方法，否则编译器会报错！！！*/
        this();//Car 的三参构造方法调用了 Car 的无参构造方法
        this.price = price;
        this.color = color;
        this.mileage = mileage;
        System.out.println("三参构造方法--this：" + this);
    }

    //成员方法
    public void charge() {//充电的方法
        System.out.println("汽车正在充电");
    }
    public void drive() {//行驶的方法
        System.out.println(this.color + "汽车正在马路上狂奔");
        System.out.println("续航里程：" + this.mileage + "公里");
        System.out.println("汽车的价格是：" + this.price + "元");
    }
}
