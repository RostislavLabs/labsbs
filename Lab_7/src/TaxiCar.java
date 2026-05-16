public class TaxiCar {
    private String brand;
    private double enginePower;
    private Driver driver;
    private double price;
    private int productionYear;

    public TaxiCar(String brand, double enginePower, Driver driver, double price, int productionYear) {
        this.brand = brand;
        this.enginePower = enginePower;
        this.driver = driver;
        this.price = price;
        this.productionYear = productionYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void increaseEnginePower(double percent) {
        enginePower += enginePower * percent / 100.0;
    }

    public void increasePrice(double percent) {
        price += price * percent / 100.0;
    }

    public void repairEngineAndChangeDriver(Driver newDriver) {
        increaseEnginePower(10);
        setDriver(newDriver);
    }

    public void printInfo() {
        System.out.printf("Марка: %s | Потужність: %.2f к.с. | Ціна: %.2f грн | Рік: %d | %s%n",
                brand, enginePower, price, productionYear, driver);
    }
}
