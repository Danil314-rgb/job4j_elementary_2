package sorti;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class ThreeSort {

    public static void main(String[] args) {
        Set<Integer> number = new TreeSet<>(Collections.reverseOrder());
        number.add(5);
        number.add(1);
        number.add(3);
        System.out.println(number);
    }
}
