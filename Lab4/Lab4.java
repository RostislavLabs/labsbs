import java.util.Scanner;

public class Lab4 {

    public static void main(String[] args) {

        // -------------------------------
        // 1. Масив з 50 парних і 50 непарних чисел
        // -------------------------------

        int[] even = new int[50];
        int[] odd = new int[50];

        for (int i = 0; i < 50; i++) {
            even[i] = i * 2;
            odd[i] = i * 2 + 1;
        }

        System.out.println("50 парних чисел:");
        for (int i = 0; i < even.length; i++) {
            System.out.print(even[i] + " ");
        }

        System.out.println("\n\n50 непарних чисел:");
        for (int i = 0; i < odd.length; i++) {
            System.out.print(odd[i] + " ");
        }

        // -------------------------------
        // 2. Робота з масивом
        // -------------------------------

        int[] arr = {2,17,13,6,22,31,45,66,100,-18};

        System.out.println("\n\nМасив через while:");
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }

        System.out.println("\n\nМасив через for:");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }

        System.out.println("\n\nНепарні індекси (while):");
        i = 0;
        while (i < arr.length) {
            if (i % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
            i++;
        }

        System.out.println("\n\nПарні індекси (for):");
        for (int j = 0; j < arr.length; j++) {
            if (j % 2 == 0) {
                System.out.print(arr[j] + " ");
            }
        }

        System.out.println("\n\nМасив у зворотньому порядку:");
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }

        // -------------------------------
        // 3. Сума елементів масиву (З TRY-CATCH)
        // -------------------------------

        Scanner scanner = new Scanner(System.in);

        int n;

        while (true) {
            System.out.println("\n\nВведіть кількість елементів масиву:");
            try {
                n = scanner.nextInt();
                if (n <= 0) {
                    System.out.println("Кількість має бути більше 0!");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Помилка! Введіть ціле число.");
                scanner.next(); // очищає неправильний ввід
            }
        }

        double[] numbers = new double[n];
        double sum = 0;

        for (int j = 0; j < n; j++) {
            while (true) {
                System.out.print("Введіть елемент " + j + ": ");
                try {
                    numbers[j] = scanner.nextDouble();
                    sum += numbers[j];
                    break;
                } catch (Exception e) {
                    System.out.println("Помилка! Введіть число.");
                    scanner.next(); // очищає неправильний ввід
                }
            }
        }

        System.out.println("Сума елементів масиву = " + sum);

        // -------------------------------
        // 4. Зміна знаку непарних елементів
        // -------------------------------

        int[] nums = {1,2,3,4,5,6,7,8,9};

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] % 2 != 0) {
                nums[j] = -nums[j];
            }
        }

        System.out.println("\nМасив після зміни знаку непарних елементів:");
        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j] + " ");
        }

        scanner.close();
    }
}