import com.leetcode.slidingwindow.StringPermutation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringPermutationTest {
    @Test
    void test1() {
        assertFalse(StringPermutation.findPermutation("odicf", "dc"));
    }

    @Test
    void test2() {
        assertTrue(StringPermutation.findPermutation("oidbcaf", "abc"));
    }

    @Test
    void test3() {
        assertTrue(StringPermutation.findPermutation("bcdxabcdy", "bcdyabcdx"));
    }

    @Test
    void test4() {
        assertTrue(StringPermutation.findPermutation("aaacb", "abc"));
    }
}
