public class CarCalculator {
    //成员变量
    public double carPrice;//裸车价格
    public int seat;//座位数
    public double displacement;//汽车的排量
    public double price_n;//必要花费
    public double price_c;//商业保险

    //构造方法
    public CarCalculator(double carPrice, int seat, double displacement) {
        this.carPrice = carPrice;
        this.seat = seat;
        this.displacement = displacement;
        System.out.println("裸车价格：" + this.carPrice + " 元");
    }

    //成员方法
    //计算必要花费
    public double necessaryExpenses() {
        double purchase_tax = (this.carPrice / 1.13) * 0.1;//购置税
        double registration_fee = 500;//上牌费用
        double usage_tax;
        if (this.displacement < 1.0) {
            usage_tax = 300;
        } else if (this.displacement > 1.0  && this.displacement < 1.6) {
            usage_tax = 420;
        } else if (this.displacement > 1.6 && this.displacement <= 2.0) {
            usage_tax = 480;
        } else if (this.displacement > 2.0 && this.displacement <= 2.5) {
            usage_tax = 900;
        } else {
            usage_tax = 1920;
        }
        double c_insurance = this.seat < 6 ? 950 : 1100;
        this.price_n = (int)(purchase_tax + registration_fee + usage_tax + c_insurance);
        System.out.println("必要花费：" + this.price_n + " 元");
        return this.price_n;
    }
    //预估商业保险费用
    public double commercialInsurance() {
        double price_1 = 1630;//第三者责任险
        double price_2 = 459 + this.carPrice * 0.01088;//车辆损失险
        double price_3 = 3000;
        this.price_c = (int)(price_1 + price_2 + price_3);
        System.out.println("预估保险费用：" + this.price_c + " 元");
        return this.price_c;
    }
    //全款购车总花费金额
    public void totalPrice() {
        double total_price = this.carPrice + necessaryExpenses() + commercialInsurance();
        System.out.println("全款购车预计总金额：" +  total_price + " 元");
    }
}
