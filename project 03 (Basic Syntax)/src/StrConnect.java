public class StrConnect {
    public static void main(String[] args) {
        String brand = "AULDEY";//品牌
        String carName = "奥迪双钻DS7602";//商品名称
        String serialNumber = "12345666";//商品编号
        String weight = "400g";//商品重量
        String origin = "广东";//产地
        String series = "超级飞侠";//系列
        String Jett = ("品牌：" + brand + "\n商品名称：" + carName + "\n商品编号：" + serialNumber + "\n重量：" + weight + "\n产地：" + origin).concat("\n系列：" + series);
        System.out.println(Jett);
        System.out.println("价格：" + (99+6) + "元");
    }
}
