package dep;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int res = 0;
        String[] oo1 = o1.split("/");
        String[] oo2 = o2.split("/");
        for (int i = 0; i < Math.min(oo1.length, oo2.length); i++) {
            res = oo2[i].compareTo(oo1[i]);
            if (res == 0) {
                res = oo1[i].compareTo(oo2[i]);
            }
        }
        if (res == 0 && oo1.length != oo2.length) {
            res = Integer.compare(oo1.length, oo2.length);
        }
        return res;
    }
}
