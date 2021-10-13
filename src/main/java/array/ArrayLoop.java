package array;

public class ArrayLoop {

    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = i * 2 + 3;
        }
        for (int item : arr) {
            System.out.println(item);
        }
    }
}
