public class TaskPhone {
    public static void run() {
        System.out.println("\n--- Завдання Phone ---");

        Phone phone1 = new Phone("+380501112233", "Samsung Galaxy A15", 200.0);
        Phone phone2 = new Phone("+380671234567", "iPhone 13", 174.0);
        Phone phone3 = new Phone("+380931112244", "Xiaomi Redmi Note 12");

        System.out.println("\nДані телефонів:");
        phone1.printInfo();
        phone2.printInfo();
        phone3.printInfo();

        System.out.println("\nВиклик методів receiveCall() та getNumber():");
        phone1.receiveCall("Андрій");
        System.out.println("Номер телефону: " + phone1.getNumber());

        phone2.receiveCall("Олег");
        System.out.println("Номер телефону: " + phone2.getNumber());

        phone3.receiveCall("Марія");
        System.out.println("Номер телефону: " + phone3.getNumber());

        System.out.println("\nПеревантажений метод receiveCall():");
        phone1.receiveCall("Сергій", "+380991010101");

        System.out.println("\nМетод sendMessage():");
        phone1.sendMessage(phone1.getNumber(), phone2.getNumber(), phone3.getNumber());
    }
}
