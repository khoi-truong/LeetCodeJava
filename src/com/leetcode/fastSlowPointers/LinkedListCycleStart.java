package com.leetcode.fastSlowPointers;

public class LinkedListCycleStart {
    public static ListNode findCycleStart(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast)
                break;
        }
        if (slow != fast || head.next == null) {
            return null;
        }
        ListNode current = slow;
        int cycleLength = 0;
        do {
            current = current.next;
            cycleLength++;
        } while (current != slow);
        ListNode pointer1 = head;
        ListNode pointer2 = head;
        for (int i = 0; i < cycleLength; i++) {
            pointer2 = pointer2.next;
        }
        while (pointer1 != pointer2) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        return cycleLength == 0 ? null : pointer1;
    }
}
