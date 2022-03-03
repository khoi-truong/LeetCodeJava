package com.leetcode.twoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TripletSumCloseToTargetTest {
    @Test
    void test1() {
        assertEquals(1, TripletSumCloseToTarget.searchTriplet(new int[] { -2, 0, 1, 2 }, 2));
    }

    @Test
    void test2() {
        assertEquals(0, TripletSumCloseToTarget.searchTriplet(new int[] { -3, -1, 1, 2 }, 1));
    }

    @Test
    void test3() {
        assertEquals(3, TripletSumCloseToTarget.searchTriplet(new int[] { 1, 0, 1, 1 }, 100));
    }
}
