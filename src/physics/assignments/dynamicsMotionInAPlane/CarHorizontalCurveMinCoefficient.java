package physics.assignments.dynamicsMotionInAPlane;

public class CarHorizontalCurveMinCoefficient {

    private double speed;
    private double radius;

    public CarHorizontalCurveMinCoefficient(double speed, double radius) {
        this.speed = speed;
        this.radius = radius;
    }

    private double calc() {
        double coeffecient;

        coeffecient = Math.pow(speed, 2) / (radius*9.8);

        return coeffecient;
    }

    public static void main(String[] args) {
        CarHorizontalCurveMinCoefficient carHorizontalCurveMinCoefficient = new CarHorizontalCurveMinCoefficient(24.3, 393);
        System.out.println(carHorizontalCurveMinCoefficient.calc());
    }
}
