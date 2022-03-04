package com.leetcode.twoPointers;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class SubarrayProductLessThanK {
    public static List<List<Integer>> findSubarrays(int[] arr, int target) {
        List<List<Integer>> subarrays = new ArrayList<>();
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
                subarrays.add(new ArrayList<>(tempList));
            }
        }
        return subarrays;
    }
}
