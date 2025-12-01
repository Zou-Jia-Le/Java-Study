public class Practice_8_11_2 {
    //成员变量
    double weight;  // 重量
    double price;   // 价格

    //构造方法
    public Practice_8_11_2(double weight, double price) {
        weight = weight;
        //weight = weight 指把形参 weight 的值赋给自身而不是成员变量，应该用 this.weight = weight
        price = price;
        //height = height 指把形参 height 的值赋给自身而不是成员变量，应该用 this.height = height
    }

    //成员方法:根据重量和价格，计算总价
    public void totalPrice() {
        double total_price = weight >= 10 ? weight * price * 0.95 : weight * price;
        System.out.println("总价格是： " + total_price);
    }

    public static void main(String[] args) {
        Practice_8_11_2 price1 = new Practice_8_11_2(15, 2);
        price1.totalPrice();
    }
}
