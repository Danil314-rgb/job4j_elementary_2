package ru.job4j;

public class SqArea {

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println("result1 = " + result1);
        double result2 = SqArea.square(5, 4);
        System.out.println("result1 = " + result2);
        double result3 = SqArea.square(7, 2);
        System.out.println("result1 = " + result3);
    }

    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;
    }
}
