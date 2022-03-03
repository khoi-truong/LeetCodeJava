package com.leetcode.slidingWindow;

import java.util.HashMap;

public class NoRepeatSubstring {
    public static int findLength(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException();
        }
        int maxLength = 0;
        int windowStart = 0;
        HashMap<Character, Integer> characterIndexes = new HashMap<>();
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            if (characterIndexes.containsKey(rightChar)) {
                windowStart = Math.max(windowStart, characterIndexes.get(rightChar) + 1);
            }
            characterIndexes.put(rightChar, windowEnd);
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
}
