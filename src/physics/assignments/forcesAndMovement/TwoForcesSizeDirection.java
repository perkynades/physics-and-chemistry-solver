package physics.assignments.forcesAndMovement;

public class TwoForcesSizeDirection {

    private double mass;
    private double force;
    private double acceleration;

    public TwoForcesSizeDirection(double mass, double force, double acceleration) {
        this.mass = mass;
        this.force = force;
        this.acceleration = acceleration;
    }

    private double calc() {
        double otherForce;

        otherForce = (mass*acceleration) - force;

        return otherForce;
    }

    public static void main(String[] args) {
        TwoForcesSizeDirection twoForcesSizeDirection = new TwoForcesSizeDirection(7.5, 12.5, 1);
        System.out.println(twoForcesSizeDirection.calc());
    }
}
