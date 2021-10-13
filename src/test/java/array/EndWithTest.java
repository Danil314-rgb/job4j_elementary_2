package array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EndWithTest {

    @Test
    public void whenEndsThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndWith.endsWith(word, post);
        Assert.assertTrue(result);
    }

    @Test
    public void whenEndsThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndWith.endsWith(word, post);
        Assert.assertFalse(result);
    }
}