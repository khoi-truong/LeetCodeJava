package com.leetcode.twoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesTest {
    @Test
    void test1() {
        assertEquals(4, RemoveDuplicates.remove(new int[] { 2, 3, 3, 3, 6, 9, 9 }));
    }

    @Test
    void test2() {
        assertEquals(2, RemoveDuplicates.remove(new int[] { 2, 2, 2, 11 }));
    }
}
