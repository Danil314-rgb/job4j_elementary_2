package condition;

public class Max {

    public static void main(String[] args) {
        System.out.println(max(10, 12));
        System.out.println(max(12, 10));
        System.out.println(max(12, 12));
    }

    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }
}
