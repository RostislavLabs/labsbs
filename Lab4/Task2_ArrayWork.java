public class Task2_ArrayWork {

    public static void task2() {

        int[] arr = {2,17,13,6,22,31,45,66,100,-18};

        System.out.println("\nМасив через while:");
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }

        System.out.println("\n\nМасив через for:");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }

        System.out.println("\n\nНепарні індекси:");
        i = 0;
        while (i < arr.length) {
            if (i % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
            i++;
        }

        System.out.println("\n\nПарні індекси:");
        for (int j = 0; j < arr.length; j++) {
            if (j % 2 == 0) {
                System.out.print(arr[j] + " ");
            }
        }

        System.out.println("\n\nЗворотній порядок:");
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }

        System.out.println();
    }
}