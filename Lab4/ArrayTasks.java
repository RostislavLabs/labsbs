public class ArrayTasks {

    public static void task1() {
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
    }

    public static void task2() {
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
    }
}