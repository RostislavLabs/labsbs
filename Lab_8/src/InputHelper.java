import java.util.Scanner;

public class InputHelper {
    private static final Scanner SCANNER = new Scanner(System.in);

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
            int value = readInt(message);

            if (value > 0) {
                return value;
            }

            System.out.println("Число має бути більше нуля!");
        }
    }

    public static int readMinValue(String message) {
        return readInt(message);
    }

    public static int readMaxValue(String message, int minValue) {
        while (true) {
            int maxValue = readInt(message);

            if (maxValue >= minValue) {
                return maxValue;
            }

            System.out.println("Верхня межа має бути більшою або рівною нижній межі!");
        }
    }
}
