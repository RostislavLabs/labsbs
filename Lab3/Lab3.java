import java.util.Scanner;

public class Lab3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("===== ЛАБОРАТОРНА РОБОТА №3 =====");

        task1();
        task2();
        task3();
        task4();
        task5_for();
        task5_while();
    }

    // 1. Вивести фразу 50 разів (for і while)
    static void task1() {

        System.out.println("\n--- Завдання 1 (for) ---");
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + ". I love Java programming!");
        }

        System.out.println("\n--- Завдання 1 (while) ---");
        int i = 1;
        while (i <= 50) {
            System.out.println(i + ". I love Java programming!");
            i++;
        }
    }

    // 2. Години і хвилини (for)
    static void task2() {

        System.out.println("\n--- Завдання 2 (for) ---");

        for (int h = 0; h <= 2; h++) {
            for (int m = 0; m <= 59; m++) {
                System.out.println(h + " h " + m + " min");
            }
        }
    }

    // 3. Години і хвилини (while)
    static void task3() {

        System.out.println("\n--- Завдання 3 (while) ---");

        int h = 0;
        while (h <= 2) {
            int m = 0;
            while (m <= 59) {
                System.out.println(h + " h " + m + " min");
                m++;
            }
            h++;
        }
    }

    // 4. Години, хвилини, секунди
    static void task4() {

        System.out.println("\n--- Завдання 4 ---");

        for (int h = 0; h <= 2; h++) {
            for (int m = 0; m <= 59; m++) {
                for (int s = 0; s <= 59; s++) {
                    System.out.println(h + " h " + m + " min " + s + " sec");
                }
            }
        }
    }

    // 5. Табулювання функції (for)
    static void task5_for() {

        System.out.println("\n--- Завдання 5 (for) ---");

        double a = -1;
        double b = 2;
        double step = 0.2;

        System.out.print("Введіть нижню межу діапазону значень функції: ");
        double min = sc.nextDouble();

        System.out.print("Введіть верхню межу діапазону значень функції: ");
        double max = sc.nextDouble();

        int count = 0;

        for (double x = a; x <= b; x += step) {

            double y = Math.pow(x, 5) - x + 1.8;

            System.out.printf("x = %.1f   f(x) = %.4f\n", x, y);

            if (y >= min && y <= max) {
                count++;
            }
        }

        if (count > 0)
            System.out.println("Кількість значень в діапазоні: " + count);
        else
            System.out.println("Значення функції в цьому діапазоні відсутні.");
    }

    // 5. Табулювання функції (while)
    static void task5_while() {

        System.out.println("\n--- Завдання 5 (while) ---");

        double a = -1;
        double b = 2;
        double step = 0.2;

        System.out.print("Введіть нижню межу діапазону значень функції: ");
        double min = sc.nextDouble();

        System.out.print("Введіть верхню межу діапазону значень функції: ");
        double max = sc.nextDouble();

        int count = 0;
        double x = a;

        while (x <= b) {

            double y = Math.pow(x, 5) - x + 1.8;

            System.out.printf("x = %.1f   f(x) = %.4f\n", x, y);

            if (y >= min && y <= max) {
                count++;
            }

            x += step;
        }

        if (count > 0)
            System.out.println("Кількість значень в діапазоні: " + count);
        else
            System.out.println("Значення функції в цьому діапазоні відсутні.");
    }
}