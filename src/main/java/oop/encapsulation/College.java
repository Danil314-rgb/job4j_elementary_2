package oop.encapsulation;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Danil");
        student.setSurname("Dorov");
        student.setPatronymic("Andreevich");
        student.setGroup("4B");
        student.setFirstDay(new Date());
        System.out.println("ФИО: " + student.getName() + " " + student.getSurname() + " " + student.getPatronymic()
                + " учусь в группе " + student.getGroup());
    }
}
