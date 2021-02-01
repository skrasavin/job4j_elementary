package job4j.oop.pojo;
import job4j.oop.market.Product;

public class ShopDrop {

    public static Product[] leftShift(Product[] products, int index) {
        for (int i = 0; i < products.length; i++) {
            if (i >= index && i < products.length - 1) {
                products[i] = products[i + 1];
            }
        }
        products[products.length - 1] = null;
        return products;
    }

    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);

        for (Product prod : ShopDrop.leftShift(products, 0)) {
            System.out.println(prod.getName());
        }

    }
}