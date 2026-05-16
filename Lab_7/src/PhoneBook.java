import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private HashMap<String, String> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void put(String surname, String phoneNumber) {
        contacts.put(surname, phoneNumber);
    }

    public String get(String surname) {
        return contacts.get(surname);
    }

    public void remove(String surname) {
        contacts.remove(surname);
    }

    public boolean containsKey(String surname) {
        return contacts.containsKey(surname);
    }

    public boolean containsValue(String phoneNumber) {
        return contacts.containsValue(phoneNumber);
    }

    public int size() {
        return contacts.size();
    }

    public void printAll() {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
