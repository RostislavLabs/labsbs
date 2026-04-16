public class Phone {
    String number;
    String model;
    double weight;

    public Phone() {
        number = "0000000000";
        model = "Unknown";
        weight = 0;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void showInfo() {
        System.out.println("Номер: " + number +
                ", Модель: " + model +
                ", Вага: " + weight);
    }

    public void receiveCall(String name) {
        System.out.println("Дзвонить " + name);
    }

    public void receiveCall(String name, String phone) {
        System.out.println("Дзвонить " + name + " (" + phone + ")");
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {
        System.out.println("Повідомлення буде надіслано на:");
        for (String n : numbers) {
            System.out.println(n);
        }
    }
}