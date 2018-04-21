package com.pooja.sharma;

public class TestAreaOfTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(6,3);
        double area=triangle.calculateAreaOFTriangle();
        System.out.print("Area"+":"  + area);
    }

}
