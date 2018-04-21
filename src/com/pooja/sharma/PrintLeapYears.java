package com.pooja.sharma;

public class PrintLeapYears {
    public static void main(String[] args) {
        //printLeapYears(1900, 2000);
        printLeapYearWithWhileLoop(1900, 2000);
    }

    public static void printLeapYears(int x, int y) {
        for (int i = 1900; i <= 2000; i++) {
            if (i % 4 == 0) {
                System.out.print(i + ",");
            }
        }

    }

    public static void printLeapYearWithWhileLoop(int x, int y) {
        //initialization
        while (x <= y) {
            if (x % 4 == 0) {
                System.out.print(x + ",");
            }
            x++;
        }
    }

}

