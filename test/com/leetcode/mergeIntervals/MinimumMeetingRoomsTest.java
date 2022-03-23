package com.leetcode.mergeIntervals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumMeetingRoomsTest {
    @Test
    void test1() {
        List<Meeting> input = new ArrayList<>() {
            {
                add(new Meeting(1, 4));
                add(new Meeting(2, 5));
                add(new Meeting(7, 9));
            }
        };
        int result = MinimumMeetingRooms.findMinimumMeetingRooms(input);
        assertEquals(2, result);
    }

    @Test
    void test2() {
        List<Meeting> input = new ArrayList<>() {
            {
                add(new Meeting(6, 7));
                add(new Meeting(2, 4));
                add(new Meeting(8, 12));
            }
        };
        int result = MinimumMeetingRooms.findMinimumMeetingRooms(input);
        assertEquals(1, result);
    }

    @Test
    void test3() {
        List<Meeting> input = new ArrayList<>() {
            {
                add(new Meeting(1, 4));
                add(new Meeting(2, 3));
                add(new Meeting(3, 6));
            }
        };
        int result = MinimumMeetingRooms.findMinimumMeetingRooms(input);
        assertEquals(2, result);
    }

    @Test
    void test4() {
        List<Meeting> input = new ArrayList<>() {
            {
                add(new Meeting(4, 5));
                add(new Meeting(2, 3));
                add(new Meeting(2, 4));
                add(new Meeting(3, 5));
            }
        };
        int result = MinimumMeetingRooms.findMinimumMeetingRooms(input);
        assertEquals(2, result);
    }
}
