package com.algorithms.dynamicprogramming;
import java.util.Arrays;

/**
 * Created by sai on 9/25/2017.
 */
class LongestIncreasingSubsequenceCount {
    public int findNumberOfLIS(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result,1);
        for(int i = 1; i < nums.length; i++) {
            for(int j = 0; j < i; j++) {
                if(nums[i] > nums[j] && (result[i] < (result[j]+1)))
                    result[i] = result[j]+1;
            }
        }

        // result array has all the LIS values, find the max val count
        int maxValue = result[0];
        for(int i = 1; i < result.length; i++) {
            if(result[i] > maxValue) {
                maxValue = result[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        LongestIncreasingSubsequenceCount obj = new LongestIncreasingSubsequenceCount();
        int[] input = {1,3,5,4,7,9};
        int count = obj.findNumberOfLIS(input);
        System.out.println();
        System.out.println(count);
    }
}
