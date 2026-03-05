public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getLength() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

}