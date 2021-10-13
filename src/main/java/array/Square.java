package array;

public class Square {

    public static void main(String[] args) {
        int[] arr = calculate(4);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] calculate(int bound) {
        int[] result = new int[bound];
        for (int i = 0; i < result.length; i++) {
            result[i] = i * i;
        }
        return result;
    }
}
