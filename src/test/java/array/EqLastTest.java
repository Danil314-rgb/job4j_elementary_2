package array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EqLastTest {

    @Test
    public void whenEq() {
        int[] left = {1, 2, 3, 4};
        int[] right = {1, 2, 4, 4};
        boolean result = EqLast.check(left, right);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotEq() {
        int[] left = {1, 2, 4, 4, 5};
        int[] right = {1, 2, 4, 4};
        boolean result = EqLast.check(left, right);
        Assert.assertFalse(result);
    }
}