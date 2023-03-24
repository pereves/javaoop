package HW1;

class User { // класс юзер
    private String login;
    private String password;
    private Basket basket;

    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

    public Basket getBasket() {
        return basket;
    }

    public void printUser() {
        System.out.println("Login: " + login + "\nPassword: " + password);
        basket.printBasket();
    }
}