package com.leetcode.slidingWindow;

import java.util.HashMap;

public class CharacterReplacement {
    public static int findLength(String str, int k) {
        if (str == null || str.length() == 0 || k <= 0) {
            throw new IllegalArgumentException();
        }
        int maxLength = 0;
        int windowStart = 0;
        int maxRepeatLetterCount = 0;
        HashMap<Character, Integer> letterFrequencies = new HashMap<>();
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            letterFrequencies.put(rightChar, letterFrequencies.getOrDefault(rightChar, 0) + 1);
            maxRepeatLetterCount = Math.max(maxRepeatLetterCount, letterFrequencies.get(rightChar));
            while (windowEnd - windowStart + 1 - maxRepeatLetterCount > k) {
                char leftChar = str.charAt(windowStart);
                letterFrequencies.put(leftChar, letterFrequencies.get(leftChar) - 1);
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
}
