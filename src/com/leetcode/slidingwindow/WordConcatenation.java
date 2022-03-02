package com.leetcode.slidingwindow;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class WordConcatenation {
    public static List<Integer> findWordConcatenation(String str, String[] words) {
        List<Integer> resultIndices = new ArrayList<>();
        if (str == null || str.length() == 0 || words == null || words.length == 0) {
            return resultIndices;
        }
        HashMap<String, Integer> wordFrequencies = new HashMap<>();
        for (String word : words) {
            wordFrequencies.put(word, wordFrequencies.getOrDefault(word, 0) + 1);
        }
        int wordCount = words.length;
        int wordLength = words[0].length();

        for (int i = 0; i <= str.length() - wordCount * wordLength; i++) {
            HashMap<String, Integer> wordSeens = new HashMap<>();
            for (int j = 0; j < wordCount; j++) {
                int nextWordIndex = i + j * wordLength;
                String word = str.substring(nextWordIndex, nextWordIndex + wordLength);
                if (!wordFrequencies.containsKey(word)) {
                    break;
                }
                wordSeens.put(word, wordSeens.getOrDefault(word, 0) + 1);
                if (wordSeens.get(word) > wordFrequencies.get(word)) {
                    break;
                }
                if (j == wordCount - 1) {
                    resultIndices.add(i);
                }
            }
        }
        return resultIndices;
    }
}
