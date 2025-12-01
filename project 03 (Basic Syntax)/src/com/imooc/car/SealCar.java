package com.imooc.car;

public class SealCar extends OceanCar {
    //成员变量
    private int power = 530;//最大马力

    //getter、setter方法
    //方法重写：父类与子类有完全相同的方法
    @Override//@Override注解：表示方法重写
    public int getPower() {//访问修饰符不可以改成 private ，因为子类重写方法的权限必须大于等于父类被重写方法的权限
        return power;
    }
    @Override//@Override注解：表示方法重写
    public void setPower(int power) {//访问修饰符不可以改成 private ，因为子类重写方法的权限必须大于等于父类被重写方法的权限
        this.power = power;
    }

    //构造方法
    public SealCar() {
        //super();          /*如果父类中有无参构造方法，那么子类的构造方法中其实隐藏了一个父类的无参构造方法，并且父类的这个构造方法只能放在子类构造方法内的第一行*/
        super("海豹");/*如果父类中没有无参构造方法，那么子类的构造方法中一定要写一个相应的父类构造方法，并且父类的这个构造方法只能放在子类构造方法内的第一行
                             (其实子类中依然隐藏了一个 super ()，只不过会因为检测不到父类中有无参的构造方法而报错)*/
        System.out.println("子类的无参构造方法");
    }

    //成员方法
    /*//静态方法无法被重写：
    @Override
    public static void charge() {
        System.out.println("海豹汽车正在充电...");
    }*/

    /*//私有方法无法被重写：
    如果父类的 drive 方法是 private ，那么下面这个 drive 方法并不属于方法重写，
    因为私有方法无法被重写，那么下面这个 show 方法仅仅是相当于声明了一个新的 show 方法*/
    public void drive() {//不是方法重写，也不是方法重载，仅仅是 Seal 类自己生命的一个 drive() 方法
        System.out.println("双电机四驱的海豹，正在马路上狂奔...");
    }

    //方法重载：方法同名，但形参的类型、个数、名字可能不同
    /*//即使删去下面第一个无参的 show 方法，第二个带参的 show 方法依然属于方法重载，因为子类已经继承了父类的无参 show 方法
    public void show() {//方法重写
        //访问父类的成员方法：
        super.show();
        //访问自己的成员变量
        System.out.println("子类的 power = " + power);
        /*访问父类的成员变量:
        System.out.println("父类的 power = " + super.getPower());
    }*/
    public void show(int a) {//方法重载
        System.out.println("方法重载，a =" + a);
    }
}

/*有关子类调用构造方法的总结：
  1、如果父类中有无参构造方法，那么子类的构造方法中其实隐藏了一个父类的无参构造方法，并且父类的这个构造方法只能放在子类构造方法内的第一行
  2、如果父类中没有无参构造方法，那么子类的构造方法中一定要写一个相应的父类构造方法，并且父类的这个构造方法只能放在子类构造方法内的第一行
    (其实子类中依然隐藏了一个 super ()，只不过会因为检测不到父类中有无参的构造方法而报错)*/

/*关于方法重写的总结：
1、静态方法无法被重写
2、私有方法无法被重写
3、子类重写方法的权限必须大于等于父类被重写方法的权限*/