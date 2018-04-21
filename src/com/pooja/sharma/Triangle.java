package com.pooja.sharma;

public class Triangle {
    double breadth;
    double height;

    public Triangle(double breadth, double height) {
        this.breadth = breadth;
        this.height = height;
    }

    public double calculateAreaOFTriangle() {
        double area = breadth * height / 2;
        return area;

    }

}
