package com.imooc.practice_11_14_3;

public class Child extends Parent {
    //成员方法
    @Override
    public void playGame() {
        System.out.println("珍惜光阴，走出虚拟，拥抱真实的世界");//方法重写
    }
    public void playGame(int age, String puzzleGame) {//方法重载
        System.out.println("不满18周岁，可以玩益智小游戏~");
    }
}