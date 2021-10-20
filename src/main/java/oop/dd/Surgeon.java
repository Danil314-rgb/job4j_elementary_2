package oop.dd;

public class Surgeon extends  Doctor {

    private int numberOperations;

    public Surgeon(String name, String surname, String education, String birthday, double experience, int numberOperations) {
        super(name, surname, education, birthday, experience);
        this.numberOperations = numberOperations;
    }

    public int getNumberOperations(int numberOperations) {
        return numberOperations;
    }

}
