package com.leetcode.cyclicSort;

public class FindDuplicate {
    public static int findNumber(int[] nums) {
        int index = 0;
        while (index < nums.length) {
            if (nums[index] != index + 1) {
                int correctIndex = nums[index] - 1;
                if (nums[index] != nums[correctIndex]) {
                    swap(nums, index, correctIndex);
                } else {
                    return nums[index];
                }
            } else {
                index++;
            }
        }
        return -1;
    }

    private static void swap(int[] nums, int i1, int i2) {
        int temp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = temp;
    }
}
