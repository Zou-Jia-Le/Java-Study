package com.imooc.polymorhism;

public class Test {
    public static void main(String[] args) {
        //向上转型：
        OceanCar seal1 = new SealCar();
        OceanCar seagull1 = new SeagullCar();

        //多态方式访问成员变量时，运行的时候，调用父类的成员变量（编译看左，运行也看左）
        System.out.println(seal1.power);
        System.out.println(seagull1.power);
        System.out.println("");

        //多态方式调用成员方法时，先检查父类中是否有该方法：如果没有或者父类中的方法不允许访问，则编译报错；如果有，调用子类重写的方法（编译看左，运行看右）
        seal1.drive();
        seagull1.drive();
        System.out.println("");

        //向下转型：一般用于访问父类没有，子类特有的方法
        //只有向上转型过的对象才能向下转型
        SealCar sealcar = (SealCar)seal1;
        sealcar.speedUp();
        SeagullCar seagullcar = (SeagullCar)seagull1;
        seagullcar.speedUp();
        System.out.println("");
        /*//父类实例对象不能直接转换成子类类型
        OceanCar ocean = new OceanCar();
        SealCar seal2 = (SealCar)ocean;
        SeagullCar seagull2 = (SeagullCar)ocean
        //没有继承关系，不能进行类型转换
        SealCar seal3 = (SealCar) seagull;
        SeagullCar seagull3 = (SeagullCar) seal;*/

        //为了保证程序的健壮性，向下转型要先判断后转型
        System.out.println(seagull1 instanceof SealCar);
        if (seagull1 instanceof SealCar) {
            SealCar seal4 = (SealCar)seagull1;
            seal4.speedUp();
        }
        System.out.println(seal1 instanceof SeagullCar);
        if (seal1 instanceof SeagullCar) {
            SeagullCar seagull4 = (SeagullCar) seal1;
            seagull4.speedUp();
        }
    }
}

