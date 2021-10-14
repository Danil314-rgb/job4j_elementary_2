package array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DefragmentTest {
    @Test
    public void whenOneNull() {
        String[] input = {null, "I"};
        String[] result = Defragment.compress(input);
        String[] expected = {"I", null};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenNotFirstNull() {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] result = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenFirstNull() {
        String[] input = {null, "I", "wanna", null, "be", null, "compressed"};
        String[] result = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenAllNull() {
        String[] input = {null, null, null};
        String[] result = Defragment.compress(input);
        String[] expected = {null, null, null};
        Assert.assertArrayEquals(expected, result);
    }
}