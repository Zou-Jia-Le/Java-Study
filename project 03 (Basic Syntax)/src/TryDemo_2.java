import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemo_2 {
    public static void main(String[] args) {
        System.out.println("1：注册");
        System.out.println("2：登录");
        int[] choice = new int[]{1,2};
        System.out.println("");

        System.out.println("请输入整数序号：");
        Scanner scanner = new Scanner(System.in);

        try {
            int num = scanner.nextInt();
            if (num == choice[num-1]) {
                if (num == choice[0]) {
                    System.out.println("欢迎注册系统");
                    System.out.println("请输入用户名");
                    System.out.println("请输入密码");
                } else if (num == choice[1]) {
                    System.out.println("欢迎登录小邹系统");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("输入的数字不是整数，报错啦～");
            e.printStackTrace();//打印异常堆栈跟踪信息
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界了～");
            e.printStackTrace();//打印异常堆栈跟踪信息
        } catch (Exception e) {
            System.out.println("父类 Exception 处理异常~");
            e.printStackTrace();//打印异常堆栈跟踪信息
        } finally {
            System.out.println("");
            System.out.println("关闭打开的文件，释放资源");
        }
        System.out.println("小邹感谢您的光临");
        System.out.println("");
    }
}

/*总结：
1、多个 catch 代码块，如果一个 catch 捕获到异常，那么其它的 catch 就不再进行匹配
2、先捕获子类异常，再捕获父类异常，子类异常必须放在父类异常的前面*/
