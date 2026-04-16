import java.util.ArrayList;
import java.util.Random;

public class Helper {

    public static void callRandomCar(ArrayList<Car> cars) {
        Random random = new Random();

        int index = random.nextInt(cars.size());

        Car car = cars.get(index);

        System.out.println("Автомобіль марки "
                + car.brand +
                " з водієм "
                + car.driver.name +
                " виїхав за вами");

        driverArrived(car);
    }

    public static void driverArrived(Car car) {
        System.out.println("Водій "
                + car.driver.name +
                " прибув на місце");
    }
}