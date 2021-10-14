package array;

public class Matrix {

    public static int[][] multiple(int size) {
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = (j + 1) * (i + 1);
            }
        }
        return arr;
    }
}
