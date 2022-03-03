package com.leetcode.twoPointers;

public class RemoveDuplicates {
    public static int remove(int[] arr) {
        int nonDuplicateEnd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[nonDuplicateEnd]) {
                arr[nonDuplicateEnd + 1] = arr[i];
                nonDuplicateEnd++;
            }
        }
        return nonDuplicateEnd + 1;
    }
}
