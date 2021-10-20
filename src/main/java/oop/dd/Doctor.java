package oop.dd;

public class Doctor extends Profession {

    private double experience;

    public Doctor(String name, String surname, String education, String birthday, double experience) {
        super(name, surname, education, birthday);
        this.experience = experience;

    }
}
