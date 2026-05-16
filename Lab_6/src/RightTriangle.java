public class RightTriangle {
    protected double legA;
    protected double legB;

    public RightTriangle() {
        this.legA = 0;
        this.legB = 0;
    }

    public RightTriangle(double legA, double legB) {
        this.legA = legA;
        this.legB = legB;
    }

    public double getHypotenuse() {
        return Math.sqrt(legA * legA + legB * legB);
    }

    public double getSinAlpha() {
        return legA / getHypotenuse();
    }

    public double getCosAlpha() {
        return legB / getHypotenuse();
    }

    public double getTanAlpha() {
        return legA / legB;
    }

    public double getCotAlpha() {
        return legB / legA;
    }

    public double getSinBeta() {
        return legB / getHypotenuse();
    }

    public double getCosBeta() {
        return legA / getHypotenuse();
    }

    public double getTanBeta() {
        return legB / legA;
    }

    public double getCotBeta() {
        return legA / legB;
    }

    public void printData() {
        System.out.printf("Катет a = %.2f%n", legA);
        System.out.printf("Катет b = %.2f%n", legB);
        System.out.printf("Гіпотенуза c = %.2f%n", getHypotenuse());
    }

    public void printTrigonometricFunctions() {
        System.out.println("\nТригонометричні функції кута alpha, який лежить навпроти катета a:");
        System.out.printf("sin(alpha) = %.4f%n", getSinAlpha());
        System.out.printf("cos(alpha) = %.4f%n", getCosAlpha());
        System.out.printf("tg(alpha) = %.4f%n", getTanAlpha());
        System.out.printf("ctg(alpha) = %.4f%n", getCotAlpha());

        System.out.println("\nТригонометричні функції кута beta, який лежить навпроти катета b:");
        System.out.printf("sin(beta) = %.4f%n", getSinBeta());
        System.out.printf("cos(beta) = %.4f%n", getCosBeta());
        System.out.printf("tg(beta) = %.4f%n", getTanBeta());
        System.out.printf("ctg(beta) = %.4f%n", getCotBeta());
    }
}
