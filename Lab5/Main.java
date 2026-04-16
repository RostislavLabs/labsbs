public class Main {
    public static void main(String[] args) {

        // 1
        double area = Task1_Rhombus.rhombusArea(6, 8);
        System.out.println("Площа ромба: " + area);

        // 2
        int min = Task2_MinOfThree.minOfThree(5, 2, 9);
        System.out.println("Найменше число: " + min);

        // 3
        int[] numbers = {3, 7, 1, 9, 4};
        Task3_ArrayPrint.printArray(numbers);

        // 4
        int max = Task4_ArrayMax.maxInArray(numbers);
        System.out.println("Найбільше число: " + max);
    }
}
//=======компіляція=====