package com.imooc.assembly.mymap;

public class Car {
    //成员变量
    private String mode;//品牌型号
    private String color;//颜色
    private String number;//车牌号

    //getter、setter方法
    public String getMode() {
        return mode;
    }
    public void setMode(String mode) {
        this.mode = mode;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    //构造方法
    public Car() {
    }
    public Car(String mode, String color, String number) {
        this.mode = mode;
        this.color = color;
        this.number = number;
    }

    //成员方法
    @Override
    public String toString() {
        return "Car{" +
                "mode='" + mode + '\'' +
                ", color='" + color + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
