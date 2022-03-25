package com.leetcode.mergeIntervals;

import java.util.*;

public class EmployeeFreeTime {
    public static List<Interval> findEmployeeFreeTime(List<List<Interval>> schedule) {
        List<Interval> result = new ArrayList<>();
        PriorityQueue<EmployeeInterval> minHeap = new PriorityQueue<>(Comparator.comparingInt(employeeInterval -> employeeInterval.interval.start));
        for (int i = 0; i < schedule.size(); i++) {
            minHeap.offer(new EmployeeInterval(schedule.get(i).get(0), i, 0));
        }
        if (minHeap.isEmpty()) {
            return result;
        }
        Interval previousInterval = minHeap.peek().interval;
        while (!minHeap.isEmpty()) {
            EmployeeInterval queueTop = minHeap.poll();
            if (previousInterval.end < queueTop.interval.start) {
                result.add(new Interval(previousInterval.end, queueTop.interval.start));
                previousInterval = queueTop.interval;
            } else if (previousInterval.end < queueTop.interval.end){
                previousInterval = queueTop.interval;
            }
            List<Interval> employeeSchedule = schedule.get(queueTop.employeeIndex);
            if (employeeSchedule.size() > queueTop.intervalIndex + 1) {
                minHeap.offer(new EmployeeInterval(employeeSchedule.get(queueTop.intervalIndex + 1), queueTop.employeeIndex, queueTop.intervalIndex + 1));
            }
        }
        return result;
    }
}
