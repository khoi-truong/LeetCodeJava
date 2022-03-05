package com.leetcode.twoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DutchFlagTest {
    @Test
    void test1() {
        int[] arr = new int[] { 1, 0, 2, 1, 0 };
        DutchFlag.sort(arr);
        assertArrayEquals(new int[] { 0, 0, 1, 1, 2 }, arr);
    }

    @Test
    void test2() {
        int[] arr = new int[] { 2, 2, 0, 1, 2, 0 };
        DutchFlag.sort(arr);
        assertArrayEquals(new int[] { 0, 0, 1, 2, 2, 2 }, arr);
    }
}
