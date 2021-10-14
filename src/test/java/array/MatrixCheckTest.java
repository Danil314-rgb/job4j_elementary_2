package array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixCheckTest {

    @Test
    public void whenMonoHorizontal() {
        char[][] input = {{' ', ' ', ' '}, {'X', 'X', 'X'}, {' ', ' ', ' '}};
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNoMonoHorizontal() {
        char[][] input = {{' ', ' ', ' '}, {'X', 'X', 'X'}, {' ', ' ', ' '}};
        int row = 0;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        Assert.assertFalse(result);
    }
}