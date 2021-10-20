package oop.poly;

public class Service {

    private Store store;

    public Service(Store store) {
        this.store = store;
    }

    public void extract() {
        store.save("Danil");
    }

    public static void main(String[] args) {
        Store store = new DbStore();
        Service service = new Service(store);
        service.extract();
    }

}
