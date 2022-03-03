import com.leetcode.slidingWindow.MaxFruitCountOf2Types;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxFruitCountOf2TypesTest {
    @Test
    void test1() {
        assertEquals(3, MaxFruitCountOf2Types.findLength(new char[] { 'A', 'B', 'C', 'A', 'C' }));
    }

    @Test
    void test2() {
        assertEquals(5, MaxFruitCountOf2Types.findLength(new char[] { 'A', 'B', 'C', 'B', 'B', 'C' }));
    }
}
