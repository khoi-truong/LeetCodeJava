package com.leetcode.twoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveElementTest {
    @Test
    void test1() {
        assertEquals(4, RemoveElement.remove(new int[] { 3, 2, 3, 6, 3, 10, 9, 3 }, 3));
    }

    @Test
    void test2() {
        assertEquals(2, RemoveElement.remove(new int[] { 2, 11, 2, 2, 1 }, 2));
    }
}
