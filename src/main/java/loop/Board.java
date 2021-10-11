package loop;

public class Board {

    public static void main(String[] args) {
        paint(5, 4);
        System.out.println();
    }

    public static void paint(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int g = 0; g < width; g++) {
                if ((i + g) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
