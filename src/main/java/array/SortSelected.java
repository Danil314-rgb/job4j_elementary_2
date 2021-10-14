package array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MInDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.index(data, min, i, data.length);
            SwitchArray.swap(data, index, i);
        }
        return data;
    }
}
