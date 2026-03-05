import java.util.Scanner;

class Triangle {

    double a; // перший катет
    double b; // другий катет

    Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double hypotenuse() {
        return Math.sqrt(a * a + b * b);
    }

    double sinA() {
        return a / hypotenuse();
    }

    double cosA() {
        return b / hypotenuse();
    }

    double tanA() {
        return a / b;
    }

    void showResults() {
        System.out.println("Катет a = " + a);
        System.out.println("Катет b = " + b);
        System.out.println("Гіпотенуза = " + hypotenuse());

        System.out.println("sin = " + sinA());
        System.out.println("cos = " + cosA());
        System.out.println("tan = " + tanA());
    }
}

public class Lab6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть катет a: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть катет b: ");
        double b = scanner.nextDouble();

        Triangle triangle = new Triangle(a, b);

        System.out.println("\nРезультати:");
        triangle.showResults();

        scanner.close();
    }
}