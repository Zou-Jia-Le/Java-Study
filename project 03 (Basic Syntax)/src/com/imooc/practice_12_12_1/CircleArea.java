package com.imooc.practice_12_12_1;

public class CircleArea extends ShapeArea {
    //成员变量
    private double r;

    //getter、setter方法
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }

    //方法实现
    @Override
    public double calcArea() {
        double area = 3.14*this.r*this.r;
        return area;
    }

    //构造方法
    public CircleArea() {
    }
    public CircleArea(double r) {
        this.r = r;
    }
}

/*public class CircleArea extends ShapeArea {
        //成员方法
        @Override
        public double calcArea(double r) {//非抽象类继承抽象类需要实现父类中的抽象方法，此处并没有实现抽象方法，所以会报错//且这属于方法重载，而非方法重写 --> 重载了父类的抽象方法 calcArea()
            double area = 3.14 * r * r;
            return area;
        }
}*/
