package com.leetcode.mergeIntervals;

import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeIntervalsTest {
    @Test
    void test1() {
        List<Interval> input = new ArrayList<>();
        input.add(new Interval(1, 4));
        input.add(new Interval(2, 5));
        input.add(new Interval(7, 9));
        List<Interval> output = MergeIntervals.merge(input);
        assertEquals(1, output.get(0).start);
        assertEquals(5, output.get(0).end);
        assertEquals(7, output.get(1).start);
        assertEquals(9, output.get(1).end);
        assertEquals(2, output.size());
    }

    @Test
    void test2() {
        List<Interval> input = new ArrayList<>();
        input.add(new Interval(6, 7));
        input.add(new Interval(2, 4));
        input.add(new Interval(5, 9));
        List<Interval> output = MergeIntervals.merge(input);
        assertEquals(2, output.get(0).start);
        assertEquals(4, output.get(0).end);
        assertEquals(5, output.get(1).start);
        assertEquals(9, output.get(1).end);
        assertEquals(2, output.size());
    }

    @Test
    void test3() {
        List<Interval> input = new ArrayList<>();
        input.add(new Interval(1, 4));
        input.add(new Interval(2, 6));
        input.add(new Interval(3, 5));
        List<Interval> output = MergeIntervals.merge(input);
        assertEquals(1, output.get(0).start);
        assertEquals(6, output.get(0).end);
        assertEquals(1, output.size());
    }
}
