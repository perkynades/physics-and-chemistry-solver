package physics.assignments.rotationOfRigidBody;

public class ThreeCylindricalFlywheelsAngMomentum {

    private double mass;
    private double radius;
    private double radsTwo;
    private double radsOne;

    public ThreeCylindricalFlywheelsAngMomentum(double mass, double radius, double radsTwo, double radsOne) {
        this.mass = mass;
        this.radius = radius;
        this.radsTwo = radsTwo;
        this.radsOne = radsOne;
    }

    private double calc() {
        double angMomentum;
        double inertia;

        inertia = (mass*Math.pow(radius, 2)) / 2;

        angMomentum = inertia*((2*radsTwo) - radsOne);

        return angMomentum;
    }

    public static void main(String[] args) {
        ThreeCylindricalFlywheelsAngMomentum threeCylindricalFlywheelsAngMomentum = new ThreeCylindricalFlywheelsAngMomentum(54, 2.08, 3.27, 3.78);
        System.out.println(threeCylindricalFlywheelsAngMomentum.calc());
    }
}
