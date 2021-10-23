package ex;

public class Fact {

    public static int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n should be larger or equal to zero");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(new Fact().calc(0));
    }
}
