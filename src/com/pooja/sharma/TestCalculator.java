package com.pooja.sharma;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(8,5);
        int sum = calculator.sum();
        System.out.println("Sum of number " + calculator.getX() + " & " + calculator.getY() + " = " + sum );
    }

}
