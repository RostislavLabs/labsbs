public class TaskPhoneBook {
    public static void run() {
        System.out.println("\n--- Завдання 2. Телефонна книга ---");

        PhoneBook phoneBook = createPhoneBook();

        System.out.println("\nПочаткова телефонна книга:");
        phoneBook.printAll();

        System.out.println("\nКількість записів у книзі: " + phoneBook.size());

        String surnameForSearch = InputHelper.readLine("\nВведіть прізвище для пошуку номера: ");
        if (phoneBook.containsKey(surnameForSearch)) {
            System.out.println("Номер абонента " + surnameForSearch + ": " + phoneBook.get(surnameForSearch));
        } else {
            System.out.println("У книзі відсутній такий абонент");
        }

        String surnameForCheck = InputHelper.readLine("\nВведіть прізвище для перевірки containsKey: ");
        System.out.println("containsKey(" + surnameForCheck + ") = " + phoneBook.containsKey(surnameForCheck));

        String numberForCheck = InputHelper.readLine("Введіть номер для перевірки containsValue: ");
        System.out.println("containsValue(" + numberForCheck + ") = " + phoneBook.containsValue(numberForCheck));

        System.out.println("\nДодамо новий запис через put(): Мельник - 0981112233");
        phoneBook.put("Мельник", "0981112233");
        System.out.println("Кількість записів після додавання: " + phoneBook.size());

        String surnameForRemove = InputHelper.readLine("\nВведіть прізвище, яке потрібно видалити: ");
        if (phoneBook.containsKey(surnameForRemove)) {
            phoneBook.remove(surnameForRemove);
            System.out.println("Запис " + surnameForRemove + " видалено.");
        } else {
            System.out.println("Такого запису немає, видалення не виконано.");
        }

        System.out.println("\nТелефонна книга після видалення:");
        phoneBook.printAll();
        System.out.println("\nКількість записів у книзі: " + phoneBook.size());
    }

    private static PhoneBook createPhoneBook() {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.put("Шевченко", "0671234567");
        phoneBook.put("Шевченко", "0688888888");
        phoneBook.put("Коваленко", "0509876543");
        phoneBook.put("Бондаренко", "0634567890");
        phoneBook.put("Ткаченко", "0962223344");
        phoneBook.put("Кравченко", "0995556677");
        phoneBook.put("Олійник", "0683332211");
        phoneBook.put("Мороз", "0731230987");
        phoneBook.put("Петренко", "0667778899");
        phoneBook.put("Романенко", "0954443322");
        phoneBook.put("Іваненко", "0978887766");

        return phoneBook;
    }
}
