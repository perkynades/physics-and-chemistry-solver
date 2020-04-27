package physics.assignments.rotationOfRigidBody;

public class MassLightStringCylinderDropTime {

    private double mass;
    private double radius;
    private double inertia;
    private double dist;

    public MassLightStringCylinderDropTime(double mass, double radius, double inertia, double dist) {
        this.mass = mass;
        this.radius = radius;
        this.inertia = inertia;
        this.dist = dist;
    }

    private double calc() {
        double torque;
        double angularAcc;
        double acceleration;
        double time;

        torque = (radius/100)*mass*9.8*Math.sin(90);

        angularAcc = torque / inertia;

        acceleration = angularAcc*(radius/100);

        time = Math.sqrt(dist / (0.5*acceleration));

        return time;
    }

    public static void main(String[] args) {
        MassLightStringCylinderDropTime massLightStringCylinderDropTime = new MassLightStringCylinderDropTime(27, 14, 2.72, 3.7);
        System.out.println(massLightStringCylinderDropTime.calc());
    }
}
