package three;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String left, String right) {

        int result = -1;
        if (left.length() == right.length()) {
            for (int i = 0; i < left.length(); i++) {
                int res = Character.compare(left.charAt(i), right.charAt(i));
                if (res == 0) {
                    result = 0;
                }
            }
        }
        return result;
    }
}
