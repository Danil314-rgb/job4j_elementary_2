package array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckTest {

    @Test
    public void whenTrueThenTrue() {
        boolean[] data = {true, true, true};
        boolean result = Check.mono(data);
        Assert.assertTrue(result);
    }

    @Test
    public void whenTrueThenFalse() {
        boolean[] data = {true, true, true, false};
        boolean result = Check.mono(data);
        Assert.assertFalse(result);
    }

    @Test
    public void whenFalseThenTrue() {
        boolean[] data = {false, false, false};
        boolean result = Check.mono(data);
        Assert.assertTrue(result);
    }

    @Test
    public void whenFalseThenFalse() {
        boolean[] data = {false, false, false, true};
        boolean result = Check.mono(data);
        Assert.assertFalse(result);
    }
}