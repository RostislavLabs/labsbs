public class ExtendedRightTriangle extends RightTriangle {
    private String triangleName;
    private String color;

    public ExtendedRightTriangle(double legA, double legB, String triangleName, String color) {
        super(legA, legB);
        this.triangleName = triangleName;
        this.color = color;
    }

    @Override
    public void printData() {
        System.out.println("Назва трикутника: " + triangleName);
        System.out.println("Колір трикутника: " + color);
        super.printData();
    }
}
