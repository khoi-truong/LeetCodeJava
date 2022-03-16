package com.leetcode.mergeIntervals;

import java.util.Arrays;
import java.util.Comparator;

public class ConflictingAppointments {

    public static boolean canAttendAllAppointments(Interval[] intervals) {
        if (intervals.length < 2) {
            return true;
        }
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval.start));
        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i].end > intervals[i + 1].start) {
                return false;
            }
        }
        return true;
    }
}
