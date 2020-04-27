package physics.assignments.newtonsThirdLaw;

public class TwoBlockPulleyLowerBlockAcceleration {

    private double tension;
    private double coefficientLowerSurface;
    private double coefficientLowerUpper;
    private double massUpper;
    private double massLower;

    public TwoBlockPulleyLowerBlockAcceleration(double tension, double coefficientLowerSurface, double coefficientLowerUpper, double massUpper, double massLower) {
        this.tension = tension;
        this.coefficientLowerSurface = coefficientLowerSurface;
        this.coefficientLowerUpper = coefficientLowerUpper;
        this.massUpper = massUpper;
        this.massLower = massLower;
    }

    private double calc() {
        double acceleration;

        acceleration = (tension - (coefficientLowerSurface*massLower*9.8) - (3*coefficientLowerUpper*massUpper*9.8)) / (massLower+massUpper);

        return acceleration;
    }

    public static void main(String[] args) {
        TwoBlockPulleyLowerBlockAcceleration twoBlockPulleyLowerBlockAcceleration = new TwoBlockPulleyLowerBlockAcceleration(20, 0.15, 0.12, 1, 2);
        System.out.println(twoBlockPulleyLowerBlockAcceleration.calc());
    }
}
