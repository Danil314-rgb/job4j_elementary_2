package loop;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenS0F10Then30() {
        int start = 0;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenS3F6Then30() {
        int start = 3;
        int finish = 6;
        int result = Counter.sumByEven(start, finish);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }
}