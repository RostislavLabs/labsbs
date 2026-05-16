import java.util.Scanner;

public class InputHelper {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int readInt(String message) {
        while (true) {
            System.out.print(message);
            String input = SCANNER.nextLine().trim();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Введіть ціле число!");
            }
        }
    }

    public static int readPositiveInt(String message) {
        while (true) {
            int number = readInt(message);

            if (number > 0) {
                return number;
            }

            System.out.println("Число має бути більше нуля!");
        }
    }

    public static int readIntInRange(String message, int min, int max) {
        while (true) {
            int number = readInt(message);

            if (number >= min && number <= max) {
                return number;
            }

            System.out.println("Введіть число від " + min + " до " + max + "!");
        }
    }

    public static String readLine(String message) {
        while (true) {
            System.out.print(message);
            String input = SCANNER.nextLine().trim();

            if (!input.isEmpty()) {
                return input;
            }

            System.out.println("Рядок не може бути порожнім!");
        }
    }
}
