package com.leetcode.mergeIntervals;

import java.util.*;

public class MergeIntervals {

    public static List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() < 2) {
            return intervals;
        }
        intervals.sort(Comparator.comparingInt(interval -> interval.start));
        List<Interval> mergedIntervals = new LinkedList<>();
        Iterator<Interval> intervalIterator = intervals.iterator();
        Interval interval = intervalIterator.next();
        int start = interval.start;
        int end = interval.end;
        while (intervalIterator.hasNext()) {
            interval = intervalIterator.next();
            if (interval.start <= end) {
                end = Math.max(interval.end, end);
            } else {
                mergedIntervals.add(new Interval(start, end));
                start = interval.start;
                end = interval.end;
            }
        }
        mergedIntervals.add(new Interval(start, end));
        return mergedIntervals;
    }
}
