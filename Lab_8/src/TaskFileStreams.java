import java.io.File;
import java.io.IOException;

public class TaskFileStreams {
    private static final RandomNumberFileWriter NUMBER_WRITER = new RandomNumberFileWriter();
    private static final FileReaderService FILE_READER = new FileReaderService();

    public static void run() {
        while (true) {
            System.out.println("\n=== Лабораторна робота 8. Робота з файлами ===");
            System.out.println("1 - Записати випадкові числа у файл");
            System.out.println("2 - Прочитати інформацію з файлу");
            System.out.println("3 - Записати випадкові числа і одразу прочитати файл");
            System.out.println("0 - Повернутися до головного меню");

            int choice = InputHelper.readInt("Оберіть пункт: ");

            switch (choice) {
                case 1:
                    writeNumbersInteractive();
                    break;
                case 2:
                    readFileInteractive();
                    break;
                case 3:
                    writeAndReadInteractive();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Такого пункту меню немає!");
            }
        }
    }

    public static void runFromCommandLineArguments(String[] args) {
        if (args.length != 4) {
            printCommandLineHelp();
            return;
        }

        String fileName = args[0];

        try {
            int minValue = Integer.parseInt(args[1]);
            int maxValue = Integer.parseInt(args[2]);
            int count = Integer.parseInt(args[3]);

            if (count <= 0) {
                System.out.println("Кількість чисел має бути більшою за нуль!");
                return;
            }

            if (maxValue < minValue) {
                System.out.println("Верхня межа має бути більшою або рівною нижній межі!");
                return;
            }

            File file = FileHelper.getFile(fileName);
            writeNumbers(file, minValue, maxValue, count);
            readFile(file);
        } catch (NumberFormatException e) {
            System.out.println("Параметри min, max і count мають бути цілими числами!");
            printCommandLineHelp();
        }
    }

    private static void writeNumbersInteractive() {
        File file = readFileFromConsole();
        int minValue = InputHelper.readMinValue("Введіть нижню межу діапазону: ");
        int maxValue = InputHelper.readMaxValue("Введіть верхню межу діапазону: ", minValue);
        int count = InputHelper.readPositiveInt("Введіть кількість випадкових чисел: ");

        writeNumbers(file, minValue, maxValue, count);
    }

    private static void readFileInteractive() {
        File file = readFileFromConsole();
        readFile(file);
    }

    private static void writeAndReadInteractive() {
        File file = readFileFromConsole();
        int minValue = InputHelper.readMinValue("Введіть нижню межу діапазону: ");
        int maxValue = InputHelper.readMaxValue("Введіть верхню межу діапазону: ", minValue);
        int count = InputHelper.readPositiveInt("Введіть кількість випадкових чисел: ");

        writeNumbers(file, minValue, maxValue, count);
        readFile(file);
    }

    private static File readFileFromConsole() {
        String fileName = InputHelper.readLine("Введіть ім'я txt-файлу: ");
        return FileHelper.getFile(fileName);
    }

    private static void writeNumbers(File file, int minValue, int maxValue, int count) {
        try {
            NUMBER_WRITER.writeRandomNumbers(file, minValue, maxValue, count);
            System.out.println("Дані успішно записано у файл: " + file.getPath());
        } catch (IOException e) {
            System.out.println("Помилка роботи з файлом: " + e.getMessage());
        }
    }

    private static void readFile(File file) {
        try {
            String fileContent = FILE_READER.readFile(file);
            System.out.println("\nВміст файлу " + file.getPath() + ":");
            System.out.println(fileContent);
        } catch (IOException e) {
            System.out.println("Помилка читання файлу: " + e.getMessage());
        }
    }

    private static void printCommandLineHelp() {
        System.out.println("Формат запуску з параметрами командного рядка:");
        System.out.println("java -cp bin Main <fileName> <min> <max> <count>");
        System.out.println("Приклад:");
        System.out.println("java -cp bin Main numbers.txt 1 100 20");
    }
}
