package com.leetcode.slidingWindow;

public class MinSizeSubArraySum {
    public static int findMinSubArray(int S, int[] arr) {
        int minLength = Integer.MAX_VALUE;
        int windowStart = 0;
        int sum = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            sum = sum + arr[windowEnd];
            while (sum >= S) {
                int currentLength = windowEnd - windowStart + 1;
                minLength = Math.min(minLength, currentLength);
                sum = sum - arr[windowStart];
                windowStart++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
