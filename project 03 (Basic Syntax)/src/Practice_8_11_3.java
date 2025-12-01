public class Practice_8_11_3 {
    //成员变量
    int age;

    //成员方法
    public void play() {
        System.out.println("快乐童年，尽情玩耍");
    }

    public static void main(String[] args) {
        //创建对象
        Practice_8_11_3 child1 = new Practice_8_11_3();
        child1.age = 6;
        Practice_8_11_3 child2 = child1;
        child2.age = 11;
        /*child1.age 、 child2.age 的值是相同的，但是它们不是同一个对象，
        只是因为 child1 和child2 的对象名指向了堆内存中相同的地址*/
        System.out.println("child1 age: " + child1.age);
        System.out.println("child2 age: " + child2.age);
    }
}
