package com.pooja.sharma;

public class Calculator {
    private int x;
    private int y;

    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int sum() {
        int sum = x + y;
        return sum;
    }

    public int multiply() {
        int mul = x * y;
        return mul;
    }

    public int divide() {
        int divide = x / y;
        return divide;
    }

    public int subtraction() {
        int subtraction = x - y;
        return subtraction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
