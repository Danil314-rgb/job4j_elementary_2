package array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixSumTest {

    @Test
    public void whenOne() {
        int[][] array = {{1, 2}};
        int result = MatrixSum.sum(array);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenTwo() {
        int[][] array = {{1, 2}, {3, 4}, {10}};
        int result = MatrixSum.sum(array);
        int expected = 20;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenThree() {
        int[][] array = {{2}, {3, 4}, {5, 5, 5}};
        int result = MatrixSum.sum(array);
        int expected = 24;
        Assert.assertEquals(expected, result);
    }
}