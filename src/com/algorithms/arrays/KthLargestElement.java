package com.algorithms.arrays;

import java.util.Arrays;

public class KthLargestElement {
    public static int findKthLargest(int[] numbers, int k) {
        Arrays.sort(numbers);
        int index = numbers.length - k;
        return numbers[index];
    }

    public static void main(String[] args) {
        int[] input = {1,3,2,3,1,3,1,2,4,5,5,6};
        int k = 4;
        int result = findKthLargest(input, k);
        System.out.println(result);
    }
}
