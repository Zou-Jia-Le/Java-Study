public class ArrayLoop {
    //静态方法
    public static void arryLoop() {
        int[] carriage = {125, 96, 88, 85, 155, 100, 165, 88};

        int sum1 = 0;
        //遍历数组，数组下标0-length-1
        for (int i = 0; i <= carriage.length - 1; i++) {
            System.out.print(carriage[i] + " ");
            sum1 += carriage[i];
        }
        System.out.println();
        System.out.println("sum1:" + sum1);

        System.out.println("");

        int sum2 = 0;
        //foreach循环:本质是for循环，虽然较for循环简单，但是其不能完全取代for循环，当需要改数组中某个具体元素值的时候，不适合用forEach循环
        for (int c : carriage ) {
            //c = 100;//会将carriage数组中每个元素的值都改为100
            System.out.print(c + " ");
            sum2 += c;
        }
        System.out.println();
        System.out.println("sum2:" + sum2);
    }

    public static void main(String[] args) {
        arryLoop();
    }
}
