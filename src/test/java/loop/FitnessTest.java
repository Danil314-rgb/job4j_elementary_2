package loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitnessTest {

    @Test
    public void whenI20N60Then3() {
        int ivan = 20;
        int nik = 60;
        int result = Fitness.calc(ivan, nik);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenI95N90Then0() {
        int ivan = 95;
        int nik = 90;
        int result = Fitness.calc(ivan, nik);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenI40N40Then1() {
        int ivan = 40;
        int nik = 40;
        int result = Fitness.calc(ivan, nik);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}