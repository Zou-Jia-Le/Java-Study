public class ArrayPractice {
    //静态方法
    public static void arryCompare() {
        int[] carriage = new int[]{125, 96, 180, 88, 85, 155, 100, 165};//取最大、最小值
        int max = carriage[0];
        int min = carriage[0];
        for (int c :  carriage) {
            if (c > max) {
                max = c;
            }
            if (c < min) {
                min = c;
            }
        }
        System.out.println("最大值是：" + max);
        System.out.println("最小值是：" + min);
        System.out.println("");
    }
    public static void bubbleSort() {//冒泡排序
        int[] carriage = new int[]{125, 96, 180, 88, 55};
        int length = carriage.length;
        int temp = 0;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < (length - 1 - i); j++) {
                if (carriage[j] > carriage[j+1]) {
                    temp = carriage[j];
                    carriage[j] = carriage[j+1];
                    carriage[j+1] = temp;
                }
            }
            //输出本轮冒泡排序之后的数组
            System.out.print("第" + (i + 1) + "轮冒泡排序：");
            for (int k : carriage) {
                System.out.print(k + "\t");
            }
            System.out.println();
        }
        System.out.println("");
    }
    public static void scoreArray() {
        /*//动态初始化
        float[][] score =  new float[5][];
        score[0] = new float[]{100F,99F,98.5F};
        score[1] = new float[]{80F,95F,92F};
        score[2] = new float[]{100F,95.5F,95F};
        score[3] = new float[]{88F,92F,91F};
        score[4] = new float[]{91F,90.5F,88.5F};*/
        //静态初始化
        float[][] score = new float[][]{{100F, 99F, 98.5F}, {80F, 95F, 92F}, {100F, 95.5F, 95F}, {88F, 92F, 91F}, {91F, 90.5F, 88.5F}};
        float sum_chinese = 0.0F;//语文总成绩
        float sum_math = 0.0F;//数学总成绩
        float sum_english = 0.0F;//英语总成绩
        for (int row = 0; row < score.length; row++) {
            float sumScore = 0.0F;//个人总成绩
            float avgScore = 0.0F;//个人平均成绩
            for (int col = 0; col < score[row].length; col++) {
                sumScore += score[row][col];
                avgScore = sumScore / (score[row].length);
            }
            sum_chinese += score[row][0];
            sum_math += score[row][1];
            sum_english += score[row][2];
            System.out.println("第" + (row + 1) + "名同学的平均分：" + avgScore);
        }
        System.out.println("===============");
        System.out.println("语文平均分为：" + sum_chinese / score.length);
        System.out.println("数学平均分为：" + sum_math / score.length);
        System.out.println("英语平均分为：" + sum_english / score.length);
    }

    public static void main(String[] args) {
        arryCompare();
        bubbleSort();
        scoreArray();
    }
}
