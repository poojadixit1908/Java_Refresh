package com.pooja.sharma;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        //PrintEvenNumbers evenNumbers = new PrintEvenNumbers();

        printHello(15);

        //evenNumbers.printEvenNumbers(50);
     //   System.out.println("List of even  numbers from 1 to 100 = ");

    }


    public static void printHello(int n){
        for (int i = 1; i <= n; i++){
            System.out.println("hello "+i);

        }
    }

    public void printEvenNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ",");
            }

        }

        System.out.println("Program ended");
    }

}



