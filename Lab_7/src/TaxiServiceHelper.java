import java.util.Random;

public class TaxiServiceHelper {
    private static final Random RANDOM = new Random();

    public static TaxiCar getRandomCar(TaxiCar[] cars) {
        if (cars == null || cars.length == 0) {
            throw new IllegalArgumentException("Масив автомобілів порожній!");
        }

        int randomIndex = RANDOM.nextInt(cars.length);
        return cars[randomIndex];
    }

    public static void printCarIsComing(TaxiCar car) {
        System.out.println("Автомобіль марки " + car.getBrand()
                + " з водієм " + car.getDriver().getName()
                + " виїхав за вами");
    }

    public static void printDriverArrived(TaxiCar car) {
        System.out.println("Водій " + car.getDriver().getName() + " прибув на місце");
    }

    public static void callRandomTaxi(TaxiCar[] cars) {
        TaxiCar selectedCar = getRandomCar(cars);
        printCarIsComing(selectedCar);
        printDriverArrived(selectedCar);
    }
}
