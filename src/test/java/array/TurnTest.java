package array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void whenEvenArray() {
        int[] arr = {1, 2, 3, 4};
        int[] result = Turn.back(arr);
        int[] expected = {4, 3, 2, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenOddArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = Turn.back(arr);
        int[] expected = {5, 4, 3, 2, 1};
        Assert.assertArrayEquals(expected, result);
    }
}