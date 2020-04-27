package physics.assignments.dynamicsMotionInAPlane;

public class EngineersBankedCurveAngle {

    private double radius;
    private double speed;

    public EngineersBankedCurveAngle(double radius, double speed) {
        this.radius = radius;
        this.speed = speed;
    }

    private double calc() {
        double angle;

        angle = Math.atan(Math.pow(speed, 2) / (radius*9.8));

        return Math.toDegrees(angle);
    }

    public static void main(String[] args) {
        EngineersBankedCurveAngle engineersBankedCurveAngle = new EngineersBankedCurveAngle(175, 24.5);
        System.out.println(engineersBankedCurveAngle.calc());
    }
}
