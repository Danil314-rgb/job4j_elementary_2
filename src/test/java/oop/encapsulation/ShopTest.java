package oop.encapsulation;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    @Test
    public void indexOfNull() {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 2);
        products[1] = new Product("Bread", 3);
        products[2] = new Product("Egg", 12);
        int result = Shop.indexOfNull(products);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void indexOfNull1() {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 2);
        products[1] = new Product("Bread", 3);
        products[2] = new Product("Egg", 12);
        products[3] = new Product("Sprite", 1);
        products[4] = new Product("Water", 3);
        int result = Shop.indexOfNull(products);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFirstNull() {
        Product[] products = new Product[5];
        products[1] = new Product("Milk", 10);
        int result = Shop.indexOfNull(products);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }
}