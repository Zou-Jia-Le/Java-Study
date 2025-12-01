public class Practice_9_13_Perfect {
    //静态方法
    public static void stringReplacement() {
        //方法一：replace()
        /*String str1 = new String("13512345566");
        String str2 = str1.replace("1234","****");
        System.out.println(str2);*/
        //方法二：substring()
        /*String str1 = new String("13512345566");
        String str2 = str1.substring(str1.indexOf("12"),str1.lastIndexOf("55"));
        String str3 = str1.replace(str2,"****");
        System.out.println(str3);*/
        //方法三:substring()
        /*String str1 = new String("13512345566");
        String str2 = str1.substring(0,str1.indexOf("12"));
        String str3 = str1.substring(str1.lastIndexOf("55"));
        System.out.println(str2 + "****" + str3);*/

        //方法四：replace()
        /*StringBuilder str1 = new StringBuilder("13512345566");
        StringBuilder str2 = str1.replace(str1.indexOf("12"), str1.lastIndexOf("55"), "****");
        System.out.println(str2);*/
        //方法五：delete()、insert()
        StringBuilder str1 =  new StringBuilder("13512345566");
        StringBuilder str2 = str1.delete(str1.indexOf("12"),str1.lastIndexOf("55"));
        StringBuilder str3 = str1.insert((str2.indexOf("5")+1),"****");
        System.out.println(str3);
    }
    public static void poetryPrint() {
        String poemArr[] = new String[] {
                "青青园中葵, 朝露待日晞。",
                "阳春布德泽，万物生光辉。",
                "常恐秋节至，焜黄华叶衰。",
                "百川东到海，何时复西归？",
                "少壮不努力，老大徒伤悲。"
        };
        StringBuilder result = new StringBuilder("");
        for (String str : poemArr) {
            result.append(str + "\n");
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        System.out.println("===============第一题===============");
        // 比较username和nickname
        String username = new String("xiaomu_home");
        String nickname = new String("xiaomu_home");
        System.out.println("username == nickname => " + (username == nickname));//false
        System.out.println("username.equals(nickname) => " + username.equals(nickname));//true
        // 比较password和rePassword
        String password = "abc123";
        String rePassword = "abc123";
        System.out.println("password == rePassword => " + (password == rePassword));//true
        System.out.println("password.equals(rePassword) => " + password.equals(rePassword));//true
        /*1、比较 username 和 nickname
            (1)使用 new 关键字创建的字符串 username 和 nickname，内存地址不同，内容相同
            (2)使用 == 比较 username 和 nickname，比较地址值，所以比较结果是 false
            (3)使用 equals 方法比较 username 和 nickname，比较字符串的内容，所以比较结果是 true
          2、比较 password 和 rePassword
            (1)使用直接赋值方式创建的字符串 password 和 rePassword，是同一个字符串，内存地址相同，内容相同
            (2)使用 == 比较 username 和 nickname，比较地址值，比较结果是 true
            (3)使用 equals 方法比较 username 和 nickname，比较字符串的内容，比较结果也是 true*/
        System.out.println("");

        System.out.println("===============第三题===============");
        stringReplacement();
        System.out.println("");

        System.out.println("=======第四题=======");
        poetryPrint();
    }
}
