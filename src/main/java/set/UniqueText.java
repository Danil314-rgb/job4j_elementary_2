package set;

import java.util.HashSet;

public class UniqueText {

    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        HashSet<String> check = new HashSet<>();
        String[] origin = originText.split(" ");
        for (String item : origin) {
            check.add(item);
        }
        String[] text = duplicateText.split(" ");
        for (String item : text) {
            if (!check.contains(item)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
