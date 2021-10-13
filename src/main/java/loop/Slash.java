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
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = (row + cell) == row * 2;
                boolean right = row + cell == size - 1;
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
