package com.algorithms.arrays;

import com.algorithms.utils.Utils;

public class TwoSumSorted {
    public static int[] twoSum(int[] numbers, int target) {
        int l = 0, h = numbers.length - 1;
        while (l < h) {
            int sum = numbers[l] + numbers[h];
            if (target == sum) {
                return new int[]{l+1, h+1};
            } else if (sum > target) {
                h--;
            } else {
                l++;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 7, 11, 25, 39, 50};
        int[] result = twoSum(input, 26);
        System.out.println(Utils.printArray(result));
    }
}
