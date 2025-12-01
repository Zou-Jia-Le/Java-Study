public class IfDemo {
    public static void main(String[] args) {
        //if 语句
        int temperature = 15;
        if (temperature >= 20) {
            System.out.println("今天天气好，小邹去爬山");
        }

        //if else 语句
        float score = 66F;
        if (score >= 60) {
            System.out.println("及格了");
        } else {
            System.out.println("要努力啊！");
        }

        //三元运算改写
        System.out.println((score >= 60) ? "及格了" : "要努力啊！");

        //两者的区别在于 if else语句的代码块中可以执行多条语句，而三元改写 ：的左右两端只能有一条执行语句
    }
}
