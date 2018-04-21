package com.pooja.sharma;

public class SimpleInterestCalculation {
    private double amount;
    private double rate;
    private double time;

    public SimpleInterestCalculation(double amount, double rate, double time) {
        this.amount = amount;
        this.rate = rate;
        this.time = time;

    }
    public double calculateSimpleInterest(){
        double simpleInterest = amount*rate*time/100;
        return simpleInterest;
    }
    public double calculateTotalAmountAfterInterest(){
        double simpleInterest = calculateSimpleInterest();
        double totalAmount = amount + simpleInterest;
        return totalAmount;

    }

    public double getAmount() {
        return amount;
    }
}
