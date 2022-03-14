package com.leetcode.fastSlowPointers;

public class RearrangeList {
    public static void reorder(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalf = reverse(slow);
        ListNode firstHalf = head;
        while (firstHalf != null && secondHalf != null) {
            ListNode temp = firstHalf.next;
            firstHalf.next = secondHalf;
            firstHalf = temp;

            temp = secondHalf.next;
            secondHalf.next = firstHalf;
            secondHalf = temp;
        }
        if (firstHalf != null) {
            firstHalf.next = null;
        }
    }

    private static ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
