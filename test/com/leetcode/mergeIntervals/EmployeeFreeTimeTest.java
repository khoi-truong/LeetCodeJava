package com.leetcode.mergeIntervals;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeFreeTimeTest {
    @Test
    void test1() {
        List<List<Interval>> input = new ArrayList<>();
        input.add(new ArrayList<>(Arrays.asList(new Interval(1, 3), new Interval(5, 6))));
        input.add(new ArrayList<>(Arrays.asList(new Interval(2, 3), new Interval(6, 8))));
        List<Interval> result = EmployeeFreeTime.findEmployeeFreeTime(input);
        assertEquals(List.of(new Interval(3, 5)), result);
    }

    @Test
    void test2() {
        List<List<Interval>> input = new ArrayList<>();
        input.add(new ArrayList<>(Arrays.asList(new Interval(1, 3), new Interval(9, 12))));
        input.add(new ArrayList<>(List.of(new Interval(2, 4))));
        input.add(new ArrayList<>(List.of(new Interval(6, 8))));
        List<Interval> result = EmployeeFreeTime.findEmployeeFreeTime(input);
        assertEquals(Arrays.asList(new Interval(4, 6), new Interval(8, 9)), result);
    }

    @Test
    void test3() {
        List<List<Interval>> input = new ArrayList<>();
        input.add(new ArrayList<>(List.of(new Interval(1, 3))));
        input.add(new ArrayList<>(List.of(new Interval(2, 4))));
        input.add(new ArrayList<>(Arrays.asList(new Interval(3, 5), new Interval(7, 9))));
        List<Interval> result = EmployeeFreeTime.findEmployeeFreeTime(input);
        assertEquals(List.of(new Interval(5, 7)), result);
    }
}
