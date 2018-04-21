package com.pooja.sharma;

public class Circle {
    double radious;

    public Circle(double radious) {
        this.radious = radious;
    }
    public double calculateAreaOfCircle(){
       double areaOfCircle= 22*radious*radious/7;
       return areaOfCircle;
    }
}
