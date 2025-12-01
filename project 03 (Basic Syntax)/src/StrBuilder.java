public class StrBuilder {
    //静态方法
    public static void practiseOne() {
        //不可变字符串
        String str1 = "";
        //获取JVM空闲内存
        long m1 = Runtime.getRuntime().freeMemory();
        //获取系统当前的时间
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            str1 += i;//相当于产生了5000个字符串对象
        }
        //获取JVM空闲内存
        long m2 = Runtime.getRuntime().freeMemory();
        //获取系统当前的时间
        long t2 = System.currentTimeMillis();
        System.out.println("String 占用内存：" + (m1-m2));
        System.out.println("String 占用时间：" + (t2-t1));

        System.out.println("");

        //创建 StringBuilder 可变字符串
        StringBuilder str2 = new StringBuilder("");
        //获取JVM空闲内存
        long m3 = Runtime.getRuntime().freeMemory();
        //获取系统当前的时间
        long t3 = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            str2.append(i);
        }
        //获取JVM空闲内存
        long m4 = Runtime.getRuntime().freeMemory();
        //获取系统当前的时间
        long t4 = System.currentTimeMillis();
        System.out.println("StringBuilder 占用内存：" + (m3-m4));
        System.out.println("StringBuilder 占用时间：" + (t4-t3));
    }

    public static void main(String[] args) {
        practiseOne();
    }
}
