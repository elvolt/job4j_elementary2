package ru.job4j.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShopDropTest {

    @Test
    public void whenDropFirst() {
        Product[] products = new Product[2];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        Product[] rsl = ShopDrop.leftShift(products, 0);
        assertEquals("Bread", rsl[0].getName());
        assertNull(rsl[1]);
    }

    @Test
    public void whenDropLast() {
        Product[] products = new Product[2];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        Product[] rsl = ShopDrop.leftShift(products, 1);
        assertEquals("Milk", rsl[0].getName());
        assertNull(rsl[1]);
    }
}