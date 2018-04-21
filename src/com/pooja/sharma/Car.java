package com.pooja.sharma;

import java.lang.management.GarbageCollectorMXBean;

public class Car extends Vehicle {

    private String name;
    private String brand;
    private String bodyType;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Car(String name, String brand, String bodyType, double price) {
        this.name = name;
        this.brand = brand;
        this.bodyType = bodyType;
        this.price = price;



    }



    public double getOnRoadPrice() {
        double tax = price * 10 / 100;
        double priceWithTax = price + tax;
        double gst = price * 5 / 100;
        double roadPrice = priceWithTax + gst;
        return roadPrice;
    }

}
