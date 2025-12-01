package com.imooc.pack1;

class Vehicle {
    //静态代码块
    static {
        System.out.println("静态代码块1");
    }
    static {
        System.out.println("静态代码块2\n");
    }

    //静态变量
    private static int count = 0;//统计实例化次数

    //成员变量
    private String category;//交通工具种类
    private double speed;//最高时速

    //getter、setter方法
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        if (category == null && category.length() > 0 && category.length() <= 50) {
            this.category = category;
        } else {
            System.out.println("类别描述错误，请输入1~50个字符，默认为 car");
            this.category = "car";//默认交通工具类别为 car
        }
    }
    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        switch (this.getCategory()) {
        case "car":
            if(speed > 0 && speed <= 180) {
                this.speed = speed;
            } else {
                System.out.println("速度不符合常理，将汽车最高时速设置为默认值 180 km/h");
                this.speed = 180;
            }
            break;
        case "airplane":
            if(speed > 200 && speed <= 4000) {
                this.speed = speed;
            } else {
                System.out.println("速度不符合常理，将飞机最高时速设置为默认值 4000 km/h");
                this.speed = 4000;
            }
            break;
        default:
            if(speed > 0) {
                this.speed = speed;
            }
        }
    }
    public static int getCount() {
        return count;
    }
    public static void setCount(int count) {
        Vehicle.count = count;
        /*this.count = count;//静态方法中不能使用 this 关键字
          category = 200;//静态方法中不能访问实例变量和实例方法(实例成员)，只能访问静态变量和静态方法(静态成员)
          static int a = 100;//static 关键字不能修饰局部变量：static修饰的变量放在堆内存中，可以被所有的对象共享，相当于是全局的；而局部变量是依赖于方法的，存放在栈内存中，只能在定义它的方法内部使用*/
    }

    //构造代码块
    {
        System.out.println("构造代码块1");
    }
    {
        System.out.println("构造代码块2\n");
    }

    //构造方法
    public Vehicle() {
        System.out.println("无参构造方法\n");
        count++;
    }
    public Vehicle(String category, double speed) {
        System.out.println("双参构造方法\n");
        this.category = category;
        this.speed = speed;
        count++;
    }

    //成员方法
    protected void showInfo() {
        //局部代码块
        {
            System.out.println("局部代码块1");
        }
        {
            System.out.println("局部代码块2\n");
        }

        System.out.println("类别：" + category);
        System.out.println("最高时速：" + speed + " km/h");
    }
}

/*关于 static 关键字的总结：
1、用 static 修饰的静态方法只能访问静态变量（因为静态变量属于类，实例变量属于对象，而静态方法的加载要早于对象的加载，所以用 static 修饰的静态方法只能访问静态变量）
2、static 关键字不能修饰局部变量（因为静态变量存放在堆内存中，创建后被所有的对象共享，相当于是全局的；而局部变量存放在栈内存中并且依赖于方法的存在，只能在定义他的方法内部使用，所以它们之间互相矛盾）
3、用 static 修饰的静态方法中不能出现 this、super 关键字（因为静态方法是属于类的，随着类的加载而加载，优先于对象的存在，所以是先有的静态方法，后有的对象；而 this、 super 这两个关键字分别代表当前对象的引用、当前对象父类的引用，都是依赖于对象存在的，所以静态方法的存在早于 this 、 super 关键字，静态方法中也因此不能使用 this、super 关键字）*/

