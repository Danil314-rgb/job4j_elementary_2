package array;

public class Defragment {

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }

    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int nPoint = index;
                for (int i = index; i < array.length; i++) {
                    if (array[i] != null) {
                        int point = i;
                        swap(array, point, nPoint);
                        break;
                    }
                }
            }
        }
        return array;
    }

    public static String[] swap(String[] array, int source, int dest) {
        String temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }
}
