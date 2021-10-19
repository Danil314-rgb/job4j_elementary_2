package oop.dd;

public class Profession {

    private String name;
    private String surname;
    private String education;
    private String birthday;

    public String getName(String name) {
        return name;
    }

    public String getSurname(String surname) {
        return surname;
    }

    public String getEducation(String education) {
        return education;
    }

    public String getBirthday(String birthday) {
        return birthday;
    }

    public Profession(String name, String surname, String education, String birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    public Profession() {

    }
}
