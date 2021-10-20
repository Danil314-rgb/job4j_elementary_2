package oop.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            while (matches > 3 || matches < 0) {
                System.out.println("Ты взял количество спичек не по правилам!");
                System.out.println("Возьми от 1 до 3 спичек!");
                matches = Integer.parseInt(input.nextLine());
            }
            turn = !turn;
            count = count - matches;
            System.out.println("Осталась спичек: " + count);
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
