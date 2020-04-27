package physics.assignments.kinematicsInTwoDimension;

public class PlaneSouthWindVelocity {

    private double planeSpeed;
    private double windSpeed;

    public PlaneSouthWindVelocity(double planeSpeed, double windSpeed) {
        this.planeSpeed = planeSpeed;
        this.windSpeed = windSpeed;
    }

    private double calcVelocity() {
        double velocity;

        velocity = Math.sqrt(Math.pow(planeSpeed, 2) + Math.pow(windSpeed, 2));

        return velocity;
    }

    private double calcAngle() {
        double angle;

        angle = -Math.toDegrees(Math.atan(-windSpeed/planeSpeed));

        return angle;
    }

    public static void main(String[] args) {
        PlaneSouthWindVelocity planeSouthWindVelocity = new PlaneSouthWindVelocity(156, 20);
        System.out.println(planeSouthWindVelocity.calcVelocity());
        System.out.println(planeSouthWindVelocity.calcAngle() + " south of east");
    }
}
