package com.leetcode.twoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PairWithTargetSumTest {
    @Test
    void test1() {
        assertArrayEquals(new int[] { 1, 3 }, PairWithTargetSum.search(new int[] { 1, 2, 3, 4, 6 }, 6));
    }

    @Test
    void test2() {
        assertArrayEquals(new int[] { 0, 2 }, PairWithTargetSum.search(new int[] { 2, 5, 9, 11 }, 11));
    }
}
