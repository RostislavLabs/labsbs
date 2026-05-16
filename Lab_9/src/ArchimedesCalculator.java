public class ArchimedesCalculator {

    public double calculateBuoyantForce(double density, double volume) {
        return density * PhysicsConstants.GRAVITY * volume;
    }

    public double calculateBodyWeight(double mass) {
        return mass * PhysicsConstants.GRAVITY;
    }

    public String defineFloatingCondition(double mass, double volume, double density) {
        double buoyantForce = calculateBuoyantForce(density, volume);
        double bodyWeight = calculateBodyWeight(mass);
        double eps = 0.000001;

        if (buoyantForce > bodyWeight + eps) {
            return "Тіло спливає, бо сила Архімеда більша за вагу тіла.";
        } else if (bodyWeight > buoyantForce + eps) {
            return "Тіло тоне, бо вага тіла більша за силу Архімеда.";
        } else {
            return "Тіло плаває у рівновазі, бо сила Архімеда дорівнює вазі тіла.";
        }
    }

    public double calculateNeutralMass(double density, double volume) {
        return density * volume;
    }

    public double calculateNeutralVolume(double mass, double density) {
        return mass / density;
    }

    public double calculateNeutralDensity(double mass, double volume) {
        return mass / volume;
    }
}
