package oop.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Я великий Оракул. Что ты хочешь узнать?");
        System.out.println("Задай вопрос и я отвечу на него Да, Нет или Наверное.");
        String name = input.nextLine();
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.println(name + " " + "Да!");
        } else if (answer == 1) {
            System.out.println(name + " " + "Нет!");
        } else {
            System.out.println(name + " " + "Может быть!");
        }
    }
}
