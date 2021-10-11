package condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {

    @Test
    public void whenX1Y7inX3Y5Then2() {
        int x1 = 1;
        int y1 = 7;
        int x2 = 3;
        int y2 = 5;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenX2Y7inX3Y5Then0() {
        int x1 = 2;
        int y1 = 7;
        int x2 = 3;
        int y2 = 5;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(result, expected);
    }
}