public class TaskCar {
    public static void run() {
        System.out.println("\n--- Ієрархія Car / Sedan / Truck ---");

        Sedan sedan = new Sedan("Toyota Camry", "чорний", 220);
        Truck truck = new Truck("Volvo FH", "білий", 160);

        System.out.println("\nОб'єкт класу Sedan:");
        sedan.printInfo();
        sedan.gas();
        sedan.brake();

        System.out.println("\nОб'єкт класу Truck:");
        truck.printInfo();
        truck.gas();
        truck.brake();
    }
}
