package com.leetcode.slidingWindow;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordConcatenationTest {
    @Test
    void test1() {
        assertEquals(List.of(0, 3), WordConcatenation.findWordConcatenation("catfoxcat", new String[] { "cat", "fox" }));
    }

    @Test
    void test2() {
        assertEquals(List.of(3), WordConcatenation.findWordConcatenation("catcatfoxfox", new String[] { "cat", "fox" }));
    }
}
