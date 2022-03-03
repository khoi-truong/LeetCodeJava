package com.leetcode.twoPointers;

public class RemoveElement {
    public static int remove(int[] arr, int key) {
        int nonKeyEnd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != key) {
                arr[nonKeyEnd] = arr[i];
                nonKeyEnd++;
            }
        }
        return nonKeyEnd;
    }
}
