package com.pooja.sharma.learn;

public class TestInheritence {

    public static void main(String[] args) {

        Vehicle figoPetrol = new FigoPetrol();
        //Vehicle fiestaDiesel = new FiestaDiesel();
        //printVehicleDetails(fiestaDiesel);
        printVehicleDetails(figoPetrol);

    }

    public static void printVehicleDetails(Vehicle car) {
        System.out.println(car.noOfTyres());
        System.out.println(car.brandName());
        System.out.println(car.fuelType());
        System.out.println(car.engineCapacity());
        FigoPetrol figo = (FigoPetrol) car; //typecast Vehicle reference to Child class FigoPetrol
        System.out.println(figo.carName());
    }


}
