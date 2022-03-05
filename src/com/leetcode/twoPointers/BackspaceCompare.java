package com.leetcode.twoPointers;

public class BackspaceCompare {
    public static boolean compare(String str1, String str2) {
        int index1 = str1.length() - 1, index2 = str2.length() - 1;
        while (index1 >= 0 && index2 >= 0) {
            int next1 = getNextValidCharIndex(str1, index1);
            int next2 = getNextValidCharIndex(str2, index2);
            if (next1 < 0 && next2 < 0) {
                return true;
            }
            if (next1 < 0 || next2 < 0) {
                return false;
            }
            if (str1.charAt(next1) != str2.charAt(next2)) {
                return false;
            }
            index1 = next1 - 1;
            index2 = next2 - 1;
        }
        return true;
    }

    private static int getNextValidCharIndex(String str, int index) {
        int backspaceCount = 0;
        while (index >= 0) {
            if (str.charAt(index) == '#') // found a backspace character
                backspaceCount++;
            else if (backspaceCount > 0) // a non-backspace character
                backspaceCount--;
            else
                break;

            index--; // skip a backspace or a valid character
        }
        return index;
    }
}
