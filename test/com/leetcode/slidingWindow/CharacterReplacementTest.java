package com.leetcode.slidingWindow;

import com.leetcode.twoPointers.BackspaceCompare;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CharacterReplacementTest {
    @Test
    void test1() {
        assertTrue(BackspaceCompare.compare("xy#z", "xzz#"));
    }

    @Test
    void test2() {
        assertFalse(BackspaceCompare.compare("xy#z", "xyz#"));
    }

    @Test
    void test3() {
        assertTrue(BackspaceCompare.compare("xp#", "xyz##"));
    }

    @Test
    void test4() {
        assertTrue(BackspaceCompare.compare("xywrrmp", "xywrrmu#p"));
    }
}
