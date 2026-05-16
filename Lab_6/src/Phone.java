public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {
        this.number = "Невідомий номер";
        this.model = "Невідома модель";
        this.weight = 0;
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

    public void receiveCall(String callerName) {
        System.out.println("Дзвонить " + callerName);
    }

    public void receiveCall(String callerName, String phoneNumber) {
        System.out.println("Дзвонить " + callerName + ", номер телефону: " + phoneNumber);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... phoneNumbers) {
        System.out.println("Повідомлення буде надіслано на номери:");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }

    public void printInfo() {
        System.out.println("Номер: " + number + ", модель: " + model + ", вага: " + weight + " г");
    }
}
