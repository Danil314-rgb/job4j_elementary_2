package oop;

public class Battery {

    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery battery1 = new Battery(35);
        Battery battery2 = new Battery(65);
        System.out.println("Батарея 1: " + battery1.load + " Батарея 2: " + battery2.load);
        battery1.exchange(battery2);
        System.out.println("Батарея 1: " + battery1.load + " Батарея 2: " + battery2.load);
    }
}
