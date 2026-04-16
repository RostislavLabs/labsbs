public class Truck extends Car {

    public Truck(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void brake() {
        System.out.println(model + ": Грузовик гальмує.");
    }
}