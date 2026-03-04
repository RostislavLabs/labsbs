import java.util.Scanner;

public class Lab2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== ЛАБОРАТОРНА РОБОТА №2 =====");
            System.out.println("1 - Квадратне рівняння");
            System.out.println("2 - Квадрант точки");
            System.out.println("3 - Двозначне і парне число");
            System.out.println("4 - Функція f(x) (варіант 19)");
            System.out.println("5 - 4.2.1 День тижня");
            System.out.println("6 - 4.2.2 Пора року");
            System.out.println("7 - 4.2.3 Дні в місяці");
            System.out.println("8 - 4.2.4 Текстове меню");
            System.out.println("9 - 4.2.5 Предмет за номером пари");
            System.out.println("10 - 4.2.6 Чверть години");
            System.out.println("11 - 4.2.7 Меню калькулятора");
            System.out.println("0 - Вихід");

            int choice = sc.nextInt();

            switch (choice) {
                case 1: quadraticEquation(); break;
                case 2: quadrant(); break;
                case 3: numberCheck(); break;
                case 4: function19(); break;
                case 5: dayType(); break;
                case 6: season(); break;
                case 7: daysInMonth(); break;
                case 8: menuText(); break;
                case 9: lesson(); break;
                case 10: quarterHour(); break;
                case 11: calculatorMenu(); break;
                case 0:
                    System.out.println("Програма завершена.");
                    return;
                default:
                    System.out.println("Невірний вибір!");
            }
        }
    }

    // 1. Квадратне рівняння
    static void quadraticEquation() {
        System.out.print("Введіть a: ");
        double a = sc.nextDouble();
        System.out.print("Введіть b: ");
        double b = sc.nextDouble();
        System.out.print("Введіть c: ");
        double c = sc.nextDouble();

        double D = b*b - 4*a*c;

        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2*a);
            double x2 = (-b - Math.sqrt(D)) / (2*a);
            System.out.println("Два корені: " + x1 + ", " + x2);
        } else if (D == 0) {
            double x = -b / (2*a);
            System.out.println("Один корінь: " + x);
        } else {
            System.out.println("Коренів немає.");
        }
    }

    // 2. Квадрант
    static void quadrant() {
        System.out.print("Введіть x: ");
        double x = sc.nextDouble();
        System.out.print("Введіть y: ");
        double y = sc.nextDouble();

        if (x > 0 && y > 0) System.out.println("I квадрант");
        else if (x < 0 && y > 0) System.out.println("II квадрант");
        else if (x < 0 && y < 0) System.out.println("III квадрант");
        else if (x > 0 && y < 0) System.out.println("IV квадрант");
        else System.out.println("Точка на осі");
    }

    // 3. Перевірка числа
    static void numberCheck() {
        System.out.print("Введіть число: ");
        int num = sc.nextInt();

        if (num >= 10 && num <= 99 && num % 2 == 0)
            System.out.println("Число двозначне і парне");
        else
            System.out.println("Число не є двозначним і парним");
    }

    // 4.1 Варіант 19
    static void function19() {
        System.out.print("Введіть x: ");
        double x = sc.nextDouble();
        double f;

        if (x < 0)
            f = x*x + 2*x + 1;
        else if (x == 0)
            f = 0;
        else
            f = Math.sqrt(x);

        System.out.println("f(x) = " + f);
    }

    // 4.2.1 День тижня
    static void dayType() {
        System.out.print("Введіть номер дня (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 6:
            case 7:
                System.out.println("Вихідний");
                break;
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Робочий");
                break;
            default:
                System.out.println("Невірний номер");
        }
    }

    // 4.2.2 Пора року
    static void season() {
        System.out.print("Введіть місяць (1-12): ");
        int month = sc.nextInt();

        switch (month) {
            case 12: case 1: case 2: System.out.println("Зима"); break;
            case 3: case 4: case 5: System.out.println("Весна"); break;
            case 6: case 7: case 8: System.out.println("Літо"); break;
            case 9: case 10: case 11: System.out.println("Осінь"); break;
            default: System.out.println("Невірний місяць");
        }
    }

    // 4.2.3 Дні в місяці
    static void daysInMonth() {
        System.out.print("Введіть місяць (1-12): ");
        int month = sc.nextInt();

        switch (month) {
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12:
                System.out.println("31 день"); break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 днів"); break;
            case 2:
                System.out.println("28 або 29 днів"); break;
            default:
                System.out.println("Невірний місяць");
        }
    }

    // 4.2.4 Меню
    static void menuText() {
        System.out.println("1 - Привітання");
        System.out.println("2 - Запрошення");
        System.out.println("3 - Завершити");
        int c = sc.nextInt();

        switch (c) {
            case 1: System.out.println("Вітаю!"); break;
            case 2: System.out.println("Запрошуємо до роботи!"); break;
            case 3: System.out.println("Завершення..."); break;
            default: System.out.println("Невірний вибір");
        }
    }

    // 4.2.5 Предмет
    static void lesson() {
        System.out.print("Номер пари (1-4): ");
        int l = sc.nextInt();

        switch (l) {
            case 1: System.out.println("Математика"); break;
            case 2: System.out.println("Програмування"); break;
            case 3: System.out.println("Фізика"); break;
            case 4: System.out.println("Англійська"); break;
            default: System.out.println("Невірний номер");
        }
    }

    // 4.2.6 Чверть години
    static void quarterHour() {
        System.out.print("Хвилини (0-59): ");
        int min = sc.nextInt();

        switch (min / 15) {
            case 0: System.out.println("Перша чверть"); break;
            case 1: System.out.println("Друга чверть"); break;
            case 2: System.out.println("Третя чверть"); break;
            case 3: System.out.println("Четверта чверть"); break;
            default: System.out.println("Невірне значення");
        }
    }

    // 4.2.7 Калькулятор
    static void calculatorMenu() {
        System.out.println("1 - Добуток");
        System.out.println("2 - Сума");
        System.out.println("3 - Різниця");
        int c = sc.nextInt();

        System.out.print("Перше число: ");
        double a = sc.nextDouble();
        System.out.print("Друге число: ");
        double b = sc.nextDouble();

        switch (c) {
            case 1: System.out.println("Добуток = " + (a*b)); break;
            case 2: System.out.println("Сума = " + (a+b)); break;
            case 3: System.out.println("Різниця = " + (a-b)); break;
            default: System.out.println("Невірний вибір");
        }
    }
}