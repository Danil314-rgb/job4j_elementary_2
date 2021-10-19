package oop.dd;

public class Surgeon extends  Doctor {

    private int numberOperations;

    public int getNumberOperations(int numberOperations) {
        return numberOperations;
    }

    public Surgeon(int numberOperations) {
        this.numberOperations = numberOperations;
    }
}
