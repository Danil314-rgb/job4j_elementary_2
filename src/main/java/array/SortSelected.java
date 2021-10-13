package array;

public class SortSelected {

    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 1, 5, 1, 3, 2};
        sort(arr);
        for (int item : arr) {
            System.out.println(item);
        }

    }

    public static int[] sort(int[] data) {
        int temp;
        for (int i = 0; i < data.length; i++) {
            int min = MInDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.index(data, min, i, data.length);
            if (min < data[i]) {
                temp = data[i];
                data[i] = min;
                data[index] = temp;
            }
        }
        return data;
    }
}
