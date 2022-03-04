package com.leetcode.twoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TripletWithSmallerSumTest {
    @Test
    void test1() {
        assertEquals(2, TripletWithSmallerSum.searchTriplets(new int[] { -1, 0, 2, 3 }, 3));
    }

    @Test
    void test2() {
        assertEquals(4, TripletWithSmallerSum.searchTriplets(new int[] { -1, 4, 2, 1, 3 }, 5));
    }
}
