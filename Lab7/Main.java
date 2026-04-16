import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("===== Завдання 1. Таксі =====");

        ArrayList<Car> cars = TaxiService.createCars();

        TaxiService.printCars(cars);

        TaxiService.repairHalfCars(cars);

        TaxiService.upgradeEverySecondCar(cars);

        TaxiService.checkDrivers(cars);

        System.out.println("\nПісля змін:\n");
        TaxiService.printCars(cars);

        System.out.println("\nВиклик таксі:");
        Helper.callRandomCar(cars);

        System.out.println("\n===== Завдання 2. Телефонна книга =====");
        PhoneBook.run();
    }
}