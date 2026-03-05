public class Lab5 {

    // 1. Площа ромба
    public static double rhombusArea(double d1, double d2) {
        return (d1 * d2) / 2;
    }

    // 2. Найменше з трьох чисел
    public static int minOfThree(int a, int b, int c) {
        int min = a;

        if (b < min) {
            min = b;
        }

        if (c < min) {
            min = c;
        }

        return min;
    }

    // 3. Вивід масиву
    public static void printArray(int[] arr) {
        System.out.print("Масив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 4. Найбільше число в масиві
    public static int maxInArray(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        // 1. Площа ромба
        double area = rhombusArea(6, 8);
        System.out.println("Площа ромба: " + area);

        // 2. Найменше число
        int min = minOfThree(5, 2, 9);
        System.out.println("Найменше число: " + min);

        // 3. Масив
        int[] numbers = {3, 7, 1, 9, 4};

        printArray(numbers);

        // 4. Найбільше число
        int max = maxInArray(numbers);
        System.out.println("Найбільше число в масиві: " + max);
    }
}