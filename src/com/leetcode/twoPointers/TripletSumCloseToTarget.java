package com.leetcode.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSumCloseToTarget {
    public static int searchTriplet(int[] arr, int targetSum) {
        int minimumDiff = Integer.MAX_VALUE;
        if (arr == null || arr.length < 3) {
            return minimumDiff;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            int currentValue = arr[i];
            while (left < right) {
                int leftValue = arr[left];
                int rightValue = arr[right];
                int currentSum = currentValue + leftValue + rightValue;
                int currentDiff = targetSum - currentSum;
                minimumDiff = Math.min(Math.abs(currentDiff), minimumDiff);
                if (currentSum > targetSum) {
                    right--;
                } else if (currentSum < targetSum) {
                    left++;
                } else {
                    return 0;
                }
            }
        }
        return targetSum - minimumDiff;
    }
}
