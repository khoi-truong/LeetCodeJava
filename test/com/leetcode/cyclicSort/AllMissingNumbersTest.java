package com.leetcode.cyclicSort;

import com.leetcode.twoPointers.SubArrayProductLessThanK;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AllMissingNumbersTest {
    @Test
    void test1() {
        assertEquals(List.of(4, 6, 7), AllMissingNumbers.findNumbers(new int[]{ 2, 3, 1, 8, 2, 3, 5, 1 }));
    }
    @Test
    void test2() {
        assertEquals(List.of(3), AllMissingNumbers.findNumbers(new int[]{ 2, 4, 1, 2 }));
    }
    @Test
    void test3() {
        assertEquals(List.of(4), AllMissingNumbers.findNumbers(new int[]{ 2, 3, 2, 1 }));
    }
}
