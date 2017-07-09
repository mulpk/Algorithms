package com.algorithms.utils;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by sai on 7/9/2017.
 */
public class Utils {
    public static String printArray(int[] array) {
        StringBuffer output = new StringBuffer();
        for(int i : array) {
            output.append(i +",");
        }
        return output.toString();
    }
}
