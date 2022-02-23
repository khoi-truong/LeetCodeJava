import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import com.leetcode.slidingwindow.LongestSubstringKDistinct;

public class LongestSubstringKDistinctTest {
    @Test
    void test1() {
        assertEquals(4, LongestSubstringKDistinct.findLength("araaci",2));
    }

    @Test
    void test2() {
        assertEquals(2, LongestSubstringKDistinct.findLength("araaci",1));
    }

    @Test
    void test3() {
        assertEquals(5, LongestSubstringKDistinct.findLength("cbbebi",3));
    }

    @Test
    void test4() {
        assertEquals(6, LongestSubstringKDistinct.findLength("araaci",10));
    }
}
