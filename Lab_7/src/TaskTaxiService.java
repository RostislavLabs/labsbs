import java.util.ArrayList;

public class TaskTaxiService {
    public static void run() {
        System.out.println("\n--- Завдання 1. Сервіс таксі ---");

        ArrayList<TaxiCar> cars = createTaxiCars();

        System.out.println("\nПочатковий автопарк:");
        printCars(cars);

        repairHalfOfCarPark(cars);
        upgradeEverySecondCar(cars);
        checkDriverExperience(cars);

        System.out.println("\nАвтопарк після змін:");
        printCars(cars);

        TaxiCar[] carArray = cars.toArray(new TaxiCar[0]);
        int orderCount = InputHelper.readPositiveInt("\nСкільки разів викликати випадкове таксі? ");

        for (int i = 1; i <= orderCount; i++) {
            System.out.println("\nЗамовлення №" + i + ":");
            TaxiServiceHelper.callRandomTaxi(carArray);
        }
    }

    private static ArrayList<TaxiCar> createTaxiCars() {
        ArrayList<TaxiCar> cars = new ArrayList<>();

        cars.add(new TaxiCar("Toyota Prius", 99, new Driver("Андрій", 27, 3), 430000, 2015));
        cars.add(new TaxiCar("Skoda Octavia", 150, new Driver("Богдан", 34, 8), 620000, 2018));
        cars.add(new TaxiCar("Hyundai Sonata", 180, new Driver("Віктор", 29, 4), 710000, 2019));
        cars.add(new TaxiCar("Volkswagen Passat", 170, new Driver("Дмитро", 41, 15), 780000, 2017));
        cars.add(new TaxiCar("Renault Logan", 90, new Driver("Євген", 26, 2), 350000, 2016));
        cars.add(new TaxiCar("Ford Focus", 125, new Driver("Ігор", 30, 5), 480000, 2014));
        cars.add(new TaxiCar("Nissan Leaf", 110, new Driver("Максим", 24, 3), 590000, 2020));
        cars.add(new TaxiCar("Kia Rio", 123, new Driver("Олег", 38, 11), 460000, 2018));
        cars.add(new TaxiCar("Chevrolet Aveo", 101, new Driver("Петро", 28, 4), 310000, 2013));
        cars.add(new TaxiCar("Mazda 6", 192, new Driver("Роман", 35, 10), 820000, 2019));
        cars.add(new TaxiCar("Honda Civic", 158, new Driver("Сергій", 31, 6), 690000, 2018));
        cars.add(new TaxiCar("Opel Astra", 140, new Driver("Тарас", 26, 1), 420000, 2016));

        return cars;
    }

    private static ArrayList<Driver> createNewDrivers() {
        ArrayList<Driver> drivers = new ArrayList<>();

        drivers.add(new Driver("Новий водій 1", 32, 7));
        drivers.add(new Driver("Новий водій 2", 28, 4));
        drivers.add(new Driver("Новий водій 3", 45, 20));
        drivers.add(new Driver("Новий водій 4", 29, 3));
        drivers.add(new Driver("Новий водій 5", 36, 9));
        drivers.add(new Driver("Новий водій 6", 27, 2));

        return drivers;
    }

    private static void repairHalfOfCarPark(ArrayList<TaxiCar> cars) {
        ArrayList<Driver> newDrivers = createNewDrivers();
        int half = cars.size() / 2;

        System.out.println("\nРемонт мотору половині автопарку і заміна водіїв:");
        for (int i = 0; i < half; i++) {
            TaxiCar car = cars.get(i);
            Driver newDriver = newDrivers.get(i);
            car.repairEngineAndChangeDriver(newDriver);
            System.out.println("Відремонтовано: " + car.getBrand()
                    + ", новий водій: " + newDriver.getName());
        }
    }

    private static void upgradeEverySecondCar(ArrayList<TaxiCar> cars) {
        System.out.println("\nПідвищення потужності і ціни кожної другої машини:");

        for (int i = 1; i < cars.size(); i += 2) {
            TaxiCar car = cars.get(i);
            car.increaseEnginePower(10);
            car.increasePrice(5);
            System.out.println("Оновлено: " + car.getBrand());
        }
    }

    private static void checkDriverExperience(ArrayList<TaxiCar> cars) {
        System.out.println("\nПеревірка досвіду всіх водіїв:");

        for (TaxiCar car : cars) {
            Driver driver = car.getDriver();

            if (driver.getDrivingExperience() < 5 && driver.getAge() > 25) {
                driver.increaseDrivingExperience(1);
                System.out.println(driver.getName()
                        + " направлений на курси. Новий стаж: "
                        + driver.getDrivingExperience() + " років");
            }
        }
    }

    private static void printCars(ArrayList<TaxiCar> cars) {
        for (int i = 0; i < cars.size(); i++) {
            System.out.print((i + 1) + ". ");
            cars.get(i).printInfo();
        }
    }
}
