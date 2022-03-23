package com.leetcode.mergeIntervals;

import java.util.*;

public class MaximumCPULoad {
    public static int findMaxCPULoad(List<Job> jobs) {
        if (jobs == null || jobs.isEmpty())
            return 0;
        jobs.sort(Comparator.comparingInt(job -> job.start));
        PriorityQueue<Job> minHeap = new PriorityQueue<>(Comparator.comparingInt(job -> job.end));
        int maxLoad = 0;
        int currentLoad = 0;
        for (Job current : jobs) {
            while (!minHeap.isEmpty() && current.start > minHeap.peek().end) {
                currentLoad -= minHeap.poll().cpuLoad;
            }
            minHeap.offer(current);
            currentLoad += current.cpuLoad;
            maxLoad = Math.max(maxLoad, currentLoad);
        }
        return maxLoad;
    }
}
