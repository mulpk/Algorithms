package com.algorithms.bitmanipulation;

/**
 * Created by sai on 8/16/2017.
 * Aim is to count number of 1's in binary representation of a given integer
 */
public class CountSetBits {
    public static int countOnes(int number) {
        if(number == 0)
            return 0;
        else
            return (number & 1) + countOnes(number >> 1);
    }

    public static void main(String args[]) {
        System.out.println(countOnes(1023));
        System.out.println(countOnes(127));

        //alternate solution if you want to use java api
        System.out.println(Integer.bitCount(1023));

    }
}
