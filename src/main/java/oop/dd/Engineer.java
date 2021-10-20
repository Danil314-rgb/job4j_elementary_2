package oop.dd;

public class Engineer extends Profession {

    private int finishedProject;

    public Engineer(int finishedProject) {
        super();
        this.finishedProject = finishedProject;
    }

    public Engineer() {

    }

    public int getProject(int finishedProject) {
        return finishedProject;
    }

}
