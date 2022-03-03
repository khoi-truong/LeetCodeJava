import com.leetcode.slidingWindow.ReplacingOnes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReplacingOnesTest {
    @Test
    void test1() {
        assertEquals(6, ReplacingOnes.findLength(new int[] { 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1 },2));
    }

    @Test
    void test2() {
        assertEquals(9, ReplacingOnes.findLength(new int[] { 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1 },3));
    }
}
