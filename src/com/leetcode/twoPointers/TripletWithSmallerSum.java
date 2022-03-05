package com.leetcode.twoPointers;

import java.util.Arrays;

public class TripletWithSmallerSum {
    public static int searchTriplets(int[] arr, int target) {
        int count = 0;
        if (arr == null || arr.length < 3) {
            return count;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            int currentNum = arr[i];
            int targetSum = target - currentNum;
            while (left < right) {
                if (arr[left] + arr[right] < targetSum) {
                    count += right - left;
                    left++;
                } else {
                    right--;
                }
            }
        }
        return count;
    }
}
