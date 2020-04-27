package physics.assignments.kinematicsInTwoDimension;

public class LongDistanceSwimmerAngle {

    private double speed;
    private double currentFlow;

    public LongDistanceSwimmerAngle(double speed, double currentFlow) {
        this.speed = speed;
        this.currentFlow = currentFlow;
    }

    private double calc() {
        double angle;

        angle = Math.toDegrees(Math.asin(currentFlow/speed));

        return angle;
    }

    public static void main(String[] args) {
        LongDistanceSwimmerAngle longDistanceSwimmerAngle = new LongDistanceSwimmerAngle(4, 3);
        System.out.println(longDistanceSwimmerAngle.calc() + " west of north");
    }
}
