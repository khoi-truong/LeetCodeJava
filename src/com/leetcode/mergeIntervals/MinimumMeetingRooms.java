package com.leetcode.mergeIntervals;

import java.util.*;

public class MinimumMeetingRooms {
    public static int findMinimumMeetingRooms(List<Meeting> meetings) {
        if (meetings == null || meetings.size() == 0)
            return 0;
        meetings.sort(Comparator.comparingInt(meeting -> meeting.start));
        PriorityQueue<Meeting> minHeap = new PriorityQueue<>(Comparator.comparingInt(lhs -> lhs.end));
        minHeap.add(meetings.get(0));
        for (int i = 1; i < meetings.size(); i++) {
            Meeting current = meetings.get(i);
            Meeting earliest = minHeap.poll();
            if (current.start >= earliest.end) {
                earliest.end = current.end;
            } else {
                minHeap.add(current);
            }
            minHeap.add(earliest);
        }
        return minHeap.size();
    }
}
