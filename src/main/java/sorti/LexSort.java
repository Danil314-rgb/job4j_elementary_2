package sorti;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] leftStr = left.split("\\.");
        String[] rightStr = right.split("\\.");
        int a = Integer.parseInt(leftStr[0]);
        int b = Integer.parseInt(rightStr[0]);
        return Integer.compare(a, b);
    }
}
