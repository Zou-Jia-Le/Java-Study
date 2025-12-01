public class CarCalculatorTest {
    public static void main(String[] args) {
        CarCalculator damaoCar = new CarCalculator(200000,5,2.5);
        damaoCar.totalPrice();

        System.out.println("");

        CarCalculator mingmingCar = new CarCalculator(150000,5,2.5);
        mingmingCar.totalPrice();
    }
}
