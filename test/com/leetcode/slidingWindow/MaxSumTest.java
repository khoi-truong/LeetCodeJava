package com.leetcode.slidingWindow;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaxSumTest {
    @Test
    void test1() {
        assertEquals(9, MaxSum.findMaxSumSubArray(3, new int[] { 2, 1, 5, 1, 3, 2 }));
    }

    @Test
    void test2() {
        assertEquals(7, MaxSum.findMaxSumSubArray(2, new int[] { 2, 3, 4, 1, 5 }));
    }
}
