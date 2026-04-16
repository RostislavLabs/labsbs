public class MaxNumber {

    // Метод знаходження найбільшого числа в масиві
    public static int findMax(int[] arr) {
        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }
}