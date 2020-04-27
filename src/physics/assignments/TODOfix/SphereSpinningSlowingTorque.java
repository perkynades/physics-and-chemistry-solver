package physics.assignments.TODOfix;

/**
 * TODO: FIX AND PUD IN ROTATION OF RIGID BODY
 */
public class SphereSpinningSlowingTorque {

    private double mass;
    private double diameter;
    private double angularVelocity;
    private double revolutions;

    public SphereSpinningSlowingTorque(double mass, double diameter, double angularVelocity, double revolutions) {
        this.mass = mass;
        this.diameter = diameter;
        this.angularVelocity = angularVelocity;
        this.revolutions = revolutions;
    }

    private double calc() {
        double avgAngVelocity;
        double w;
        double angDisplacement;
        double time;
        double angAcceleraiton;
        double l;
        double torque;

        avgAngVelocity = (angularVelocity) / 2;

        w = avgAngVelocity*2*Math.PI;

        angDisplacement = 2*Math.PI*revolutions;

        time = angDisplacement/w;

        angAcceleraiton = (angularVelocity*2*Math.PI)/time;

        l = (2/5)*mass*Math.pow((diameter/2), 2);

        torque = l * angAcceleraiton;

        return torque;
    }

    public static void main(String[] args) {
        SphereSpinningSlowingTorque sphereSpinningSlowingTorque = new SphereSpinningSlowingTorque(2.52, 43.36, 2.7, 19.6);
        System.out.println(sphereSpinningSlowingTorque.calc());
    }
}
