import java.util.ArrayList;

public class TaxiService {

    public static ArrayList<Car> createCars() {
        ArrayList<Car> list = new ArrayList<>();

        list.add(new Car("BMW", 180,
                new Driver("Іван", 28, 4), 8000, 2015));

        list.add(new Car("Audi", 170,
                new Driver("Петро", 32, 8), 8500, 2016));

        list.add(new Car("Toyota", 160,
                new Driver("Олег", 27, 3), 7800, 2014));

        list.add(new Car("Mercedes", 220,
                new Driver("Сергій", 35, 10), 12000, 2018));

        list.add(new Car("Ford", 150,
                new Driver("Микола", 29, 2), 7000, 2013));

        list.add(new Car("Skoda", 140,
                new Driver("Андрій", 26, 4), 6900, 2012));

        list.add(new Car("Honda", 155,
                new Driver("Василь", 31, 6), 7600, 2015));

        list.add(new Car("Mazda", 165,
                new Driver("Тарас", 30, 4), 7900, 2016));

        list.add(new Car("Nissan", 158,
                new Driver("Юрій", 33, 7), 7700, 2014));

        list.add(new Car("Kia", 145,
                new Driver("Роман", 27, 3), 7300, 2015));

        return list;
    }

    public static void repairHalfCars(ArrayList<Car> cars) {
        for (int i = 0; i < cars.size() / 2; i++) {
            cars.get(i).repairEngine();
            cars.get(i).driver =
                    new Driver("НовийВодій" + i, 30, 5);
        }
    }

    public static void upgradeEverySecondCar(ArrayList<Car> cars) {
        for (int i = 0; i < cars.size(); i += 2) {
            cars.get(i).upgrade();
        }
    }

    public static void checkDrivers(ArrayList<Car> cars) {
        for (Car car : cars) {
            if (car.driver.experience < 5 &&
                car.driver.age > 25) {
                car.driver.improveSkill();
            }
        }
    }

    public static void printCars(ArrayList<Car> cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}