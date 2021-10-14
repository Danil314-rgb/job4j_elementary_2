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

    @Test
    public void whenMonoVertical() {
        char[][] input = {
                {' ', 'X', ' '},
                {'X', 'X', 'X'},
                {' ', 'X', ' '}
        };
        int column = 1;
        boolean result = MatrixCheck.monoVertical(input, column);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNoMonoVertical() {
        char[][] input = {
                {' ', 'X', ' '},
                {'X', 'X', 'X'},
                {' ', 'X', ' '}
        };
        int column = 2;
        boolean result = MatrixCheck.monoVertical(input, column);
        Assert.assertFalse(result);
    }
}