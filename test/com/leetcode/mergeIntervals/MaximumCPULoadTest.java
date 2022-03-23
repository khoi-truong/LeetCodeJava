package com.leetcode.mergeIntervals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumCPULoadTest {
    @Test
    void test1() {
        List<Job> input = new ArrayList<>() {
            {
                add(new Job(1, 4, 3));
                add(new Job(2, 5, 4));
                add(new Job(7, 9, 6));
            }
        };
        int result = MaximumCPULoad.findMaxCPULoad(input);
        assertEquals(7, result);
    }

    @Test
    void test2() {
        List<Job> input = new ArrayList<>() {
            {
                add(new Job(6, 7, 10));
                add(new Job(2, 4, 11));
                add(new Job(8, 12, 15));
            }
        };
        int result = MaximumCPULoad.findMaxCPULoad(input);
        assertEquals(15, result);
    }

    @Test
    void test3() {
        List<Job> input = new ArrayList<>() {
            {
                add(new Job(1, 4, 2));
                add(new Job(2, 4, 1));
                add(new Job(3, 6, 5));
            }
        };
        int result = MaximumCPULoad.findMaxCPULoad(input);
        assertEquals(8, result);
    }

    @Test
    void test4() {
        List<Job> input = new ArrayList<>() {
            {
                add(new Job(1, 4, 2));
                add(new Job(1, 2, 1));
            }
        };
        int result = MaximumCPULoad.findMaxCPULoad(input);
        assertEquals(3, result);
    }
}
