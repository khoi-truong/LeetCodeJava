package com.leetcode.reverseLinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ReverseSubListTest {

    @Test
    void test1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode output = ReverseSubList.reverse(head, 2, 4);
        assertEquals(output.value, 1);
        assertEquals(output.next.value, 4);
        assertEquals(output.next.next.value, 3);
        assertEquals(output.next.next.next.value, 2);
        assertEquals(output.next.next.next.next.value, 5);
        assertNull(output.next.next.next.next.next);
    }
}
