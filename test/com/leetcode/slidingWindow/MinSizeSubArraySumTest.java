package com.leetcode.slidingWindow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MinSizeSubArraySumTest {
    @Test
    void test1() {
        assertEquals(2, MinSizeSubArraySum.findMinSubArray(7, new int[] { 2, 1, 5, 2, 3, 2 }));
    }

    @Test
    void test2() {
        assertEquals(1, MinSizeSubArraySum.findMinSubArray(7, new int[] { 2, 1, 5, 2, 8 }));
    }

    @Test
    void test3() {
        assertEquals(3, MinSizeSubArraySum.findMinSubArray(8, new int[] { 3, 4, 1, 1, 6 }));
    }
}
