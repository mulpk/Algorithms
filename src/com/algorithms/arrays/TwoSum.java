package com.algorithms.arrays;

import com.algorithms.utils.Utils;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        // n1 + n2 = 6
        // n2 = 6 - n1
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for ( int i = 0; i < numbers.length; i++ ) {
            int n1 = numbers[i];
            int n2 = target - n1;
            if (map.get(n2) == null) {
                map.put(n1, i);
            } else {
                result[0] = map.get(n2);
                result[1] = i;
                return result;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] input = { 9, 14, 33, 46, 3, 7};
        int target = 21;
        int[] result = twoSum(input, target);
        Utils.printArray(result);
    }
}
