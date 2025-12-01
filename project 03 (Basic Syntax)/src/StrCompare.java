public class StrCompare {
    public static void main(String[] args) {
        //car1 、 car2 存储在堆内存中，地址不同
        String str1 = new String("Golf");
        String str2 = new String("Golf");
        //car3 、 car4 存储在字符串常量池中
        //先去字符串常量池中寻找是否存在相同的相同的字符串，如果存在，不创建；如果不存在，则创建新的字符串，存储在字符串常量池中
        String str3 = "Golf";
        String str4 = "Golf";
        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str3 == str4 : " + (str3 == str4));
        if (str1.equals(str2)) {
            System.out.println("字符串 str1 和 str2 内容相同");
        } else {
            System.out.println("字符串 str1 和 str2 内容不同");
        }
        if (str3.equals(str4)) {
            System.out.println("字符串 str3 和 car4 内容相同");
        } else {
            System.out.println("字符串 str3 和 str4 内容不同");
        }

        String str5 = "golf";
        String str6 = "Golf";
        if (str5.equalsIgnoreCase(str6)) {
            System.out.println("字符串 car5 和 car6 内容相同");
        } else {
            System.out.println("字符串 car5 和 car6 内容不同");
        }
    }
}
