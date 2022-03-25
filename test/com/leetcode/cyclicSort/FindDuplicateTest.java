package com.leetcode.cyclicSort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindDuplicateTest {
    @Test
    void test1() {
        int[] nums = new int[] { 1, 4, 4, 3, 2 };
        assertEquals(4, FindDuplicate.findNumber(nums));
    }

    @Test
    void test2() {
        int[] nums = new int[] { 2, 1, 3, 3, 5, 4 };
        assertEquals(3, FindDuplicate.findNumber(nums));
    }

    @Test
    void test3() {
        int[] nums = new int[] { 2, 4, 1, 4, 4 };
        assertEquals(4, FindDuplicate.findNumber(nums));
    }
}
