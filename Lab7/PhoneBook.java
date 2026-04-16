import java.util.HashMap;

public class PhoneBook {

    public static void run() {

        HashMap<String, String> book =
                new HashMap<>();

        book.put("Іваненко", "0971111111");
        book.put("Петренко", "0972222222");
        book.put("Сидоренко", "0973333333");
        book.put("Коваленко", "0974444444");
        book.put("Шевченко", "0975555555");
        book.put("Мельник", "0976666666");
        book.put("Бойко", "0977777777");
        book.put("Ткаченко", "0978888888");
        book.put("Олійник", "0979999999");
        book.put("Кравченко", "0970000000");

        System.out.println("Телефонна книга:");

        for (String key : book.keySet()) {
            System.out.println(key +
                    " : " + book.get(key));
        }

        String surname = "Шевченко";

        if (book.containsKey(surname)) {
            System.out.println("\nНомер "
                    + surname + ": "
                    + book.get(surname));
        } else {
            System.out.println(
              "У книзі відсутній такий абонент");
        }

        book.remove("Бойко");

        System.out.println(
          "\nКількість записів: "
          + book.size());

        System.out.println(
          "Є ключ Петренко? "
          + book.containsKey("Петренко"));

        System.out.println(
          "Є номер 0979999999? "
          + book.containsValue("0979999999"));
    }
}