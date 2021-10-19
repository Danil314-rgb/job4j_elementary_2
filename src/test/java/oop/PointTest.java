package oop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance3d() {
        Point a = new Point(0, 0, 1);
        Point b = new Point(4, 0, 2);
        double result = a.distance3d(b);
        Assert.assertEquals(4.12, result, 0.01);
    }

    @Test
    public void distance2d() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        double result = a.distance(b);
        Assert.assertEquals(4, result, 0.01);
    }
}