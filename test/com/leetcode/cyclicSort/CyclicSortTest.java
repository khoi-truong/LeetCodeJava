package com.leetcode.cyclicSort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CyclicSortTest {
    @Test
    void test1() {
        int[] nums = new int[] { 3, 1, 5, 4, 2 };
        CyclicSort.sort(nums);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, nums);
    }

    @Test
    void test2() {
        int[] nums = new int[] { 2, 6, 4, 3, 1, 5 };
        CyclicSort.sort(nums);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6 }, nums);
    }

    @Test
    void test3() {
        int[] nums = new int[] { 1, 5, 6, 4, 3, 2 };
        CyclicSort.sort(nums);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6 }, nums);
    }
}
