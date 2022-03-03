import com.leetcode.slidingWindow.NoRepeatSubstring;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NoRepeatSubstringTest {
    @Test
    void test1() {
        assertEquals(3, NoRepeatSubstring.findLength("aabccbb"));
    }

    @Test
    void test2() {
        assertEquals(2, NoRepeatSubstring.findLength("abbbb"));
    }

    @Test
    void test3() {
        assertEquals(3, NoRepeatSubstring.findLength("abccde"));
    }
}
