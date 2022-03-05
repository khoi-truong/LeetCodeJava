package com.leetcode.twoPointers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubArrayProductLessThanKTest {
    @Test
    void test1() {
        assertEquals(
                List.of(
                        List.of(2),
                        List.of(5),
                        List.of(2, 5),
                        List.of(3),
                        List.of(5, 3),
                        List.of(10)
                ),
                SubArrayProductLessThanK.findSubArrays(new int[]{2, 5, 3, 10}, 30)
        );
    }

    @Test
    void test2() {
        assertEquals(
                List.of(
                        List.of(8),
                        List.of(2),
                        List.of(8, 2),
                        List.of(6),
                        List.of(2, 6),
                        List.of(5),
                        List.of(6, 5)
                ),
                SubArrayProductLessThanK.findSubArrays(new int[]{8, 2, 6, 5}, 50)
        );
    }
}
