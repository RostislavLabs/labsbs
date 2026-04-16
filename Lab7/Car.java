public class Car {
    String brand;
    double power;
    Driver driver;
    double price;
    int year;

    public Car(String brand, double power,
               Driver driver, double price, int year) {
        this.brand = brand;
        this.power = power;
        this.driver = driver;
        this.price = price;
        this.year = year;
    }

    public void repairEngine() {
        power *= 1.10;
    }

    public void upgrade() {
        power *= 1.10;
        price *= 1.05;
    }

    @Override
    public String toString() {
        return brand +
               " | Потужність: " + power +
               " | Водій: " + driver.name +
               " | Ціна: " + price +
               " | Рік: " + year;
    }
}