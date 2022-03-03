package com.leetcode.slidingWindow;

import java.util.HashMap;

public class MaxFruitCountOf2Types {
    public static int findLength(char[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException();
        }
        int maxLength = 0;
        int windowStart = 0;
        HashMap<Character, Integer> characterFrequencies = new HashMap<>();
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            char rightChar = arr[windowEnd];
            characterFrequencies.put(rightChar, characterFrequencies.getOrDefault(rightChar, 0) + 1);
            while (characterFrequencies.size() > 2) {
                char leftChar = arr[windowStart];
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
