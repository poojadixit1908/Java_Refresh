package com.pooja.sharma.exceptions;

public class ExpTest {

    public static void main(String[] args) {
        int result = divide(4, 0);
        System.out.println(result);
    }

    public static int divide(int x, int y) {
        if (y != 0) {
            return x/y;
        } else {
            return -1;
        }

    }
}
