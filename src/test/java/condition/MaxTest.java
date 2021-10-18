package condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenA10B21That21() {
        int a = 10;
        int b = 21;
        int result = Max.max(a, b);
        int expected = 21;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenA10B21C12That21() {
        int a = 10;
        int b = 21;
        int c = 12;
        int result = Max.max(a, b, c);
        int expected = 21;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenA10B12C12D0That12() {
        int a = 10;
        int b = 12;
        int c = 12;
        int d = 0;
        int result = Max.max(a, b, c, d);
        int expected = 12;
        Assert.assertEquals(expected, result);
    }
}