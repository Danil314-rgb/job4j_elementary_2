package oop.dd;

public class Builder extends Engineer {

    private double salary;

    public double getSalary(double salary) {
        return salary;
    }

    public Builder(double salary) {
        this.salary = salary;
    }
}
