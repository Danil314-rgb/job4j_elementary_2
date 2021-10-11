package condition;

public class TreeMax {
    public static void main(String[] args) {
        System.out.println(max(1, 13, 78));
    }

    public static int max(int first, int second, int third) {
        int result = third;
        if (first > second && first > third) {
            result = first;
        }
        if (second > first && second > third) {
            result = second;
        }
        return result;
    }

}
