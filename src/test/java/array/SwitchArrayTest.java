package array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenS0DLengthMinus1() {
        int[] arr = {1, 2, 3, 4};
        int source = 0;
        int dest = arr.length - 1;
        int[] result = SwitchArray.swap(arr, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenS0D4() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int source = 0;
        int dest = 4;
        int[] result = SwitchArray.swap(arr, source, dest);
        int[] expected = {5, 2, 3, 4, 1, 6};
        Assert.assertArrayEquals(expected, result);
    }
}