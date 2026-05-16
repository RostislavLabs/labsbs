import java.util.Scanner;

public class InputHelper {
    private static final Scanner scanner = new Scanner(System.in);

    public static String readLine(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public static int readInt(String message) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim();

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

    public static double readDouble(String message) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim().replace(',', '.');

            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Введіть число!");
            }
        }
    }

    public static double readPositiveDouble(String message) {
        while (true) {
            double value = readDouble(message);
            if (value > 0) {
                return value;
            }
            System.out.println("Число має бути більше нуля!");
        }
    }
}
