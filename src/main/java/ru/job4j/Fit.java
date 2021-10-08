package ru.job4j;

public class Fit {

    public static void main(String[] args) {
        short man = 178;
        short woman = 156;
        double heightMan = Fit.manWeight(man);
        System.out.println(heightMan);
        double heightWoman = Fit.womanWeight(woman);
        System.out.println(heightWoman);
    }

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }
}
