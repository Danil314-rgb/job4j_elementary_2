package array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void when3Then2() {
        int el = 3;
        int[] arr = {1, 2, 3, 4};
        int result = FindLoop.index(arr, el);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when2Then2() {
        int el = 2;
        int[] arr = {1, 0, 2, 4};
        int result = FindLoop.index(arr, el);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when5ThenMinus1() {
        int el = 5;
        int[] arr = {1, 2, 3, 4};
        int result = FindLoop.index(arr, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when5In3Of6Then4() {
        int start = 3;
        int finish = 6;
        int el = 5;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int result = FindLoop.index(arr, el, start, finish);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when5In2Of4ThenMinus1() {
        int start = 2;
        int finish = 4;
        int el = 6;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int result = FindLoop.index(arr, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}