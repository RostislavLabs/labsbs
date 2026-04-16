public class Main {
    public static void main(String[] args) {

        // Task 1 - Person
        Person p1 = new Person();
        Person p2 = new Person("Остапчук Назар", 19);

        p1.move();
        p1.talk();

        p2.move();
        p2.talk();

        System.out.println();

        // Task 2 - Phone
        Phone ph1 = new Phone("0971112233", "Samsung", 180);
        Phone ph2 = new Phone("0502223344", "iPhone");
        Phone ph3 = new Phone();

        ph1.showInfo();
        ph2.showInfo();
        ph3.showInfo();

        ph1.receiveCall("Іван");
        ph2.receiveCall("Петро", "0635556677");

        System.out.println("Номер телефону: " + ph1.getNumber());

        ph1.sendMessage("0991111111", "0662222222", "0933333333");

        System.out.println();

        // Task 3 - Car hierarchy
        Sedan sedan = new Sedan("BMW", "Black", 240);
        Truck truck = new Truck("MAN", "White", 160);

        sedan.gas();
        sedan.brake();

        truck.gas();
        truck.brake();

        System.out.println();

        // Task 4 - Variant 12 (Product)
        Product pr = new Product("Ноутбук", 32000, 24);
        pr.showInfo();
        pr.discount();

        System.out.println();

        // Task 5 - Child class
        SmartProduct sp = new SmartProduct(
                "Смартфон", 25000, 12,
                "Samsung", true
        );

        sp.showInfo();
    }
}