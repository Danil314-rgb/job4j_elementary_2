package dep;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                if (start.equals("")) {
                    tmp.add(el);
                    start = start + el;
                } else {
                    tmp.add(start +  "/" + el);
                    start = start + "/" + el;
                }
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
       orgs.sort(new DepDescComp());
    }

    public static void sortDesc(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
    }
}
