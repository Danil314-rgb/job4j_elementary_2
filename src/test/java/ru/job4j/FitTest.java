package ru.job4j;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void when178Then89Dot6() {
        short manWeight = 178;
        double expected = 89.6;
        double out = Fit.manWeight(manWeight);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void when156Then52Dot9() {
        short womenWeight = 156;
        double expected = 52.9;
        double out = Fit.womanWeight(womenWeight);
        Assert.assertEquals(expected, out, 0.1);
    }
}