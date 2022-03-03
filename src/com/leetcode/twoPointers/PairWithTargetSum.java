package com.leetcode.twoPointers;

public class PairWithTargetSum {
    public static int[] search(int[] arr, int targetSum) {
        if (arr.length < 2 || arr == null) {
            return new int[] {};
        }
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if (currentSum < targetSum) {
                left++;
            } else if (currentSum > targetSum) {
                right--;
            } else {
                return new int[] { left, right };
            }
        }
        return new int[] {};
    }
}
