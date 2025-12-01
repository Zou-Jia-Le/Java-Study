public class Practice_8_11_3_Perfect {
    //成员变量
    int age;

    //成员方法
    public void play() {
        System.out.println("快乐童年，尽情玩耍");
    }

    public static void main(String[] args) {
        //创建对象
        Practice_8_11_3_Perfect child1 = new Practice_8_11_3_Perfect();
        child1.age = 6;
        Practice_8_11_3_Perfect child2 = child1;
        child2.age = 11;
        /*1、children child1 = new children(); new 关键字创建对象，在堆内存中为 child1 开辟空间;
             声明的 child1 在栈内存中， child1 存储的是对象在堆内存中地址值，通过地址指向堆内存空间
          2、children chi1d2 = chi1d1; 声明的 child2 也是在栈内存中，把 child1 赋给 child2 对象，
             传递的是地址值， child1 和 child2 地址相同，指向的堆内存空间相同，对应的成员变量 age 是同一个
          3、child1 和 child2 访问同一个 age， child1.age 和 child2.age 相同，修改后值为 11*/
        System.out.println("child1 age: " + child1.age);
        System.out.println("child2 age: " + child2.age);
    }
}