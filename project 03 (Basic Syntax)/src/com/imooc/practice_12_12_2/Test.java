package com.imooc.practice_12_12_2;

public class Test {
    public static void main(String[] args) {
        GeometricFigure geometricFigure = new Orbicular(1);
        geometricFigure.calArea();
        geometricFigure.calRound();

        System.out.println("");

        GeometricFigure geometricFigure1 = new Rectangles(3,4);
        geometricFigure1.calArea();
        geometricFigure1.calRound();
    }
}
