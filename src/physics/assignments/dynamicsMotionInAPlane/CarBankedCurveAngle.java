package physics.assignments.dynamicsMotionInAPlane;

public class CarBankedCurveAngle {

    private double mass;
    private double radius;
    private double speed;

    public CarBankedCurveAngle(double mass, double radius, double speed) {
        this.mass = mass;
        this.radius = radius;
        this.speed = speed;
    }

    private double calc() {
        double angle;

        angle = Math.atan(Math.pow(speed, 2) / (radius*9.8));

        return Math.toDegrees(angle);
    }

    public static void main(String[] args) {
        CarBankedCurveAngle carBankedCurveAngle = new CarBankedCurveAngle(640, 106, 25.1);
        System.out.println(carBankedCurveAngle.calc());
    }
}
