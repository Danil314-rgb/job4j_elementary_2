package oop.dd;

public class Dentist extends Doctor {

    private int clients;

    public Dentist(String name, String surname, String education, String birthday, double experience, int clients) {
        super(name, surname, education, birthday, experience);
        this.clients = clients;
    }

    public int getClients(int clients) {
        return clients;
    }

}
