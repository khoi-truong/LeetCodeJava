package com.leetcode.twoPointers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuadrupleSumToTargetTest {
    @Test
    void test1() {
        assertEquals(
                List.of(
                        List.of(-3, -1, 1, 4),
                        List.of(-3, 1, 1, 2)
                ),
                QuadrupleSumToTarget.searchQuadruplets(new int[]{4, 1, 2, -1, 1, -3}, 1)
        );
    }

    @Test
    void test2() {
        assertEquals(
                List.of(
                        List.of(-2, 0, 2, 2),
                        List.of(-1, 0, 1, 2)
                ),
                QuadrupleSumToTarget.searchQuadruplets(new int[]{2, 0, -1, 1, -2, 2}, 2)
        );
    }
}
