package com.leetcode.twoPointers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TripletSumToZeroTest {
    @Test
    void test1() {
        assertEquals(
                List.of(
                        List.of(-3, 1, 2),
                        List.of(-2, 0, 2),
                        List.of(-2, 1, 1),
                        List.of(-1, 0, 1)
                ),
                TripletSumToZero.searchTriplets(new int[]{-3, 0, 1, 2, -1, 1, -2})
        );
    }

    @Test
    void test2() {
        assertEquals(
                List.of(
                        List.of(-5, 2, 3),
                        List.of(-2, -1, 3)
                ),
                TripletSumToZero.searchTriplets(new int[]{-5, 2, -1, -2, 3})
        );
    }
}
