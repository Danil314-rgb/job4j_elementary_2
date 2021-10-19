package oop.encapsulation;

import javax.sound.sampled.Port;

public class ShopDrop {

    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 2);
        products[1] = new Product("Bread", 3);
        products[2] = new Product("Egg", 22);
        products[3] = new Product("Fish", 3);
        products[4] = new Product("Sprite", 22);

        delete(products, 0);
        for (Product item : products) {
            if (item != null) {
                System.out.println(item.getName());
            } else {
                System.out.println("null");
            }
        }
    }

    public static Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }
}
