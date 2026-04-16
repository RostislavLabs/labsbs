public class Person {
    String fullName;
    int age;

    public Person() {
        fullName = "Невідомо";
        age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " рухається");
    }

    public void talk() {
        System.out.println(fullName + " говорить");
    }
}