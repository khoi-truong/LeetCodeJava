package com.leetcode.twoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortestWindowSortTest {
    @Test
    void test1() {
        assertEquals(5, ShortestWindowSort.sort(new int[] { 1, 2, 5, 3, 7, 10, 9, 12 }));
    }

    @Test
    void test2() {
        assertEquals(5, ShortestWindowSort.sort(new int[] { 1, 3, 2, 0, -1, 7, 10 }));
    }

    @Test
    void test3() {
        assertEquals(0, ShortestWindowSort.sort(new int[] { 1, 2, 3 }));
    }

    @Test
    void test4() {
        assertEquals(3, ShortestWindowSort.sort(new int[] { 3, 2, 1 }));
    }
}
