package com.leetcode.cyclicSort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstSmallestMissingPositiveTest {

    @Test
    void test1() {
        int[] nums = new int[] { -3, 1, 5, 4, 2 };
        assertEquals(3, FirstSmallestMissingPositive.findNumber(nums));
    }

    @Test
    void test2() {
        int[] nums = new int[] { 3, -2, 0, 1, 2 };
        assertEquals(4, FirstSmallestMissingPositive.findNumber(nums));
    }

    @Test
    void test3() {
        int[] nums = new int[] { 3, 2, 5, 1 };
        assertEquals(4, FirstSmallestMissingPositive.findNumber(nums));
    }

    @Test
    void test4() {
        int[] nums = new int[] { -3, 20, 5, 10 };
        assertEquals(1, FirstSmallestMissingPositive.findNumber(nums));
    }
}
