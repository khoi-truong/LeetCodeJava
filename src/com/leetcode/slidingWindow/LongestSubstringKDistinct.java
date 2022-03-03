package com.leetcode.slidingWindow;

import java.util.HashMap;

public class LongestSubstringKDistinct {
    public static int findLength(String str, int k) {
        if (str == null || str.length() == 0 || k <= 0) {
            throw new IllegalArgumentException();
        }
        int maxLength = 0;
        int windowStart = 0;
        HashMap<Character, Integer> characterFrequencies = new HashMap<>();
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            characterFrequencies.put(rightChar, characterFrequencies.getOrDefault(rightChar, 0) + 1);
            while (characterFrequencies.size() > k) {
                char leftChar = str.charAt(windowStart);
                characterFrequencies.put(leftChar, characterFrequencies.get(leftChar) - 1);
                if (characterFrequencies.get(leftChar) == 0) {
                    characterFrequencies.remove(leftChar);
                }
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
}
