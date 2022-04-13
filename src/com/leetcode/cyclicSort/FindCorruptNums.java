package com.leetcode.cyclicSort;

public class FindCorruptNums {
    public static int[] findNumbers(int[] nums) {
        int index = 0;
        while (index < nums.length) {
            int correctIndex = nums[index] - 1;
            if (nums[index] != nums[correctIndex]) {
                swap(nums, index, correctIndex);
            } else {
                index++;
            }
        }
        for (index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return new int[] { nums[index], index + 1 };
            }
        }
        return new int[] { -1, -1 };
    }

    private static void swap(int[] nums, int i1, int i2) {
        int temp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = temp;
    }
}