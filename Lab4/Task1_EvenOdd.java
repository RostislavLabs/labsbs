public class Task1_EvenOdd {

    public static void task1() {

        int[] even = new int[50];
        int[] odd = new int[50];

        for (int i = 0; i < 50; i++) {
            even[i] = i * 2;
            odd[i] = i * 2 + 1;
        }

        // створюємо нові масиви без 49-го елемента (індекс 49)
        int[] evenNew = new int[49];
        int[] oddNew = new int[49];

        for (int i = 0; i < 49; i++) {
            evenNew[i] = even[i];
            oddNew[i] = odd[i];
        }

        System.out.println("49 парних чисел:");
        for (int i = 0; i < evenNew.length; i++) {
            System.out.print(evenNew[i] + " ");
        }

        System.out.println("\n\n49 непарних чисел:");
        for (int i = 0; i < oddNew.length; i++) {
            System.out.print(oddNew[i] + " ");
        }

        System.out.println();
    }
}