public class Task3_ArrayPrint {

    public static String printArray(int[] arr) {
        String result = "Масив: ";

        for (int i = 0; i < arr.length; i++) {
            result += arr[i] + " ";
        }

        return result;
    }
}