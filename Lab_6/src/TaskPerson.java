public class TaskPerson {
    public static void run() {
        System.out.println("\n--- Завдання Person ---");

        Person person1 = new Person();

        String fullName = InputHelper.readLine("Введіть ПІБ для другого об'єкта: ");
        int age = InputHelper.readPositiveInt("Введіть вік: ");
        Person person2 = new Person(fullName, age);

        System.out.println("\nПерший об'єкт:");
        person1.printInfo();
        person1.move();
        person1.talk();

        System.out.println("\nДругий об'єкт:");
        person2.printInfo();
        person2.move();
        person2.talk();
    }
}
