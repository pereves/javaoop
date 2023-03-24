package HW1;
import java.util.ArrayList;
class Category { // класс Категория
    private String name;
    private ArrayList<Product> products;

    public Category(String name) {
        this.name = name;
        this.products = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void printCategory() {
        System.out.println("Название категории: " + name);
        for (Product product: products
        ) {
            product.printProduct();
        }
        System.out.println();
    }
}
