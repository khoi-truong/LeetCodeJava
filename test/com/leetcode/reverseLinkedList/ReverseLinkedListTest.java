package com.leetcode.reverseLinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ReverseLinkedListTest {

    @Test
    void test1() {
        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(8);
        head.next.next.next.next = new ListNode(10);
        ListNode output = ReverseLinkedList.reverse(head);
        assertEquals(output.value, 10);
        assertEquals(output.next.value, 8);
        assertEquals(output.next.next.value, 6);
        assertEquals(output.next.next.next.value, 4);
        assertEquals(output.next.next.next.next.value, 2);
        assertNull(output.next.next.next.next.next);
    }
}
