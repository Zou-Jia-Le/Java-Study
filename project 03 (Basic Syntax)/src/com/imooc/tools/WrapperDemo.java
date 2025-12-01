package com.imooc.tools;

public class WrapperDemo {
    public static void main(String[] args) {
        //装箱，基本数据类型->包装类对象
        Integer a =  new Integer(100);
        Integer b = Integer.valueOf(200);
        Integer c = Integer.valueOf("300");

        //拆箱，包装类对象->基本数据类型
        int x = a.intValue();
        float y = b.floatValue();
        double z = c.doubleValue();
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("");

        //自动装箱
        Integer o = 99;

        //自动拆箱
        int p = o.intValue();

        //基本数据类型转字符串
        int num = 202309;
        String s1 = num + "";
        String s2 = Integer.toString(num);
        String s3 = String.valueOf(num);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("");

        //字符串转为基本数据类型
        int year1 = Integer.valueOf("2023");
        int year2 = Integer.parseInt("2023");
        System.out.println("year1 = " + year1);
        System.out.println("year2 = " + year2);
        System.out.println("");

        /*将基本数据类型转成 Integer 对象有如下几种方式：
        Integer x = new Integer(100);//不推荐
        //2和3本质上是一种
        Integer y = 100;//推荐
        Integer z = Integer.valueOf(100);//推荐*/

        //只要是 new 出来的对象一定是个新对象，内存地址一定不同
        Integer m1 = new Integer(100);//不推荐
        Integer n1 = new Integer(100);//不推荐
        System.out.println("m1 == n1: " + (m1 == n1));
        System.out.println("m1.equals(n1)：" + m1.equals(n1));
        System.out.println("===================");
        //-128～127 范围内的数据，已经被提前创建好了 Integer 对象，用上述的2、3方式来创建 Integer 对象时，系统会直接从内存中拿出现成的 Integer 对象 ==> 更省内存
        Integer m2 = 100;//推荐
        Integer n2 = 100;//推荐
        System.out.println("m2 == n2：" + (m2 == n2));
        System.out.println("m2.equals(n2)：" + m2.equals(n2));

        System.out.println("");

        //只要是 new 出来的对象一定是个新对象，内存地址一定不同
        Integer m3 = new Integer(200);//不推荐
        Integer n3 = new Integer(200);//不推荐
        System.out.println("m3 == n3：" + (m3 == n3));
        System.out.println("m3.equals(n3)：" + m3.equals(n3));
        System.out.println("===================");
        //-128～127 范围内的数据，已经被提前创建好了 Integer 对象，用上述的2、3方式来创建 Integer 对象时，系统会直接从内存中拿出现成的 Integer 对象 ==> 更省内存
        Integer m4 = 200;//推荐
        Integer n4 = 200;//推荐
        System.out.println("m4 == n4：" + (m4 == n4));
        System.out.println("m4.equals(n4)：" + m4.equals(n4));
    }
}
