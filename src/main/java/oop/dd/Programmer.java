package oop.dd;

public class Programmer extends Engineer {

    private String position;

    public Programmer(String name, String surname, String education, String birthday, int finishedProject, String position) {
        super(name, surname, education, birthday, finishedProject);
        this.position = position;
    }

    public String getPosition(String position) {
        return position;
    }
}
