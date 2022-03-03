package com.leetcode.twoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortedArraySquaresTest {
    @Test
    void test1() {
        assertArrayEquals(new int[] { 0, 1, 4, 4, 9 }, SortedArraySquares.makeSquares(new int[] { -2, -1, 0, 2, 3 }));
    }

    @Test
    void test2() {
        assertArrayEquals(new int[] { 0, 1, 1, 4, 9 }, SortedArraySquares.makeSquares(new int[] { -3, -1, 0, 1, 2 }));
    }
}
