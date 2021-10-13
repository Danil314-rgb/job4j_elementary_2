package array;

public class LengthArrayArrays {

    public static void main(String[] args) {
        int[][] number = {{1}, {1, 2}, {1, 2, 3}, {1, 2, 3, 4}};
        for (int i = 0; i < number.length; i++) {
            System.out.println("Размер вложенного массива равен: " + number[i].length);
        }
    }
}
