public class Task1_EvenOdd {

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

        System.out.println();
    }
}