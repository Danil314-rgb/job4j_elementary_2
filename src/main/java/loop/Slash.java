package loop;

public class Slash {

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
        System.out.println("Draw by 7");
        draw(7);
    }

    public static void draw(int size) {
        int a = 0;
        int b = size - 1;
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = (row + cell) == a;
                boolean right = row + cell == b;
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
                a += 2;
            }
            System.out.println();
            a = 0;
        }
        System.out.println();
    }
}
