public class TaskTriangle {
    public static void run() {
        System.out.println("\n--- Індивідуальне завдання. Варіант 4 ---");
        System.out.println("Клас прямокутного трикутника з катетами a і b.");

        double legA = InputHelper.readPositiveDouble("Введіть катет a: ");
        double legB = InputHelper.readPositiveDouble("Введіть катет b: ");

        RightTriangle triangle = new RightTriangle(legA, legB);

        System.out.println("\nДані базового класу RightTriangle:");
        triangle.printData();
        triangle.printTrigonometricFunctions();

        String name = InputHelper.readLine("\nВведіть назву трикутника для класу-спадкоємця: ");
        String color = InputHelper.readLine("Введіть колір трикутника для класу-спадкоємця: ");

        ExtendedRightTriangle extendedTriangle = new ExtendedRightTriangle(legA, legB, name, color);

        System.out.println("\nДані класу-спадкоємця ExtendedRightTriangle:");
        extendedTriangle.printData();
        extendedTriangle.printTrigonometricFunctions();
    }
}
