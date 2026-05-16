public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n========== Лабораторна робота №7 ==========");
            System.out.println("1 - Завдання 1. Сервіс таксі, ArrayList");
            System.out.println("2 - Завдання 2. Телефонна книга, HashMap");
            System.out.println("0 - Вихід");

            int choice = InputHelper.readInt("Оберіть пункт меню: ");

            switch (choice) {
                case 1:
                    TaskTaxiService.run();
                    break;
                case 2:
                    TaskPhoneBook.run();
                    break;
                case 0:
                    System.out.println("Програму завершено.");
                    return;
                default:
                    System.out.println("Такого пункту меню немає!");
                    break;
            }
        }
    }
}
