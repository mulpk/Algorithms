package com.algorithms.strings;

/**
 * Created by sai on 7/7/2017.
 */
public class ReverseStringPreserveWordOder {

    public String reverseString_ratainOrder(String input){
        char[] inputArr = input.toCharArray();
        int j = 0;
        for(int i = 0; i < inputArr.length; i++) {
            j = i;
            while( i < inputArr.length && inputArr[i] != ' ')
                i++;
            reverseWord(inputArr,j,i-1);
        }
        return new String(inputArr);
    }

    private void reverseWord(char[] input, int i, int j) {
        while(i<j) {
            char ch = input[i];
            input[i] = input[j];
            input[j] = ch;
            i++; j--;
        }
    }

    public static void main(String args[]) {
        ReverseStringPreserveWordOder util = new ReverseStringPreserveWordOder();
        String input = "Say Hello To the World";
        String output = util.reverseString_ratainOrder(input);
        System.out.println(output);
    }
}
