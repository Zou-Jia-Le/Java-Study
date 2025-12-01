package com.imooc.pack1;

public class Car {
    //成员变量
    private String category;//交通工具种类
    private double speed;  //最高时速

    //getter、setter方法
    public String getCategory() {
        return category;
    }
    public double getSpeed() {
        return speed;
    }
    public void setCategory(String category) {
        if (category == null && category.length() > 0 && category.length() <= 50) {
            this.category = category;
        } else {
            System.out.println("类别描述错误，请输入1~50个字符，默认为 car");
            this.category = "car";//默认交通工具类别为 car
        }
    }
    public void setSpeed(double speed) {
        switch (this.getCategory()) {
            case "car":
                if(speed > 0 && speed <= 180) {
                    this.speed = speed;
                } else {
                    System.out.println("速度不符合常理，将汽车最高时速设置为默认值 180 km/h");
                    this.speed = 180;//car 默认速度为 180

                }
                break;
            case "airplane":
                if(speed > 200 && speed <= 4000) {
                    this.speed = speed;
                } else {
                    System.out.println("速度不符合常理，将飞机最高时速设置为默认值 4000 km/h");
                    this.speed = 4000;//airplane 默认速度为 4000
                }
                break;
            default:
                if(speed > 0) {
                    this.speed = speed;
                }

        }
    }

    //构造方法
    public Car() {
    }
    public Car(String category, double speed) {
        this.category = category;
        this.speed = speed;
    }

    //成员方法
    public void showInfo() {
        System.out.println("类别：" + category);
        System.out.println("最高时速" + speed + " km/h");
    }
}

