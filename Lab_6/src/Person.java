public class Person {
    private String fullName;
    private int age;

    public Person() {
        this.fullName = "Невідомий користувач";
        this.age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " Person рухається");
    }

    public void talk() {
        System.out.println(fullName + " Person говорить");
    }

    public void printInfo() {
        System.out.println("ПІБ: " + fullName + ", вік: " + age);
    }
}
