public class CompareDemo {
    public static void main(String[] args) {
        double price_92 = 7.43;
        double price_95 = 8.25;

        boolean result = price_92 == price_95;
        System.out.println(result);//false
        System.out.println(price_92 == price_95);//false
        System.out.println("");

        System.out.println(price_92 != price_95);//true
        System.out.println(price_92 > price_95);//false
        System.out.println(price_92 < price_95);//true
        System.out.println(price_92 >= price_95);//false
        System.out.println(price_92 <= price_95);//true
    }
}
