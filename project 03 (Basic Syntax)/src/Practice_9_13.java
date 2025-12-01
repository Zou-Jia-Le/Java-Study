public class Practice_9_13 {
    //静态方法
    public static void stringReplacement() {
        /*String str1 = new String("13512345566");
        String str2 = str1.replace("1234","****");
        System.out.println(str2);*/
        StringBuilder str1 = new StringBuilder("13512345566");
        StringBuilder str2 = str1.replace(3,7,"****");
        System.out.println(str2);
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
        System.out.println("");

        System.out.println("===============第三题===============");
        stringReplacement();
        System.out.println("");

        System.out.println("=======第四题=======");
        poetryPrint();
    }
}
