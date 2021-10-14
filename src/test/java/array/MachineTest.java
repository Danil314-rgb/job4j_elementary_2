package array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MachineTest {

    @Test
    public void when100by50() {
        int money = 100;
        int price = 50;
        int[] result = Machine.change(money, price);
        int[] expected = {10, 10, 10, 10, 10};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when100by97() {
        int money = 100;
        int price = 97;
        int[] result = Machine.change(money, price);
        int[] expected = {2, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when50by13() {
        int money = 50;
        int price = 13;
        int[] result = Machine.change(money, price);
        int[] expected = {10, 10, 10, 5, 2};
        Assert.assertArrayEquals(expected, result);
    }
}