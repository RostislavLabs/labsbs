public class Main {
    public static void main(String[] args) {

        // Task 1 — площа прямокутного трикутника
        double area = Triangle.area(10, 6);
        System.out.println("Площа прямокутного трикутника = " + area);

        // Task 2 — найменше з трьох чисел
        int min = MinNumber.findMin(8, 3, 12);
        System.out.println("Найменше число = " + min);

        // Task 3 — вивід масиву
        int[] arr = {4, 8, 1, 9, 2};
        System.out.print("Масив: ");
        ArrayPrinter.printArray(arr);

        // Task 4 — найбільше число з масиву
        int max = MaxNumber.findMax(arr);
        System.out.println("Найбільше число = " + max);
    }
}