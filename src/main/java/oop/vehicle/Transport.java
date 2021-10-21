package oop.vehicle;

public class Transport {

    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle airplane = new Airplane();
        Vehicle bus1 = new Bus();
        Vehicle train1 = new Train();
        Vehicle airplane1 = new Airplane();
        Vehicle[] vehicles = new Vehicle[]{bus, train, airplane, bus1, train1, airplane1};
        for (Vehicle trs : vehicles) {
            trs.move();
        }
    }
}
