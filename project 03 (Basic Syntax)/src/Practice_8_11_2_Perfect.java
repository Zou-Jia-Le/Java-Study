public class Practice_8_11_2_Perfect {
    //成员变量
    double weight;  // 重量
    double price;   // 价格

    //构造方法
    public Practice_8_11_2_Perfect(double weight, double price) {
        /*1、构造方法的 weight 参数、 price 参数与成员变量同名，在构造方法中，对 weight 和 price 变量的访问，
             是参数中的 weight 和 price 自身给自身赋值，并没有为类中的成员变量赋值
          2、成员变量有默认值，成员方法中， weight 和 price 使用的是默认值， double 类型默认值是 0.0
          3、在构造方法中，使用 this 关键字修饰 weight 和 price，引用类中的成员变量，为其赋值*/
        //weight = weight;
        this.weight = weight;
        //price = price;
        this.price = price;
    }

    //成员方法:根据重量和价格，计算总价
    public void totalPrice() {
        double total_price = weight >= 10 ? weight * price * 0.95 : weight * price;
        System.out.println("总价格是： " + total_price);
    }

    public static void main(String[] args) {
        Practice_8_11_2_Perfect price1 = new Practice_8_11_2_Perfect(15, 2);
        price1.totalPrice();
    }
}
