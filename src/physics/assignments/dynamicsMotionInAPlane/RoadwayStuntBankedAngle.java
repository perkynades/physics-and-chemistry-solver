package physics.assignments.dynamicsMotionInAPlane;

public class RoadwayStuntBankedAngle {

    private double speed;
    private double radius;

    public RoadwayStuntBankedAngle(double speed, double radius) {
        this.speed = speed;
        this.radius = radius;
    }

    private double calc() {
        double angle;

        angle = Math.atan(Math.pow(speed, 2) / (radius*9.8));

        return Math.toDegrees(angle);
    }

    public static void main(String[] args) {
        RoadwayStuntBankedAngle roadwayStuntBankedAngle = new RoadwayStuntBankedAngle(24, 135);
        System.out.println(roadwayStuntBankedAngle.calc());
    }
}
