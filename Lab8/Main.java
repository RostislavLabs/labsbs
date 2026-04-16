public class Main {
    public static void main(String[] args) {
        if (!Validator.validateArgs(args)) {
            System.out.println("Неправильні аргументи!");
            System.out.println("Формат: java Main <filename> <b1> <b2> <count>");
            return;
        }

        String fileName = args[0];
        int b1 = Integer.parseInt(args[1]);
        int b2 = Integer.parseInt(args[2]);
        int count = Integer.parseInt(args[3]);

        FileManager fileManager = new FileManager(fileName);

        fileManager.createFileIfNotExists();

        int[] numbers = RandomGenerator.generate(b1, b2, count);

        fileManager.writeToFile(numbers);

        System.out.println("Дані з файлу:");
        fileManager.readFromFile();
    }
}