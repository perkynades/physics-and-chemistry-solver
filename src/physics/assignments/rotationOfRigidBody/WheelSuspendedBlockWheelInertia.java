package physics.assignments.rotationOfRigidBody;

public class WheelSuspendedBlockWheelInertia {

    private double radius;
    private double dist;
    private double time;
    private double tension;

    public WheelSuspendedBlockWheelInertia(double radius, double dist, double time, double tension) {
        this.radius = radius;
        this.dist = dist;
        this.time = time;
        this.tension = tension;
    }

    private double calc() {
        double acceleration;
        double angleAcc;
        double inertia;

        acceleration = (2*dist) / (Math.pow(time, 2));

        angleAcc = acceleration/radius;

        inertia = (tension*radius) / angleAcc;

        return inertia;
    }

    public static void main(String[] args) {
        WheelSuspendedBlockWheelInertia wheelSuspendedBlockWheelInertia = new WheelSuspendedBlockWheelInertia(0.1, 2.4, 1, 15);
        System.out.println(wheelSuspendedBlockWheelInertia.calc());
    }
}
