package HW1;

class Product { // класс Товар
    private String name;
    private int price;
    private double rating;

    public Product(String name, int price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public void printProduct() {
        System.out.println("Название товара: " + name + ". Цена товара: " + price +
                ". Рейтинг товара: " + rating + ".");
    }
}
