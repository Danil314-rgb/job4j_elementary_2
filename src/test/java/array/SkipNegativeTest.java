package array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SkipNegativeTest {

    @Test
    public void whenSkipZeroNegative() {
        int[][] array = {{1, 2}, {2, 3}};
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {{1, 2}, {2, 3}};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSkipFiveNegative() {
        int[][] array = {{1, -1}, {-12, 3}, {-1, -14, -99}};
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {{1, 0}, {0, 3}, {0, 0, 0}};
        Assert.assertArrayEquals(expected, result);
    }
}