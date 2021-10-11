package condition;

public class LogicNot {

    public static void main(String[] args) {
    }

    public static boolean isEven(int num) { // число чётное
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) { // число положительное
        return num > 0;
    }

    public static boolean notEven(int num) { // число не чётное
        return !isEven(num);
    }

    public static boolean notPositive(int num) { // число не положительное
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) { // число нечетное и положительное;
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) { // число четное или не положительное.
        return isEven(num) || notPositive(num);
    }
}
