package oop.dd;

public class Dentist extends Doctor {

    private int clients;

    public int getClients(int clients) {
        return clients;
    }

    public Dentist(int clients) {
        this.clients = clients;
    }
}
