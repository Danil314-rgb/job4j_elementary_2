package condition;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class TreeMaxTest {

    @Test
    public void max() {
        int first = 10;
        int second = 5;
        int third = 1;
        int result = TreeMax.max(first, second, third);
        int expected = 10;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void secondMax() {
        int first = 200;
        int second = 200;
        int third = 1;
        int result = TreeMax.max(first, second, third);
        int expected = 200;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void thirdMax() {
        int first = 1;
        int second = 5;
        int third = 100;
        int result = TreeMax.max(first, second, third);
        int expected = 100;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void allEq() {
        int first = 1;
        int second = 1;
        int third = 1;
        int result = TreeMax.max(first, second, third);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void firstEqSecond() {
        int first = 10;
        int second = 10;
        int third = 1;
        int result = TreeMax.max(first, second, third);
        int expected = 10;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void firstEqThird() {
        int first = 100;
        int second = 1;
        int third = 100;
        int result = TreeMax.max(first, second, third);
        int expected = 100;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void secondEqThird() {
        int first = 1;
        int second = 100;
        int third = 100;
        int result = TreeMax.max(first, second, third);
        int expected = 100;
        Assert.assertEquals(expected, result);
    }
}