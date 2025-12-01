import java.util.Scanner;

public class StrPractice {
    //静态方法
    public static void strLength() {
        String range = "奇瑞捷豹路虎揽胜极光";
        System.out.println(range.length());
        String jeep = "广汽菲亚特克莱斯勒吉普自由光";
        System.out.println(jeep.length());
        String s1 = "";//空字符串
        System.out.println("空字符串的长度:" + s1.length());
        String s2 = null;//空对象:不等于空字符串
        if (s2 != null) {
            System.out.println(s2.length());//不加条件判断程序会报错，空对象调用不了成员变量或者成员方法，因为s2指向的地址为空地址
        }
    }
    public static void userLogin (String IDnumber, String password,String verifyCode) {
        String number = "BJ123456";//学生证件号
        String pwd = "q1w2e3";//密码
        String vcode = "WZJ4";//验证码
        //判断验证码是否正确
        if (verifyCode.toUpperCase().equals(vcode)) {
            //证件号和密码不能为空
            if ((IDnumber.length() != 0) && (password.length() != 0)) {
                //判断证件号和密码是否正确
                if ((IDnumber.trim().equals(number)) && (password.trim().equals(pwd))) {
                    System.out.println("登录成功");
                } else {
                    System.out.println("请输入正确的证件号和密码");
                }
            } else {
                System.out.println("证件号或密码不能为空");
            }
        } else {
            System.out.println("验证码错误");
        }
    }
    public static void strDemo() {
        String imagePath = "C:\\colasa\\Java 项目\\chapter01\\chapter01\\src\\demo.jpg";//没这个文件，随便给的路径
        int index1 = imagePath.indexOf("\\");
        int index2 = imagePath.lastIndexOf("\\");
        if (index1 != -1) {
            String disk =  imagePath.substring(0, index1);
            System.out.println("盘符" + disk);
        }
        if (index2 != -1) {
            String filename = imagePath.substring(index2 + 1);//不写结束位置就意味着从开始位置截取到字符串末尾
            System.out.println("文件名：" + filename);
        }
        String newFilePath = imagePath.replace("chapter01","chapter02");
        System.out.println("原来的字符串：" + imagePath);
        System.out.println("替换后的字符串：" + newFilePath);
    }

    public static void main(String[] args) {
        strLength();
        System.out.println("");

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入学生证件号：");
        String IDnumber = sc.nextLine();
        System.out.print("请输入密码：");
        String password = sc.nextLine();
        System.out.print("请输入验证码：");
        String verifyCode = sc.nextLine();
        userLogin(IDnumber, password, verifyCode);

        System.out.println("");
        strDemo();
    }
}

/* String 类的常用方法总结：
trim()、 equals()、 concat()、 length()、
toUpperCase()、 toLowerCase()、 equalsIgnoreCase()、
indexOf()、 lastIndexOf()、 substring()、 replace()*/
