package com.pooja.sharma.learn;

public class FigoPetrol extends Ford {

    @Override
    public String fuelType() {
        return "Petrol";
    }

    @Override
    public double engineCapacity() {
        return 1200.0;
    }

    public String carName() {
        return "Figo Petrol";
    }
}
