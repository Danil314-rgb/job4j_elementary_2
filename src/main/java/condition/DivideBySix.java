package condition;

public class DivideBySix {

    public static void main(String[] args) {
        System.out.println(checkNumber(6));
        System.out.println(checkNumber(9));
        System.out.println(checkNumber(8));
        System.out.println(checkNumber(7));
    }

    public static String checkNumber(int number) {
        String result;
        if (number % 3 == 0) {
            if (number % 2 == 0) {
                result = "Исходное число делится на 6.";
                return result;
            } else {
                result = "Исходное число делится на 3, но не является четным.";
                return result;
            }
        } else {
            if (number % 2 == 0) {
                result = "Исходное число не делится на 3, но является четным.";
                return result;
            } else {
                result = "Исходное число не делится на 3 и не является четным.";
                return result;
            }
        }
    }
}
