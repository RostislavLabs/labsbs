public abstract class Car {
    protected String model;
    protected String color;
    protected int maxSpeed;

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void gas() {
        System.out.println(model + ": Газуємо!");
    }

    public abstract void brake();

    public void printInfo() {
        System.out.println("Модель: " + model + ", колір: " + color + ", максимальна швидкість: " + maxSpeed + " км/год");
    }
}
