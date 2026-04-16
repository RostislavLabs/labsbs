public class Product {
    String name;
    double price;
    int warranty;

    public Product(String name, double price, int warranty) {
        this.name = name;
        this.price = price;
        this.warranty = warranty;
    }

    public void showInfo() {
        System.out.println("Товар: " + name);
        System.out.println("Ціна: " + price);
        System.out.println("Гарантія: " + warranty + " міс.");
    }

    public void discount() {
        price = price / 2;
        System.out.println("Ціна після знижки 50%: " + price);
    }
}