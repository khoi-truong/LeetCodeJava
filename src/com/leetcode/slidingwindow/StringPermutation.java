package com.leetcode.slidingwindow;

import java.util.HashMap;

public class StringPermutation {
    public static boolean findPermutation(String str, String pattern) {
        if (str == null || str.length() == 0 || pattern == null || pattern.length() == 0) {
            return false;
        }
        int windowStart = 0;
        int matched = 0;
        HashMap<Character, Integer> charFrequencies = new HashMap<>();
        for (char charKey : pattern.toCharArray()) {
            charFrequencies.put(charKey, charFrequencies.getOrDefault(charKey, 0) + 1);
        }
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            if (charFrequencies.containsKey(rightChar)) {
                charFrequencies.put(rightChar, charFrequencies.get(rightChar) - 1);
                if (charFrequencies.get(rightChar) == 0) {
                    matched++;
                }
            }
            if (matched == charFrequencies.size()) {
                return true;
            }
            if (windowEnd >= pattern.length() - 1) {
                char leftChar = str.charAt(windowStart);
                if (charFrequencies.containsKey(leftChar)) {
                    if (charFrequencies.get(leftChar) == 0) {
                        matched--;
                    }
                    charFrequencies.put(leftChar, charFrequencies.get(leftChar) + 1);
                }
                windowStart++;
            }
        }
        return false;
    }
}