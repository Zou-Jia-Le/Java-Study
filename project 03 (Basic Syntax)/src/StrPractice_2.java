public class StrPractice_2 {
    //静态方法
    public static void practiceTwo() {
        StringBuilder carNumber = new StringBuilder("KAA1234");

        //字符串替换
        carNumber.replace(3, 7,"6666");
        System.out.println("替换后的 carNumber：" + carNumber);

        //字符串插入
        carNumber.insert(0, "京");
        System.out.println("插入后的 carNumber：" + carNumber);

        //字符串删除
        carNumber.delete(2,3);
        System.out.println("删除后的 carNumber：" + carNumber);

        //字符串反转
        carNumber.reverse();
        System.out.println("反转后的 carNumber：" + carNumber);

        //字符串添加
        carNumber.append(" 我怕风浪大？风浪越大鱼越贵！");
        System.out.println("添加后的 carNumber：" + carNumber);
    }

    public static void main(String[] args) {
        practiceTwo();
    }
}

/* 总结:StringBuilder 类的常用方法：insert() 、 append() 、 delete() 、 replace() 、 reverse()*/