package com.leetcode.fastSlowPointers;

public class HappyNumber {
    public static boolean find(int num) {
        int slow = num;
        int fast = num;
        do {
            slow = getNextNumber(slow);
            fast = getNextNumber(getNextNumber(fast));
        } while (slow != fast);
        return slow == 1;
    }

    private static int getNextNumber(int num) {
        int sum = 0;
        int digit;
        while (num > 0) {
            digit = num % 10;
            sum += digit * digit;
            num = num / 10;
        }
        return sum;
    }
}
