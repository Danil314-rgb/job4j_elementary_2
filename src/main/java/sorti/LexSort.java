package sorti;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] leftStr = left.split("\\.");
        String[] rightStr = right.split("\\.");

        for (int i = 0; i < 1; i++) {
            int a = Integer.parseInt(leftStr[i]);
            int b = Integer.parseInt(rightStr[i]);
            if (Integer.compare(a, b) != 0) {
                return Integer.compare(a, b);
            }
        }

        return left.compareTo(right);
    }
}
