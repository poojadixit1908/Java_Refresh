package com.pooja.sharma;

public class TestSimpleInterest {
    public static void main(String[] args) {
        SimpleInterestCalculation  simpleInterestCalculation = new SimpleInterestCalculation(10000,24 , 2);
        double simpleInterest = simpleInterestCalculation.calculateSimpleInterest();
        double totalAmount = simpleInterestCalculation.calculateTotalAmountAfterInterest();
        System.out.println("Amount: " + simpleInterestCalculation.getAmount());
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Total: " + totalAmount);


    }
}
