package oop.animal;

public class Dog implements  Animal {

    @Override
    public  void sound() {
        System.out.println(getClass().getSimpleName() + " произносит звук: Гав-гав.");
    }
}
