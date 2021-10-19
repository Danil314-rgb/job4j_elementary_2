package oop;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void whenAreaThen8() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        Assert.assertEquals(8, result, 0.001);
    }

    @Test
    public void whenAreaThenMinus1() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 0);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        Assert.assertEquals(-1, result, 0.001);
    }
}