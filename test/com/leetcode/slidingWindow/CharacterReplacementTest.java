package com.leetcode.slidingWindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterReplacementTest {
    @Test
    void test1() {
        assertEquals(5, CharacterReplacement.findLength("aabccbb",2));
    }

    @Test
    void test2() {
        assertEquals(4, CharacterReplacement.findLength("abbcb",1));
    }

    @Test
    void test3() {
        assertEquals(3, CharacterReplacement.findLength("abccde",1));
    }

    @Test
    void test4() {
        assertEquals(16, CharacterReplacement.findLength("abbbaaabcccfaaaaaaftiftaaaaaaqefsfaaaaaaarhhhhhhhhhbnchhhh",3));
    }
}
