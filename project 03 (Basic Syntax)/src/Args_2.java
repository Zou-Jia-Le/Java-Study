public class Args_2 {
    //成员方法
    public void polygonPerimeter(String shape,double... sides) {//形参相当于是一个 String 型以及一个不确定大小的 double 型数组
        double perimeter = 0;//周长
        for (int i = 0; i < sides.length; i++) {
            perimeter += sides[i];
        }
        System.out.println(shape + "周长 = " + perimeter);
    }
}
