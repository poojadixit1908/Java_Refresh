package com.pooja.sharma;

public class TestingPalindromeNumber {
    public static void main(String[] args) {
        int result = checkWheatherTheGivenNumberISPalindrome(464);
        System.out.println(result);


    }
    public static int checkWheatherTheGivenNumberISPalindrome(int n){
        int sum = 0;
        while(n>0) {
           int r = n % 10 ;
               sum = (sum*10) + r;
            n = n/10;
        }
        if (n == sum) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not palindrome");

        }

        return 0;
    }

}
