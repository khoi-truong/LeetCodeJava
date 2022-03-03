package com.leetcode.slidingWindow;

import java.util.HashMap;

public class ReplacingOnes {
    public static int findLength(int[] arr, int k) {
        if (arr.length == 0 || k <= 0) {
            throw new IllegalArgumentException();
        }
        int maxLength = 0;
        int windowStart = 0;
        int maxRepeatOneCount = 0;
        HashMap<Character, Integer> letterFrequencies = new HashMap<>();
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            int rightChar = arr[windowEnd];
            if (rightChar == 1) {
                maxRepeatOneCount++;
            }
            while (windowEnd - windowStart + 1 - maxRepeatOneCount > k) {
                int leftChar = arr[windowStart];
                if (leftChar == 1) {
                    maxRepeatOneCount--;
                }
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
}
