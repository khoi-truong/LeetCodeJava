package com.leetcode.reverseLinkedList;

public class ReverseSubList {

    public static ListNode reverse(ListNode head, int p, int q) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next;
        if (p >= q) {
            return head;
        }
        for (int i = 0; i < p - 1 && current != null; i++) {
            prev = current;
            current = current.next;
        }
        ListNode firstPartEnd = prev;
        ListNode subListEnd = current;

        for (int i = 0; i < q - p + 1 && current != null; i++) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        if (firstPartEnd != null) {
            firstPartEnd.next = prev;
        } else {
            head = prev;
        }
        subListEnd.next = current;
        return head;
    }
}
