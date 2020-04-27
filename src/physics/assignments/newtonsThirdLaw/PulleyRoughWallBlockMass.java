package physics.assignments.newtonsThirdLaw;

public class PulleyRoughWallBlockMass {

    private double mass;
    private double force;
    private double staticCoefficient;
    private double kineticCoefficient;
    private double acceleration;

    public PulleyRoughWallBlockMass(double mass, double force, double staticCoefficient, double kineticCoefficient, double acceleration) {
        this.mass = mass;
        this.force = force;
        this.staticCoefficient = staticCoefficient;
        this.kineticCoefficient = kineticCoefficient;
        this.acceleration = acceleration;
    }

    private double calc() {
        double massX;
        double frictionForce;

        frictionForce = kineticCoefficient*force;

        massX = (-(mass*9.8)-frictionForce-(acceleration*mass)) / (acceleration-9.8);

        return massX;
    }

    public static void main(String[] args) {
        PulleyRoughWallBlockMass pulleyRoughWallBlockMass = new PulleyRoughWallBlockMass(5.6, 61, 0.4, 0.3, 2.5);
        System.out.println(pulleyRoughWallBlockMass.calc());
    }
}
