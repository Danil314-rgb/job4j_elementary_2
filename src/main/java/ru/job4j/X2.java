package ru.job4j;

public class X2 {

    public static void main(String[] args) {
        System.out.println(calc(10, 0, 0, 2));
        System.out.println(calc(1, 1, 1, 1));
        System.out.println(calc(0, 1, 1, 1));
        System.out.println(calc(1, 1, 0, 1));
        System.out.println(calc(1, 1, 1, 0));
    }

    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }
}
