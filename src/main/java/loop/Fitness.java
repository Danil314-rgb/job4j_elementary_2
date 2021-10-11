package loop;

public class Fitness {

    public static void main(String[] args) {
        System.out.println(calc(40, 60));
        System.out.println(calc(20, 60));
    }

    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan <= nik) {
            ivan *= 3;
            nik *= 2;
            month++;
        }
        return month;
    }
}
