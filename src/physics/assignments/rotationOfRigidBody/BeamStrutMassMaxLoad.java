package physics.assignments.rotationOfRigidBody;

public class BeamStrutMassMaxLoad {

    private double mass;
    private double beamLength;
    private double strutLength;
    private double force;

    public BeamStrutMassMaxLoad(double mass, double beamLength, double strutLength, double force) {
        this.mass = mass;
        this.beamLength = beamLength;
        this.strutLength = strutLength;
        this.force = force;
    }

    private double calc() {
        double maxForce;
        double angle;

        // '4' is the length between the anchoring points of the beam and strut
        angle = Math.asin(4/strutLength);

        maxForce = ((force*(beamLength/2)*Math.sin(angle)) - (mass*9.8*(beamLength/2))) / (9.8*beamLength);

        return maxForce;
    }

    public static void main(String[] args) {
        BeamStrutMassMaxLoad beamStrutMassMaxLoad = new BeamStrutMassMaxLoad(114, 6, 5, 23754);
        System.out.println(beamStrutMassMaxLoad.calc());
    }
}
