public class Main {
    public static void main(String[] args) { //це масив рядків, у якому зберігаються аргументи командного рядка.
        if (args.length > 0) {
            TaskFileStreams.runFromCommandLineArguments(args);
            return;
        }

        while (true) {
            System.out.println("\n=== Головне меню ===");
            System.out.println("1 - Лабораторна робота 8. Потоки вводу/виводу. Робота з файлами");
            System.out.println("0 - Вихід");

            int choice = InputHelper.readInt("Оберіть пункт меню: ");

            switch (choice) {
                case 1:
                    TaskFileStreams.run();
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
