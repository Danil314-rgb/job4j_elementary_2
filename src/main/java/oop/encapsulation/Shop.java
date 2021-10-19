package oop.encapsulation;

public class Shop {

    public static void main(String[] args) {
        Product[] product = new Product[5];
        product[0] = new Product("Milk", 2);
        product[1] = new Product("Bread", 3);
        product[2] = new Product("Egg", 12);

        for (int i = 0; i < product.length; i++) {
            Product prod = product[i];
            if (prod != null) {
                System.out.println(prod.getName());
            }
        }
        System.out.println(indexOfNull(product));
    }

    public static int indexOfNull(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            Product prod = products[i];
            if (prod == null) {
                return i;
            }
        }
        return -1;
    }
}
