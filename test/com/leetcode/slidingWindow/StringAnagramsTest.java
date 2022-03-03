package com.leetcode.slidingWindow;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringAnagramsTest {
    @Test
    void test1() {
        assertEquals(List.of(1, 2), StringAnagrams.findStringAnagrams("ppqp", "pq"));
    }

    @Test
    void test2() {
        assertEquals(List.of(2,3, 4), StringAnagrams.findStringAnagrams("abbcabc", "abc"));
    }
}
