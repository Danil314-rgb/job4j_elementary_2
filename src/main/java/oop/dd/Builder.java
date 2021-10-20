package oop.dd;

public class Builder extends Engineer {

    private double salary;

    public Builder(String name, String surname, String education, String birthday, int finishedProject, double salary) {
        super(name, surname, education, birthday, finishedProject);
        this.salary = salary;
    }

    public double getSalary(double salary) {
        return salary;
    }

}
