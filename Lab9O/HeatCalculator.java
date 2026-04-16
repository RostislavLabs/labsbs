public class HeatCalculator {

    public static double calculateQ(double m, double q) {
        return m * q;
    }

    public static double calculateM(double Q, double q) {
        return Q / q;
    }

    public static double calculateq(double Q, double m) {
        return Q / m;
    }
}