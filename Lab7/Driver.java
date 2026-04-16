public class Driver {
    String name;
    int age;
    int experience;

    public Driver(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public void improveSkill() {
        experience++;
    }

    @Override
    public String toString() {
        return name + " | Вік: " + age +
               " | Стаж: " + experience;
    }
}