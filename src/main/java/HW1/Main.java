package HW1;

public class Main {

    public static Category[] createCategoryArray() {
        Category[] categories = new Category[3];

        categories[0] = new Category("Овощи");
        categories[0].addProduct(new Product("Морковь", 15, 3.2));
        categories[0].addProduct(new Product("Свекла", 14, 2.8));
        categories[0].addProduct(new Product("Капуста", 22, 4.6));

        categories[1] = new Category("Мясо");
        categories[1].addProduct(new Product("Курятина", 220, 4.8));
        categories[1].addProduct(new Product("Говядина", 350, 3.9));
        categories[1].addProduct(new Product("Свинина", 330, 4.4));

        categories[2] = new Category("Напитки");
        categories[2].addProduct(new Product("Вода", 20, 4.8));
        categories[2].addProduct(new Product("Сок", 60, 3.3));
        categories[2].addProduct(new Product("Лимонад", 45, 3.2));

        return categories;
    }

    public static void main(String[] args) {
        // write your code here
        Category[] categories = createCategoryArray();

        System.out.println("Каталог магазина:");

        for (Category category: categories
        ) {
            category.printCategory();
        }

        Basket basket1 = new Basket();
        basket1.addProduct(categories[0].getProducts().get(1));
        categories[0].getProducts().remove(1);
        basket1.addProduct(categories[1].getProducts().get(2));
        categories[1].getProducts().remove(2);
        basket1.addProduct(categories[2].getProducts().get(0));
        categories[2].getProducts().remove(0);

        User user1 = new User("asdfg", "12345", basket1);

        Basket basket2 = new Basket();
        basket2.addProduct(categories[0].getProducts().get(1));
        categories[0].getProducts().remove(1);
        basket2.addProduct(categories[1].getProducts().get(0));
        categories[1].getProducts().remove(0);
        basket2.addProduct(categories[2].getProducts().get(1));
        categories[2].getProducts().remove(1);

        User user2 = new User("log", "pass", basket2);

        System.out.println("\nПокупатель 1");
        user1.printUser();
        System.out.println("\nПокупатель 2");
        user2.printUser();

        System.out.println("Каталог магазина:");

        for (Category category: categories
        ) {
            category.printCategory();
        }

    }
}