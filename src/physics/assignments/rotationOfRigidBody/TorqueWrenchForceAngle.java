package physics.assignments.rotationOfRigidBody;

public class TorqueWrenchForceAngle {

    private double force;
    private double dist;
    private double torque;

    public TorqueWrenchForceAngle(double force, double dist, double torque) {
        this.force = force;
        this.dist = dist;
        this.torque = torque;
    }

    private double calc() {
        double angle;

        angle = Math.asin(torque / (force*dist));

        return Math.toDegrees(angle);
    }

    public static void main(String[] args) {
        TorqueWrenchForceAngle torqueWrenchForceAngle = new TorqueWrenchForceAngle(66.8, 0.4, 12.8);
        System.out.println(torqueWrenchForceAngle.calc());
    }
}
