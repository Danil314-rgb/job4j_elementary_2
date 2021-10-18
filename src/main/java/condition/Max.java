package condition;

public class Max {

    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        int result = third;
        if (first >= second && first >= third) {
            result = first;
        }
        if (second >= first && second >= third) {
            result = second;
        }
        return result;
    }

    public static int max(int first, int second, int third, int four) {
        int result = four;
        if (first >= second && first >= third && first >= four) {
            result = first;
        }
        if (second >= first && second >= third && second >= four) {
            result = second;
        }
        if (third >= first && third >= second && third >= four) {
            result = third;
        }
        return result;
    }
}
