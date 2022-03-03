import com.leetcode.slidingWindow.MinimumWindowSubstring;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumWindowSubstringTest {
    @Test
    void test1() {
        assertEquals("abdec", MinimumWindowSubstring.findSubstring("aabdec", "abc"));
    }

    @Test
    void test2() {
        assertEquals("aabdec", MinimumWindowSubstring.findSubstring("aabdec", "abac"));
    }

    @Test
    void test3() {
        assertEquals("bca", MinimumWindowSubstring.findSubstring("abdbca", "abc"));
    }

    @Test
    void test4() {
        assertEquals("", MinimumWindowSubstring.findSubstring("adcad", "abc"));
    }
}
