package loop;

public class Counter {

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(1, 3));
        System.out.println(sum(-1, 3));
    }

    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; start <= finish; start++) {
            sum += start;
        }
        return sum;
    }
}
