package com.leetcode.twoPointers;

public class ShortestWindowSort {
    public static int sort(int[] arr) {
        if (arr.length < 2) {
            return 0;
        }
        int start = 0;
        int end = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] < arr[i - 1]) {
                start = i - 1;
                break;
            }
        }
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] < arr[i - 1]) {
                end = i;
                break;
            }
        }
        for (int i = start; i <= end ; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        for (int i = start - 1; i >=0; i--) {
            if (arr[i] > min) {
                start = i;
            }
        }
        for (int i = end + 1; i < arr.length; i++) {
            if (arr[i] < max) {
                end = i;
            }
        }
        return start == end ? 0 : end - start + 1;
    }
}
