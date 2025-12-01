package com.imooc.selftest_4;

public class Test {
    public static void main(String[] args) {
        //匿名内部类
        Language chinese =  new Language() {
            //方法实现
            @Override
            public void voice() {
                System.out.println("让我们说中文");
            }
        };

        Show show = new Show();

        System.out.print("方式一：");
        show.showInfo(chinese);

        //上下等价

        System.out.print("方式二：");
        show.showInfo(new Language() {
            //方法实现
            @Override
            public void voice() {
                System.out.println("让我们说中文!!!");
            }
        });
    }
}
