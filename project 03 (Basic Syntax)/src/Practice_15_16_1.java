import java.util.Random;

public class Practice_15_16_1 {
    //静态方法
    public static void generateRandomNumbers() {
        Random random = new Random();
        int randomNumber = random.nextInt(9000)+1000;//[1000~10000)之间的整数
        System.out.println(randomNumber);
    }

    public static void main(String[] args) {
        generateRandomNumbers();
    }
}
