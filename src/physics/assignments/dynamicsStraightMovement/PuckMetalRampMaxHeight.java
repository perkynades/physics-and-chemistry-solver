package physics.assignments.dynamicsStraightMovement;

public class PuckMetalRampMaxHeight {

    private double mass;
    private double angle;
    private double kineticCoeffisient;
    private double speed;

    public PuckMetalRampMaxHeight(double mass, double angle, double kineticCoeffisient, double speed) {
        this.mass = mass;
        this.angle = angle;
        this.kineticCoeffisient = kineticCoeffisient;
        this.speed = speed;
    }

    private double calc() {
        double acceleration;
        double dist;
        double height;

        acceleration = -9.81*(Math.sin(Math.toRadians(angle)) + (kineticCoeffisient*Math.cos(Math.toRadians(angle))));

        dist = -(Math.pow(speed, 2)) / (2*acceleration);

        height = (dist*Math.sin(Math.toRadians(angle)));

        return height;
    }

    public static void main(String[] args) {
        PuckMetalRampMaxHeight puckMetalRampMaxHeight = new PuckMetalRampMaxHeight(195, 33, 0.23, 3.3);
        System.out.println(puckMetalRampMaxHeight.calc());
    }
}
