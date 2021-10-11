package condition;

public class Triangle {

    public static void main(String[] args) {

    }

    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }
}
