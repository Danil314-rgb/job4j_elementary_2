package array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void when3() {
        int bound = 3;
        int[] result = Square.calculate(bound);
        int[] expected = new int[]{0, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when5() {
        int bound = 5;
        int[] result = Square.calculate(bound);
        int[] expected = new int[]{0, 1, 4, 9, 16};
        Assert.assertArrayEquals(expected, result);
    }
}