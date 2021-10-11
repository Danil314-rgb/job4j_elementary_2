package loop;

public class Slash {

    public static void main(String[] args) {
        draw(3);
        System.out.println();
        draw(5);
        System.out.println();
        draw(7);
    }

    public static void draw(int size) {
        int leftRight = 0;
        int rightLeft = size - 1;
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = (row + cell) == leftRight;
                boolean right = row + cell == rightLeft;
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
                leftRight += 2;
            }
            System.out.println();
            leftRight = 0;
        }
        System.out.println();
    }
}
