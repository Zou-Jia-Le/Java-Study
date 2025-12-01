package com.imooc.pack1;

public class VehicleTestTwo {
    public static void main(String[] args) {
        System.out.println("===起初===");
        System.out.println("count：" + Vehicle.getCount());

        System.out.println("====1====");
        Vehicle car1 = new Vehicle("car",180);
        System.out.println("count：" + Vehicle.getCount());
        System.out.println("====2====");
        Vehicle car2 = new Vehicle("car",190);
        System.out.println("count：" + Vehicle.getCount());
        System.out.println("====3====");
        Vehicle car3 = new Vehicle("car",200);
        System.out.println("count：" + Vehicle.getCount());


        System.out.println("===结束===");
        System.out.println("count：" + Vehicle.getCount());
        System.out.println("=========");
    }
}
