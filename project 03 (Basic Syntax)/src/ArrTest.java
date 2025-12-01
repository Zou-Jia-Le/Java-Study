public class ArrTest {
    //静态方法
    public static void arrUnInitTest() {
        int[] a;//数组的声明
        a = new int[10];//数组的创建
        int[] b = new int[10];//数组的声明和创建
        System.out.println("");

        //数组的静态初始化1
        int[] arr_1 = {1,2,3};
        System.out.println("arr第一个元素值:" + arr_1[0]);
        System.out.println("arr第二个元素值:" + arr_1[1]);
        System.out.println("arr第三个元素值:" + arr_1[2]);
        System.out.println("");

        //数组的静态初始化2
        int[] arr_2 = new int[]{1,2,3};
        System.out.println("arr第一个元素值:" + arr_2[0]);
        System.out.println("arr第二个元素值:" + arr_2[1]);
        System.out.println("arr第三个元素值:" + arr_2[2]);
        System.out.println("");

        //数组的动态初始化
        int[] arr_3 = new int[3];
        arr_3[0] = 1;
        arr_3[1] = 2;
        arr_3[2] = 3;
        System.out.println("arr第一个元素值:" + arr_3[0]);
        System.out.println("arr第二个元素值:" + arr_3[1]);
        System.out.println("arr第三个元素值:" + arr_3[2]);
        System.out.println("");

        int[] arr_i = new int[5];
        System.out.println("int类型数组的元素默认值是:" + arr_i[0]);
        float[] arr_f = new float[5];
        System.out.println("float类型数组的元素默认值是:" + arr_f[0]);
        double[] arr_d = new double[5];
        System.out.println("double类型数组的元素默认值是:" + arr_d[0]);
        Boolean[] arr_b = new Boolean[5];
        System.out.println("boolean类型数组的元素默认值是:" + arr_b[0]);
        System.out.println("");

        //基本数据类型直接打印变量名，返回的是变量的值
        int a_res = 5;
        System.out.println("a_res:" + a_res);
        /*数组为引用数据类型，其存放的是地址，直接打印数组名，其返回的是堆内存中第一个元素的地址
        数组被创建在栈内存中，而数组中的元素则被存放在堆内存中，数组通过地址来引用元素*/
        int[] b_res = new int[5];
        System.out.println("b_res:" + b_res);
    }

    public static void main(String[] args) {
        arrUnInitTest();
    }
}
