import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть радіус: ");
        double r = scanner.nextDouble();

        Circle circle = new Circle(r);

        System.out.println("Довжина кола: " + circle.getLength());
        System.out.println("Площа круга: " + circle.getArea());

        scanner.close();
    }
}