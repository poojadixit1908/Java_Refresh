package com.pooja.sharma;

public class AreaOfTriangleWithoutUsingObject {
    public static void main(String[] args) {
        double result = Area(2, 10);
        System.out.println(result);

    }

    public static double Area(double breadth, double height) {
        double Area = breadth * height / 2;
        return Area;

    }
}