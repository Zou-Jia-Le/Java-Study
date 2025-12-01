public class SelfTest_5 {
    public static void main(String[] args) {
        //装箱:基本数据类型 -> 包装类对象
        Integer a = 99;//自动装箱
        Integer b = Integer.valueOf(233);
        Integer c = Integer.valueOf("666");

        //拆箱:包装类对象 -> 基本数据类型
        int x = a;//自动拆箱
        float y = b.floatValue();
        double z = c.doubleValue();
        System.out.println("x = " + x + "\t\t\t"  + "y = " + y + "\t\t" + "z = " + z);

        //基本数据类型转字符串
        String date1 = 2003 + "";
        String date2 = String.valueOf(05);
        String date3 = Integer.toString(30);
        System.out.println("str1 = " + date1 + "\t\t"  + "str2 = " + date2 + "\t\t" + "str3 = " + date3);

        //字符串转为基本数据类型
        int year1  = Integer.valueOf("2018");
        int year2 = Integer.parseInt("2025");
        System.out.println("year1 = " + year1 + "\t"  + "year2 = " + year2);
    }
}
