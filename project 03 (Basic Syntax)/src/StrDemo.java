public class StrDemo {
    public static void main(String[] args) {
        //方式一：直接赋值
        String car = "Golf";//
        System.out.println("car:" + car);

        //方式二：空参
        String voidStr = new String();//空参
        System.out.println("voidStr:（没有任何内容）" + voidStr);

        //方式三：传入一个字符串
        String brand = new String("Volkswagen");
        System.out.println("brand:" + brand);

        //方式四：传入一个数组
        char[] chs = new char[]{'M','a','g','o','t','a','n'};
        String carMagotan = new String(chs);
        System.out.println("carMagotan:" + carMagotan);

        //方式五：传递数组以及其他参数
        String carPart = new String(chs,5,2);
        System.out.println("carPart:" + carPart);

        //方式六：字符串的拼接
        String carTouran = "Tour" + carPart;
        System.out.println("carTouran:" + carTouran);
    }
}
