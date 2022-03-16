package com.leetcode.mergeIntervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntervalsIntersectionTest {
    @Test
    void test1() {
        Interval[] input1 = new Interval[] { new Interval(1, 3), new Interval(5, 6), new Interval(7, 9) };
        Interval[] input2 = new Interval[] { new Interval(2, 3), new Interval(5, 7) };
        Interval[] result = IntervalsIntersection.merge(input1, input2);
        assertEquals(result[0], new Interval(2, 3));
        assertEquals(result[1], new Interval(5, 6));
        assertEquals(result[2], new Interval(7, 7));
        assertEquals(result.length, 3);
    }

    @Test
    void test2() {
        Interval[] input1 = new Interval[] { new Interval(1, 3), new Interval(5, 7), new Interval(9, 12) };
        Interval[] input2 = new Interval[] { new Interval(5, 10) };
        Interval[] result = IntervalsIntersection.merge(input1, input2);
        assertEquals(result[0], new Interval(5, 7));
        assertEquals(result[1], new Interval(9, 10));
        assertEquals(result.length, 2);
    }
}
