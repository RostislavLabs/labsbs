import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // -------------------------------
        // 1. Обчислення виразу
        // -------------------------------
        System.out.println("=== Завдання 1 ===");
        double x1 = 2.5;
        double y1 = (Math.pow(x1, 2) + 3 * x1 + 1) / (Math.sqrt(x1 + 2));
        System.out.println("Результат: " + y1);

        // -------------------------------
        // 2. Розгалуження (з перевіркою)
        // -------------------------------
        System.out.println("\n=== Завдання 2 ===");

        double x2;

        System.out.print("Введіть x: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Помилка! Введіть число:");
            scanner.next(); // очищає неправильний ввід
        }
        x2 = scanner.nextDouble();

        double y2;

        if (x2 < 0) {
            y2 = Math.pow(x2, 2) - 1;
        } else if (x2 >= 0 && x2 <= 2) {
            y2 = 2 * x2 + 1;
        } else {
            y2 = Math.sqrt(x2);
        }

        System.out.println("y = " + y2);

        // -------------------------------
        // 3. Цикл (for)
        // -------------------------------
        System.out.println("\n=== Завдання 3 ===");
        double sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        System.out.println("Сума від 1 до 10: " + sum);

        // -------------------------------
        // 4. Цикл (while)
        // -------------------------------
        System.out.println("\n=== Завдання 4 ===");
        int i = 1;
        int factorial = 1;

        while (i <= 5) {
            factorial *= i;
            i++;
        }

        System.out.println("Факторіал 5: " + factorial);

        // -------------------------------
        // 5. Табулювання функції (варіант 12)
        // -------------------------------
        System.out.println("\n=== Завдання 5 ===");

        double a = -2.0;
        double b = 2.0;
        double h = 0.2;

        System.out.println("\n--- Через for ---");
        for (double x = a; x <= b; x += h) {
            double y = 3 * Math.sin(Math.sqrt(3) + 0.35 * x) - 3.8;
            System.out.printf("x = %.2f \t y = %.4f\n", x, y);
        }

        System.out.println("\n--- Через while ---");
        double x = a;
        while (x <= b) {
            double y = 3 * Math.sin(Math.sqrt(3) + 0.35 * x) - 3.8;
            System.out.printf("x = %.2f \t y = %.4f\n", x, y);
            x += h;
        }

        scanner.close();
    }
}