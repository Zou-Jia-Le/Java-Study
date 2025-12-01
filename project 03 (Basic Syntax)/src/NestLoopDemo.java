public class NestLoopDemo {
    public static void main(String[] args) {
        for (int carriage = 1; carriage <= 8; carriage++) {
            System.out.println("|车厢号：" + carriage + "|");
            for (int set = 1; set <= 15 ; set++) {
                System.out.print("|座位号：" + set + "|   ");
            }
            System.out.println("\n");
        }
    }
}
