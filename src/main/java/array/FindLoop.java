package array;

public class FindLoop {

    public static int index(int[] date, int el) {
        int result = -1;
        for (int i = 0; i < date.length; i++) {
            if (date[i] == el) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static int index(int[] date, int el, int start, int finish) {
        int result = -1;
        for (int i = start; i <= finish; i++) {
            if (date[i] == el) {
                result = i;
                break;
            }
        }
        return result;
    }
}
