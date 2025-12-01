public class ArrayDemo {
    public static void main(String[] args) {
        //声明数组
        float[] score;

        //创建数组
        score = new float[3];

        //初始化数组
        score[0] = 98.5F;
        score[1] = 100F;
        score[2] = 95F;

        //访问数组元素
        System.out.println("第一个元素的值：" + score[0]);
        System.out.println("第二个元素的值：" + score[1]);
        System.out.println("第三个元素的值：" + score[2]);
        System.out.println("");

        //数组越界
        //System.out.println("第四个元素的值：" + score[3]);

        //int[] carriage1 = {125,96,180,85,155,100,165};
        int[] carriage1 = new int[]{125, 96, 180, 85, 155, 100, 165, 88};
        System.out.println("第一节车厢的元素：" + carriage1[0]);
        System.out.println("第二节车厢的元素：" + carriage1[1]);
        System.out.println("第三节车厢的元素：" + carriage1[2]);
        System.out.println("第四节车厢的元素：" + carriage1[3]);
        System.out.println("第五节车厢的元素：" + carriage1[4]);
        System.out.println("第六节车厢的元素：" + carriage1[5]);
        System.out.println("第七节车厢的元素：" + carriage1[6]);
        System.out.println("第八节车厢的元素：" + carriage1[7]);
        System.out.println("");

        //修改数组元素
        carriage1[1] = 190;
        System.out.println("修改后第二节车厢的元素：" + carriage1[1]);
        //数组的长度
        System.out.println("数组carriage1的长度是" + carriage1.length);
        System.out.println("");

        //数组是引用数据类型，赋值操作传递的是地址值
        int[] carriage2 = carriage1;
        System.out.println("carriage1:" + carriage1);
        System.out.println("carriage2:" + carriage2);
        carriage2[0] = 200;
        System.out.println("carriage1第一个元素的值是:" + carriage1[0]);
        System.out.println("carriage2第一个元素的值是:" + carriage2[0]);
    }
}
