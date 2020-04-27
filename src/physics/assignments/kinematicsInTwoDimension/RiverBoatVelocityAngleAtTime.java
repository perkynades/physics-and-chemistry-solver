package physics.assignments.kinematicsInTwoDimension;

public class RiverBoatVelocityAngleAtTime {

    private double acceleration;
    private double time;
    private double velocityA;

    private double velocityB;

    public RiverBoatVelocityAngleAtTime(double acceleration, double time, double velocityA) {
        this.acceleration = acceleration;
        this.time = time;
        this.velocityA = velocityA;
    }

    private double calcVelocity() {
        double finalVelocity;

        velocityB = acceleration*time;

        finalVelocity = Math.sqrt(Math.pow(velocityA, 2)+Math.pow(velocityB, 2));

        return finalVelocity;
    }

    private double calcAngle() {
        double angle;

        angle = Math.acos(velocityA/velocityB)*57.295;

        return angle;
    }

    public static void main(String[] args) {
        RiverBoatVelocityAngleAtTime riverBoatVelocityAngleAtTime = new RiverBoatVelocityAngleAtTime(0.750, 33.5, 3.35);
        System.out.println(riverBoatVelocityAngleAtTime.calcVelocity());
        System.out.println(riverBoatVelocityAngleAtTime.calcAngle());
    }
}
