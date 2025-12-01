public class Practice_7_14_Perfect {
    //静态方法
    public static void numSort () {
        int[] arr = new int[]{12, 125, 13, 246, 55, 18, 26, 160, 99, 120, 188};
        System.out.print("大于100的元素为:\t");
        for (int c : arr) {
            if (c > 100) {
                System.out.print(c + "\t");
            }
        }
        System.out.println();
    }
    public static void sportReport() {
        int[] sportNum = new int[]{22716, 16512, 19472, 25720, 15767, 12898, 21169};
        int max = sportNum[0];
        int temp = 0;
        for (int i = 0; i < sportNum.length; i++) {
            if (sportNum[i] > max) {
                max = sportNum[i];
                temp = i + 1;
            }
        }
        switch(temp) {
            case 1:
                System.out.println("小慕周一的步数最多，最多为：" + max + "步");
                break;
            case 2:
                System.out.println("小慕周二的步数最多，最多为：" + max + "步");
                break;
            case 3:
                System.out.println("小慕周三的步数最多，最多为：" + max + "步");
                break;
            case 4:
                System.out.println("小慕周四的步数最多，最多为：" + max + "步");
                break;
            case 5:
                System.out.println("小慕周五的步数最多，最多为：" + max + "步");
                break;
            case 6:
                System.out.println("小慕周六的步数最多，最多为：" + max + "步");
                break;
            default:
                System.out.println("小慕周日的步数最多，最多为：" + max + "步");
        }
    }
    public static void singScore() {
        float [][] score1 = new float[5][];
        score1[0] = new float[]{99F, 96F, 97.5F, 89F, 95.5F, 93F, 99F, 95F, 98F, 99.5F};
        score1[1] = new float[]{91F, 95.5F, 97F, 92F, 99F, 98F, 94F, 95.5F, 96F, 99F};
        score1[2] = new float[]{90.5F, 92F, 99F, 99.5F, 95F, 90F, 97F, 96F, 93F, 91.5F};
        score1[3] = new float[]{98F, 95F, 95.5F, 99F, 92F, 93.5F, 93F, 97.5F, 96F, 99.5F};
        score1[4] = new float[]{95F, 91.5F, 93F, 96F, 98.5F, 99F, 94F, 96.5F, 95.5F, 92F};
        for (int i = 0; i < score1.length; i++) {
            float sumScore = 0F;
            float avgScore = 0F;
            for (int j = 0; j < score1[i].length; j++) {
                sumScore += score1[i][j];
                avgScore = sumScore / score1[i].length;
            }
            System.out.println("第" + (i+1) + "名选手的平均得分为：" + avgScore);
        }
    }
    public static void bubbleSort() {
        float [][] score1 = new float[5][];
        score1[0] = new float[]{99F, 96F, 97.5F, 89F, 95.5F, 93F, 99F, 95F, 98F, 99.5F};
        score1[1] = new float[]{91F, 95.5F, 97F, 92F, 99F, 98F, 94F, 95.5F, 96F, 99F};
        score1[2] = new float[]{90.5F, 92F, 99F, 99.5F, 95F, 90F, 97F, 96F, 93F, 91.5F};
        score1[3] = new float[]{98F, 95F, 95.5F, 99F, 92F, 93.5F, 93F, 97.5F, 96F, 99.5F};
        score1[4] = new float[]{95F, 91.5F, 93F, 96F, 98.5F, 99F, 94F, 96.5F, 95.5F, 92F};
        float[] score2 = new float[5];
        for (int i = 0; i < score1.length; i++) {
            float sumScore = 0F;
            float avgScore = 0F;
            for (int j = 0; j < score1[i].length; j++) {
                sumScore += score1[i][j];
                avgScore = sumScore / score1[i].length;
                score2[i] = avgScore;//为第6题冒泡排序做准备
            }
            System.out.println("第" + (i + 1) + "名选手的平均得分为：" + "\t" + avgScore);
        }
        System.out.println("=================================================");
        for (int i = 0; i < score2.length - 1; i++) {
            for (int j = 0; j < score2.length - 1 - i; j++) {
                if (score2[j] > score2[j+1]) {
                    float temp = score2[j];
                    score2[j] = score2[j+1];
                    score2[j+1] = temp;
                }
            }
            System.out.print("第" + i + "轮冒泡排序：");
            for (float c : score2) {
                System.out.print(c + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("====================第一题====================");
        //静态初始化数组
        float[] a = new float[]{120F, 95.5F, 88F, 125.9F, 69F, 76.7F};
        for (float c : a) {
            System.out.print(c + "\t");
        }
        System.out.println();
        //动态初始化数组
        float[] b = new float[6];
        b[0] = 120F;
        b[1] = 95.5F;
        b[2] = 88F;
        b[3] = 125.9F;
        b[4] = 69F;
        b[5] = 76.7F;
        for (float c : b) {
            System.out.print(c + "\t");
        }
        System.out.println();
        System.out.println("");

        System.out.println("===============第二题===============");
        numSort();
        System.out.println("");

        System.out.println("===============第三题===============");
        int[] arr = {16, 125, 13, 246, 55, 18, 26, 160, 99, 120, 188};
        for (int i = 0; /*i <= arr.length*/i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println("arr[" + i + "]: " + arr[i]);
            }
        }
        /*应该将 i <= arr.length 改为 i < arr.length，因为当 i = 11 时，arr[11] 会发生数组越界异常报错
        那为什么没有报错？：1、数组长度是奇数：数组长度 = 11,循环会执行到 i = 11（因为 i <= 11）,但 arr[11] 不存在（有效下标是 0~10）;
                        2、条件判断的巧合：当 i = 11 时，11 % 2 == 1，所以不会执行打印语句；但数组访问 arr[i] 仍然会发生，只是结果没有被打印*/
        System.out.println("");

        System.out.println("=============第四题=============");
        sportReport();
        System.out.println("");

        System.out.println("=============第五题=============");
        singScore();
        System.out.println("");

        System.out.println("==========第六题==========");
        bubbleSort();
    }
}
