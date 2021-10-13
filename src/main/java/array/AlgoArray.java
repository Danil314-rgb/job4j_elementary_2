package array;

public class AlgoArray {

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 1, 4};
        int temp = arr[0];
        arr[0] = arr[3];
        arr[3] = temp;

        temp = arr[1];
        arr[1] = arr[2];
        arr[2] = temp;

        temp = arr[3];
        arr[3] = arr[4];
        arr[4] = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
