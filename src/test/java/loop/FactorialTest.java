package loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void when5then120() {
        int number = 5;
        int result = Factorial.calc(number);
        int expected = 120;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void when0then1() {
        int number = 0;
        int result = Factorial.calc(number);
        int expected = 1;
        Assert.assertEquals(result, expected);
    }
}