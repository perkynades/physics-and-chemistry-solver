package physics.assignments.rotationOfRigidBody;

public class TurntableBallHitTurntableAngularVelocity {

    private double radius;
    private double inertia;
    private double initAngularVelocity;
    private double ballMass;
    private double ballSpeed;

    public TurntableBallHitTurntableAngularVelocity(double radius, double inertia, double initAngularVelocity, double ballMass, double ballSpeed) {
        this.radius = radius;
        this.inertia = inertia;
        this.initAngularVelocity = initAngularVelocity;
        this.ballMass = ballMass;
        this.ballSpeed = ballSpeed;
    }

    private double calc() {
        double lTable;
        double finalAngularVelocty;

        lTable = inertia*initAngularVelocity;

        finalAngularVelocty = lTable / (inertia + (ballMass*Math.pow(radius, 2)));

        return finalAngularVelocty;
    }

    public static void main(String[] args) {
        TurntableBallHitTurntableAngularVelocity turntableBallHitTurntableAngularVelocity = new TurntableBallHitTurntableAngularVelocity(0.8, 2.3, 1.8, 0.2, 2.6);
        System.out.println(turntableBallHitTurntableAngularVelocity.calc());
    }
}
