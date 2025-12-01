public class CharDemo {
    public static void main(String[] args) {
        //声明字符类型的变量
        char ch = '元';
        System.out.println("价格的单位是" + ch);
        System.out.println("价格的单位是\"" + ch + '\"');
        System.out.println("价格的单位是\"" + ch + "\"");
        System.out.println('\u25CF');//查询Unicode表
    }
}
