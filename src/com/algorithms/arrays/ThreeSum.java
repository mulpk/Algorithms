package com.algorithms.arrays;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int l, r;
        Set<String> eliminateDuplicates = new TreeSet<String>();
        for(int i=0; i < nums.length - 2; i++) {
            l = i + 1;
            r = nums.length - 1;

            while(l < r) {
                if(nums[i] + nums[l] + nums[r] == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    Collections.sort(list);
                    if(!eliminateDuplicates.contains(list.toString())) {
                        eliminateDuplicates.add(list.toString());
                        result.add(list);
                    }
                    l++;
                    r--;
                } else if( nums[i] + nums[l] + nums[r] > 0) {
                    r--;
                } else if( nums[i] + nums[l] + nums[r] < 0) {
                    l++;
                }
            }
        }
        return result;
    }

    public static void main(String args[]) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = threeSum(nums);

        for(List list : lists) {
            System.out.println(list);
        }
    }
}