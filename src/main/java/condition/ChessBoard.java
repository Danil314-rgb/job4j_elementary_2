package condition;

public class ChessBoard {

    public static void main(String[] args) {
        System.out.println(way(1, 7, 3, 5));
        System.out.println(way(1, 8, 3, 5));
    }

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if ((x1 & x2 & y1 & y2) >= 0 && (x1 & x2 & y1 & y2) <= 7) {
            if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
                rsl = Math.abs(x1 - x2);
            }
        }
        return rsl;
    }
}
