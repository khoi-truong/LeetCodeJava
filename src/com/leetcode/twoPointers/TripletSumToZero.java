package com.leetcode.twoPointers;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class TripletSumToZero {
    public static List<List<Integer>> searchTriplets(int[] arr) {
        List<List<Integer>> triplets = new ArrayList<>();
        if (arr == null || arr.length < 3) {
            return triplets;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int targetSum = -arr[i];
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                int currentSum = arr[left] + arr[right];
                if (currentSum > targetSum) {
                    right--;
                } else if (currentSum < targetSum) {
                    left++;
                } else {
                    triplets.add(Arrays.asList(-targetSum, arr[left], arr[right]));
                    left++;
                    right--;
                    while (left < right && arr[left] == arr[left - 1])
                        left++; // skip same element to avoid duplicate triplets
                    while (left < right && arr[right] == arr[right + 1])
                        right--; // skip same element to avoid duplicate triplets
                }
            }
        }
        return triplets;
    }
}
