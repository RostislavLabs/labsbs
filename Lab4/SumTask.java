import java.util.Scanner;

public class SumTask {

    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        int n;

        while (true) {
            System.out.println("\nВведіть кількість елементів:");
            try {
                n = scanner.nextInt();
                if (n <= 0) continue;
                break;
            } catch (Exception e) {
                System.out.println("Помилка!");
                scanner.next();
            }
        }

        double[] numbers = new double[n];
        double sum = 0;

        for (int j = 0; j < n; j++) {
            while (true) {
                System.out.print("Елемент " + j + ": ");
                try {
                    numbers[j] = scanner.nextDouble();
                    sum += numbers[j];
                    break;
                } catch (Exception e) {
                    System.out.println("Помилка!");
                    scanner.next();
                }
            }
        }

        System.out.println("Сума = " + sum);
        scanner.close();
    }
}