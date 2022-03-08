package com.leetcode.fastSlowPointers;

public class PalindromicLinkedList {
    public static boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalf = reverse(slow);
        ListNode secondHalfCopy = secondHalf;

        while (head != null && secondHalf != null) {
            if (head.value != secondHalf.value) {
                break;
            }
            head = head.next;
            secondHalf = secondHalf.next;
        }
        reverse(secondHalfCopy);
        return head == null || secondHalf == null;
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
