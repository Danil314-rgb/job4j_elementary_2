package array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinTest {

    @Test
    public void whenLastMinThen1() {
        int[] arr = {4, 5, 6, 1};
        int result = Min.findMin(arr);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFirstMinThen0() {
        int[] arr = {0, 4, 5, 6, 1};
        int result = Min.findMin(arr);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMiddleMinThenMinus1() {
        int[] arr = {2, 0, -1, 5, 6, 1};
        int result = Min.findMin(arr);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}