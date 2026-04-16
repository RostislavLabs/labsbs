public class SmartProduct extends Product {
    String brand;
    boolean wireless;

    public SmartProduct(String name, double price, int warranty,
                        String brand, boolean wireless) {
        super(name, price, warranty);
        this.brand = brand;
        this.wireless = wireless;
    }

    @Override
    public void showInfo() {
        System.out.println("Розширений товар:");
        System.out.println("Назва: " + name);
        System.out.println("Бренд: " + brand);
        System.out.println("Ціна: " + price);
        System.out.println("Гарантія: " + warranty + " міс.");
        System.out.println("Бездротовий: " + wireless);
    }
}