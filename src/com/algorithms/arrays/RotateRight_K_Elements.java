package com.algorithms.arrays;

import com.algorithms.utils.Utils;

/**
 * Created by sai on 7/9/2017.
 */
public class RotateRight_K_Elements {

    /*  input: 1,2,3,4,5,6,7,9,10
        k = 4

        rotate array
        10,9,8,7,6,5,4,3,2,1
        rotate 0,k-1
        7,8,9,10,6,5,4,3,2,1
        rotate k, n-1
        7,8,9,10,1,2,3,4,5,6
    */

    public int[] rotateArrayRightByK(int[] input, int k) {
        if(input.length < 2)
            return input;
        if(k > input.length)
            k = k % input.length;
        swap(input,0,input.length-1);
        swap(input,0,k-1);
        swap(input,k,input.length-1);
        return input;
    }

    private void swap(int[] input, int i, int j) {
        while( i < j ) {
            int k = input[i];
            input[i] = input[j];
            input[j] = k;
            i++; j--;
        }
    }

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7,8,9,10};
        int k = 14;
        RotateRight_K_Elements util = new RotateRight_K_Elements();
        int[] output = util.rotateArrayRightByK(input, k);
        System.out.println(Utils.printArray(output));
        // output : 7,8,9,10,1,2,3,4,5,6
    }
}

