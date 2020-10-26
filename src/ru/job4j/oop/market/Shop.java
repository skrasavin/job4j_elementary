package ru.job4j.oop.market;

public class Shop {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);

        //Product product = (Product) of("Oil", 100);
        //System.out.println(product.label());

        for (Product prod : products) {
            if (prod != null) {
                System.out.println(prod.getName());
            }
        }

        int a = indexOfNull(products);
        System.out.println(a);
    }

    public static int indexOfNull(Product[] products) {
        int rst = -1;
        for (int x = 0; x < products.length; x++) {
            Product prod = products[x];
            if (prod == null) {
                return x;
            }
        }
        return rst;
    }

    public static Object of(String name, int price) {
        if ("Oil".equals(name)) {
            return new LiquidationProduct(name, price);
        }
        return new Product(name, price);
    }
}