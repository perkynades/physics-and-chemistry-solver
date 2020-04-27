package physics.assignments.rotationOfRigidBody;

public class ThinRodHingeAcceleration {

    private double length;
    private double weight;
    private double angle;

    public ThinRodHingeAcceleration(double length, double weight, double angle) {
        this.length = length;
        this.weight = weight;
        this.angle = angle;
    }

    private double calc() {
        double inertia;
        double acceleration;

        inertia = 1.5*((9.8*Math.sin(Math.toRadians(angle))) / length);

        acceleration = inertia*length;

        return acceleration;
    }

    public static void main(String[] args) {
        ThinRodHingeAcceleration thinRodHingeAcceleration = new ThinRodHingeAcceleration(2.84, 43, 40);
        System.out.println(thinRodHingeAcceleration.calc());
    }
}
