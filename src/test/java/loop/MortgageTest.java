package loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MortgageTest {

    @Test
    public void whenA1000S1200P1Then1() {
        int amount = 1000;
        int salary = 1200;
        double percent = 1;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenA100S120P1Then50() {
        int amount = 100;
        int salary = 120;
        double percent = 50;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }
}