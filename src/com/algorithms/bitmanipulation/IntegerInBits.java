package com.algorithms.bitmanipulation;

/**
 * Created by sai on 11/6/2018
 */
public class IntegerInBits {

    public static String integerToBits(int number) {
        // integer in java is 32 bits, so need an array of same size
        int count = 32;
        char[] result = new char[32];
        while(--count >= 0) {
            result[count] = (number & 1) == 1 ? '1' : '0';
            number = number >> 1;
        }
        return new String(result);
    }

    public static void main(String[] args) {
        int input = 585;
        System.out.println(integerToBits(input));
        // java Integer api for printing binary String
        System.out.println(Integer.toBinaryString(input));
    }
}
