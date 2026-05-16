public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n========== Лабораторна робота №6 ==========");
            System.out.println("1 - Завдання Person");
            System.out.println("2 - Завдання Phone");
            System.out.println("3 - Ієрархія Car / Sedan / Truck");
            System.out.println("4 - Індивідуальне завдання, варіант 4");
            System.out.println("0 - Вихід");

            int choice = InputHelper.readInt("Оберіть пункт меню: ");

            switch (choice) {
                case 1:
                    TaskPerson.run();
                    break;
                case 2:
                    TaskPhone.run();
                    break;
                case 3:
                    TaskCar.run();
                    break;
                case 4:
                    TaskTriangle.run();
                    break;
                case 0:
                    System.out.println("Програму завершено.");
                    return;
                default:
                    System.out.println("Такого пункту меню немає!");
            }
        }
    }
}
