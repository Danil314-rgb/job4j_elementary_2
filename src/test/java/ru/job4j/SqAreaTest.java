package ru.job4j;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Then2() {
        double p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        double result = 2;
        Assert.assertEquals(result, out, 0.1);
    }

    @Test
    public void whenP5K4Then1() {
        double p = 5;
        double k = 4;
        double out = SqArea.square(p, k);
        double result = 1;
        Assert.assertEquals(result, out, 0.1);
    }

    @Test
    public void whenP7K2Then2Dot7() {
        double p = 7;
        double k = 2;
        double out = SqArea.square(p, k);
        double result = 2.7;
        Assert.assertEquals(result, out, 0.1);
    }
}