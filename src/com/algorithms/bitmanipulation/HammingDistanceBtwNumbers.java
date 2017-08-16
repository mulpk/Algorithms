package com.algorithms.bitmanipulation;

/**
 * Created by sai on 8/16/2017.
 * refer https://en.wikipedia.org/wiki/Hamming_distance
 */
public class HammingDistanceBtwNumbers {
    public static int hammingDistance(int a, int b){
        // a ^ b only sets the bits when both input bits differ
        // and as mentioned before bitCount() method calculates the number of set bits of a given number
        return Integer.bitCount(a ^ b);
    }

    public static void main(String[] args){
        // a = 10000, b = 01111, both differ by 5 bits which is the hamming distance
        System.out.println(hammingDistance(16,15));
    }
}
