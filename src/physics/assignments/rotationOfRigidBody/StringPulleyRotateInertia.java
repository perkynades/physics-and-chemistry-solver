package physics.assignments.rotationOfRigidBody;

public class StringPulleyRotateInertia {

    private double radius;
    private double force;
    private double dist;
    private double time;

    public StringPulleyRotateInertia(double radius, double force, double dist, double time) {
        this.radius = radius;
        this.force = force;
        this.dist = dist;
        this.time = time;
    }

    private double calc() {
        double acceleraiton;
        double inertia;

        acceleraiton = dist/(0.5*Math.pow(time, 2));

        inertia = (force*Math.pow(radius/100, 2)) / acceleraiton;

        return inertia;
    }

    public static void main(String[] args) {
        StringPulleyRotateInertia stringPulleyRotateInertia = new StringPulleyRotateInertia(1.3, 32, 1.8, 4.8);
        System.out.println(stringPulleyRotateInertia.calc());
    }
}
