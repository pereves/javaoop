package HW1;
import java.util.ArrayList;
class Basket { // класс корзина
    private ArrayList<Product> products;

    public Basket() {
        products = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void printBasket() {
        for (Product product: products
        ) {
            product.printProduct();
        }
        System.out.println();
    }

}