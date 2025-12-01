public class Practice_4_12_Perfect {
    public static void main(String[] args) {
        //System.out.println("第一题：");
        /*int class = 5;
        // 使用了 class 关键字作为变量

        final float PI = 3.121F;
        PI = 3.1415926F;
        // 修改了常量

        float score = 95.5;
        // float 类型要加 f或者F作为标识

        long num = 123451211111111111111;
        // long 类型最后要加L或者小写的l作为标志,并且赋值超出了long型的取值范围

        boolean result = "Yes";
        //声明的是boolean类型，但赋的值确实字符串*/

        System.out.println("======第二题======");
        final int STUDENTS = 45;//对于不变的数值大胆用final关键字，常量标识符的字母要全部大写，并且多个单词之间要用“_”连接
        float priceOf20000UnderTheSea = 29.5F;//也可以用double型，但稍微浪费内存
        float priceOfSanTi = 55F;
        float priceOfComputer = 35.8F;
        float priceOfAll = priceOf20000UnderTheSea + priceOfSanTi + priceOfComputer;
        float totalCost = priceOfAll * (float)STUDENTS;
        System.out.println("一共要花：" + totalCost + "元"); // 5413.5

        //System.out.println("第三题：");
        /*a = 100
        b = 400

        对于 b += a++
        先算 b += a, 也就是 b = b + a, 即 b = 200 + 100 => b = 300
        再算 a++, a = 101
        此时：b = 300, a = 101;

        对于 b += --a;
        先算 --a, a = a - 1 => a = 101 - 1 => a = 100, 即 += 运算符的右侧为 100
        再算 b += 100, b = b + 100 => b = 300 + 100 => b = 400
        此时：b = 400, a = 100*/
    }
}
