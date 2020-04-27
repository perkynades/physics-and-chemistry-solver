package physics.assignments.rotationOfRigidBody;

public class WrenchNutTorque {

    private double mass;
    private double force;
    private double dist;
    private double angle;

    public WrenchNutTorque(double mass, double force, double dist, double angle) {
        this.mass = mass;
        this.force = force;
        this.dist = dist;
        this.angle = angle;
    }

    private double calc() {
        double torque;

        torque = (dist/100)*force*Math.sin(Math.toRadians(angle));

        return torque;
    }

    public static void main(String[] args) {
        WrenchNutTorque wrenchNutTorque = new WrenchNutTorque(1.6, 183.5, 11.4, 39.5);
        System.out.println(wrenchNutTorque.calc());
    }
}
