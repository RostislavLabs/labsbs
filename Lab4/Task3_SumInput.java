import java.util.Scanner;

public class Task3_SumInput {

    public static void task3() {

        Scanner scanner = new Scanner(System.in);
        int n;

        while (true) {
            System.out.println("\nВведіть кількість елементів масиву:");
            try {
                n = scanner.nextInt();
                if (n <= 0) {
                    System.out.println("Помилка: n > 0");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Помилка вводу!");
                scanner.next();
            }
        }

        double[] arr = new double[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Елемент " + i + ": ");
                try {
                    arr[i] = scanner.nextDouble();
                    sum += arr[i];
                    break;
                } catch (Exception e) {
                    System.out.println("Помилка вводу!");
                    scanner.next();
                }
            }
        }

        System.out.println("Сума елементів: " + sum);
        scanner.close();
    }
}