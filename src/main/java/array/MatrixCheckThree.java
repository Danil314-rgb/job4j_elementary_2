package array;

public class MatrixCheckThree {

    public static boolean isWin(char[][] matrix) {
        boolean result = false;
        for (int index = 0; index < matrix.length; index++) {
            if (matrix[index][index] == 'X') {
                if (MatrixCheck.monoHorizontal(matrix, index) || MatrixCheck.monoVertical(matrix, index)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}