package com.algorithms.strings;

/**
 * Created by sai on 7/9/2017.
 */
public class ReverseStringWordOder {

    public String reverseStringWordOrder(String input){
        char[] inputArr = input.toCharArray();
        // reverse string
        reverseCharArray(inputArr, 0, inputArr.length - 1);
        // reverse each word
        int j;
        for(int i = 0; i < inputArr.length; i++) {
            j = i;
            while( i < inputArr.length && inputArr[i] != ' ')
                i++;
            reverseCharArray(inputArr,j,i-1);
        }
        return new String(inputArr);
    }

    public void reverseCharArray(char[] input, int i, int j){
        char ch;
        while( i < j ) {
               ch = input[i];
               input[i] = input[j];
               input[j] = ch;
               i++; j--;
        }
    }

    public static void main(String args[]) {
        ReverseStringWordOder util = new ReverseStringWordOder();
        String input = "Say Hello To the World";
        String output = util.reverseStringWordOrder(input);
        System.out.println(output);
    }
    /*
        input : Say Hello To The World
        output : World The To Hello Say
     */
}
