public class MinNumber {

    // Метод знаходження найменшого з трьох чисел
    public static int findMin(int a, int b, int c) {
        int min = a;

        if (b < min) {
            min = b;
        }

        if (c < min) {
            min = c;
        }

        return min;
    }
}