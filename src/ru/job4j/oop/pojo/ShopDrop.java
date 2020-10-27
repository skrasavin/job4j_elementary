package ru.job4j.oop.pojo;
import ru.job4j.oop.market.Product;

public class ShopDrop {

    public static Product[] leftShift(Product[] products, int index) {
        if (index + 1 == products.length) {
            products[index] = null;
        } else {
            products[index] = products[index + 1];
            products[index + 1] = null;
        }
        return products;
    }

    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        for (Product product : products) {
            System.out.println(product.getName());
        }
        System.out.println();
        products[1] = products[2];
        products[2] = null;
        for (Product product : products) {
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

    }
}