package com.leetcode.cyclicSort;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindAllDuplicateTest {

    @Test
    void test1() {
        int[] nums = new int[] { 3, 4, 4, 5, 5 };
        List<Integer> expectation = Arrays.asList(5, 4);
        assertEquals(expectation, FindAllDuplicate.findNumbers(nums));
    }

    @Test
    void test2() {
        int[] nums = new int[] { 5, 4, 7, 2, 3, 5, 3 };
        List<Integer> expectation = Arrays.asList(3, 5);
        assertEquals(expectation, FindAllDuplicate.findNumbers(nums));
    }
}
