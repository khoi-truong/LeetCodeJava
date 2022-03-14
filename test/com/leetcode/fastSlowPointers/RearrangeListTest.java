package com.leetcode.fastSlowPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RearrangeListTest {
    @Test
    void test1() {
        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(8);
        head.next.next.next.next = new ListNode(10);
        head.next.next.next.next.next = new ListNode(12);
        RearrangeList.reorder(head);
        assertEquals(2, head.value);
        assertEquals(12, head.next.value);
        assertEquals(4, head.next.next.value);
        assertEquals(10, head.next.next.next.value);
        assertEquals(6, head.next.next.next.next.value);
        assertEquals(8, head.next.next.next.next.next.value);
        assertNull(head.next.next.next.next.next.next);
    }

    @Test
    void test2() {
        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(8);
        head.next.next.next.next = new ListNode(10);
        RearrangeList.reorder(head);
        assertEquals(2, head.value);
        assertEquals(10, head.next.value);
        assertEquals(4, head.next.next.value);
        assertEquals(8, head.next.next.next.value);
        assertEquals(6, head.next.next.next.next.value);
        assertNull(head.next.next.next.next.next);
    }
}
