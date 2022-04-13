package com.leetcode.cyclicSort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FindCorruptNumsTest {

    @Test
    void test1() {
        int[] nums = new int[] { 3, 1, 2, 5, 2 };
        assertArrayEquals(new int[] { 2, 4 }, FindCorruptNums.findNumbers(nums));
    }

    @Test
    void test2() {
        int[] nums = new int[] { 3, 1, 2, 3, 6, 4 };
        assertArrayEquals(new int[] { 3, 5 }, FindCorruptNums.findNumbers(nums));
    }
}
