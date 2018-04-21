package com.pooja.sharma;

public class FactorialOfANumber {
    public static void main(String[] args) {
        FactorialOfANumber factorialOfANumber = new FactorialOfANumber();
        int factorial = factorialOfANumber.calculateFactorial(4);
        System.out.print(factorial);

    }

    public int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;

    }
}
