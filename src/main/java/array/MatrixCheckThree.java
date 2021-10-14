package array;

public class MatrixCheckThree {

    public static boolean isWin(char[][] board) {
        boolean result = false;
        char[] arr = {'X', 'X', 'X', 'X', 'X'};
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
                if (MatrixCheck.monoHorizontal(board, i) || MatrixCheck.monoVertical(board, i)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
