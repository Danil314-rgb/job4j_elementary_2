package oop.dd;

public class Engineer extends Profession {

    private int finishedProject;

    public Engineer(String name, String surname, String education, String birthday, int finishedProject) {
        super(name, surname, education, birthday);
        this.finishedProject = finishedProject;
    }

    public int getProject(int finishedProject) {
        return finishedProject;
    }

}
