package oop.vehicle;

public class Train implements Vehicle {

    @Override
    public void move() {
        System.out.println("Поезд едет по рельсам");
    }
}
