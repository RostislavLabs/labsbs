import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();

        Driver d1 = new Driver("Іван", 30, 6);
        Driver d2 = new Driver("Петро", 28, 4);
        Driver d3 = new Driver("Олег", 40, 10);
        Driver d4 = new Driver("Максим", 26, 3);
        Driver d5 = new Driver("Андрій", 35, 7);

        cars.add(new Car("BMW", 200, d1, 20000, 2018));
        cars.add(new Car("Audi", 180, d2, 18000, 2017));
        cars.add(new Car("Mercedes", 220, d3, 25000, 2019));
        cars.add(new Car("Toyota", 150, d4, 15000, 2016));
        cars.add(new Car("Honda", 160, d5, 16000, 2015));

        // ремонт двигуна половині машин
        for (int i = 0; i < cars.size() / 2; i++) {
            cars.get(i).power *= 1.1;
        }

        // кожній другій машині
        for (int i = 0; i < cars.size(); i += 2) {
            cars.get(i).power *= 1.1;
            cars.get(i).price *= 1.05;
        }

        // перевірка водіїв
        for (Car car : cars) {
            if (car.driver.experience < 5 && car.driver.age > 25) {
                car.driver.experience++;
            }
        }

        Helper.callTaxi(cars);

        // ---------- Завдання 2 ----------

        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Іван", "111111");
        phoneBook.put("Петро", "222222");
        phoneBook.put("Олег", "333333");
        phoneBook.put("Андрій", "444444");
        phoneBook.put("Максим", "555555");
        phoneBook.put("Ігор", "666666");
        phoneBook.put("Тарас", "777777");
        phoneBook.put("Юрій", "888888");
        phoneBook.put("Богдан", "999999");
        phoneBook.put("Роман", "101010");

        System.out.println("\nТелефонна книга:");

        for (String name : phoneBook.keySet()) {
            System.out.println(name + " : " + phoneBook.get(name));
        }

        String search = "Іван";

        if (phoneBook.containsKey(search)) {
            System.out.println("\nНомер " + search + " : " + phoneBook.get(search));
        } else {
            System.out.println("У книзі відсутній такий абонент");
        }

        phoneBook.remove("Роман");

        System.out.println("Кількість контактів: " + phoneBook.size());
    }

}