package com.leetcode.cyclicSort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberTest {
    @Test
    void test1() {
        int[] nums = new int[] { 4, 0, 3, 1 };
        assertEquals(2, MissingNumber.findMissingNumber(nums));
    }

    @Test
    void test2() {
        int[] nums = new int[] { 8, 3, 5, 2, 4, 6, 0, 1 };
        assertEquals(7, MissingNumber.findMissingNumber(nums));
    }
}
