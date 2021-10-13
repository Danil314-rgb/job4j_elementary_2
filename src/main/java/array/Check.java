package array;

public class Check {

    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean zero = data[0];
        for (int i = 1; i < data.length; i++) {
            if (zero != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
