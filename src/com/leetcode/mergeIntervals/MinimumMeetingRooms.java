package com.leetcode.mergeIntervals;

import java.util.*;

public class MinimumMeetingRooms {
    public static int findMinimumMeetingRooms(List<Meeting> meetings) {
        if (meetings == null || meetings.size() == 0)
            return 0;
        meetings.sort(Comparator.comparingInt(meeting -> meeting.start));
        PriorityQueue<Meeting> minHeap = new PriorityQueue<>(Comparator.comparingInt(lhs -> lhs.end));
        for (Meeting current : meetings) {
            Meeting earliest = minHeap.poll();
            if (earliest == null) {
                minHeap.add(current);
                continue;
            }
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
