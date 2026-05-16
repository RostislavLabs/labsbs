public class Driver {
    private String name;
    private int age;
    private int drivingExperience;

    public Driver(String name, int age, int drivingExperience) {
        this.name = name;
        this.age = age;
        this.drivingExperience = drivingExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    public void increaseDrivingExperience(int years) {
        if (years > 0) {
            drivingExperience += years;
        }
    }

    public void printInfo() {
        System.out.println("Водій: " + name
                + ", вік: " + age
                + ", стаж: " + drivingExperience + " років");
    }

    @Override
    public String toString() {
        return name + " (вік: " + age + ", стаж: " + drivingExperience + " років)";
    }
}
