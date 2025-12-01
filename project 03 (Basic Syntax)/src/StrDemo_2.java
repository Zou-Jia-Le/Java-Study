public class StrDemo_2 {
    public static void main(String[] args) {
        //字符串属于常量，一旦创建不可修改
        String name = "小慕";
        name = "大毛";
        System.out.println(name);
        //字符串常量池中新增字符串"大毛"，name指向了新的字符串"大毛"，原来的"小慕"并没有被改变
    }
}
