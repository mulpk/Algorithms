package com.algorithms.bitmanipulation;

/**
 * Created by sai on 8/17/2017.
 */
public class ComplimentNumberIgnoreLeadingZeros {
    public static void main(String[] args){
        int result = findComplement(5); // 00000....00000101
        System.out.println(result);
    }

    // ignore the leading zero's in the complement
    public static int findComplement(int number) {
        // ~number will result to 1111....11111010 but that's not we want, instead ignore the leading zero's in the compliment
        // create a bit mast to do this
        //  int mask = (1 << 32 - Integer.numberOfLeadingZeros(number)) - 1;
         int mask = (Integer.highestOneBit(number) << 1) - 1;
         return ~number & mask;
    }
}
