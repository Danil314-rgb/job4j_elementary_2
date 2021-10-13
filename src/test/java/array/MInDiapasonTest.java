package array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MInDiapasonTest {

    @Test
    public void whenFirstMin() {
        int[] arr = {1, 2, 3, 4};
        int start = 0;
        int finish = 3;
        int result = MInDiapason.findMin(arr, start, finish);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenLastMin() {
        int[] arr = {1, 2, 3, 4, 0};
        int start = 2;
        int finish = 4;
        int result = MInDiapason.findMin(arr, start, finish);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMiddleMin() {
        int[] arr = {1, 2, -2, 4, 0};
        int start = 1;
        int finish = 4;
        int result = MInDiapason.findMin(arr, start, finish);
        int expected = -2;
        Assert.assertEquals(expected, result);
    }
}