package com.algorithms.palindrome;

/**
 * Created by sai on 11/6/2018
 */
public class PalindromeNumber {

    // XOR ^ of same number returns 0, the idea here is if you reverse a palindrome number it should be the same number
    public static boolean isPalindrome(int number) {
        int reverse = reverseNumber(number);
        return (number ^ reverse) == 0;
    }

    public static int reverseNumber(int number) {
        int reverse = 0;
        while(number > 0) {
            reverse *= 10;
            reverse += number%10;
            number /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        int inputNumber = 57899875;
        boolean result = isPalindrome(inputNumber);
        System.out.println(inputNumber + " is " + (result ? "a palindrome" : "not a palindrome") );
    }
}
