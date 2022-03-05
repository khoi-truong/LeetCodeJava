package com.leetcode.twoPointers;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class SubArrayProductLessThanK {
    public static List<List<Integer>> findSubArrays(int[] arr, int target) {
        List<List<Integer>> subArrays = new ArrayList<>();
        double product = 1;
        int left = 0;
        for (int right = 0; right < arr.length; right++) {
            product *= arr[right];
            while (product >= target) {
                product /= arr[left];
                left++;
            }
            List<Integer> tempList = new LinkedList<>();
            for (int i = right; i >= left; i--) {
                tempList.add(0, arr[i]);
                subArrays.add(new ArrayList<>(tempList));
            }
        }
        return subArrays;
    }
}
