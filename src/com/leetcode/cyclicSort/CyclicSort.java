package com.leetcode.cyclicSort;

public class CyclicSort {
    public static void sort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int j = nums[i] - 1;
            if (nums[i] != i + 1) {
                swap(nums, i, j);
            } else {
                i++;
            }
        }
    }

    private static void swap(int[] nums, int i1, int i2) {
        int temp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = temp;
    }
}
