package com.leetcode.mergeIntervals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InsertIntervalTest {
    @Test
    void test1() {
        List<Interval> input = new ArrayList<>();
        input.add(new Interval(1, 3));
        input.add(new Interval(5, 7));
        input.add(new Interval(8, 12));
        List<Interval> output = InsertInterval.insert(input, new Interval(4, 6));
        assertEquals(1, output.get(0).start);
        assertEquals(3, output.get(0).end);
        assertEquals(4, output.get(1).start);
        assertEquals(7, output.get(1).end);
        assertEquals(8, output.get(2).start);
        assertEquals(12, output.get(2).end);
        assertEquals(3, output.size());
    }

    @Test
    void test2() {
        List<Interval> input = new ArrayList<>();
        input.add(new Interval(1, 3));
        input.add(new Interval(5, 7));
        input.add(new Interval(8, 12));
        List<Interval> output = InsertInterval.insert(input, new Interval(4, 10));
        assertEquals(1, output.get(0).start);
        assertEquals(3, output.get(0).end);
        assertEquals(4, output.get(1).start);
        assertEquals(12, output.get(1).end);
        assertEquals(2, output.size());
    }

    @Test
    void test3() {
        List<Interval> input = new ArrayList<>();
        input.add(new Interval(2, 3));
        input.add(new Interval(5, 7));
        List<Interval> output = InsertInterval.insert(input, new Interval(1, 4));
        assertEquals(1, output.get(0).start);
        assertEquals(4, output.get(0).end);
        assertEquals(5, output.get(1).start);
        assertEquals(7, output.get(1).end);
        assertEquals(2, output.size());
    }
}
