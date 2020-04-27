package physics.assignments.TODOfix;

/**
 * TODO: FIX AND PUT IN FORCES AND MOVEMENT
 */
public class TwoForcesClockwiseObjectAcceleration {

    private double mass;
    private double force1;
    private double angle1;
    private double force2;
    private double angle2;

    public TwoForcesClockwiseObjectAcceleration(double mass, double force1, double angle1, double force2, double angle2) {
        this.mass = mass;
        this.force1 = force1;
        this.angle1 = angle1;
        this.force2 = force2;
        this.angle2 = angle2;
    }

    private double calc() {
        double force1x;
        double force1y;
        double force2x;
        double force2y;
        double totalX;
        double totalY;
        double totalForce;
        double acceleration;

        force1x = force1*Math.cos(Math.toRadians(angle1));
        force1y = -force1*Math.sin(Math.toRadians(angle2));

        force2x = force2*Math.sin(Math.toRadians(angle2));
        force2y = force2*Math.cos(Math.toRadians(angle2));

        totalX = force1x + force2x;
        totalY = force1y + force2y;

        totalForce = Math.sqrt(Math.pow(totalX, 2) + Math.pow(totalY, 2));

        acceleration = totalForce / mass;

        return acceleration;
    }

    public static void main(String[] args) {
        TwoForcesClockwiseObjectAcceleration twoForcesClockwiseObjectAcceleration = new TwoForcesClockwiseObjectAcceleration(56, 69, 56, 47, 32);
        System.out.println(twoForcesClockwiseObjectAcceleration.calc());
    }
}
