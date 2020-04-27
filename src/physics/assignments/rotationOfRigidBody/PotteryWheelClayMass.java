package physics.assignments.rotationOfRigidBody;

public class PotteryWheelClayMass {

    private double inertia;
    private double initRPM;
    private double finalRPM;
    private double dist;

    public PotteryWheelClayMass(double inertia, double initRPM, double finalRPM, double dist) {
        this.inertia = inertia;
        this.initRPM = initRPM;
        this.finalRPM = finalRPM;
        this.dist = dist;
    }

    private double calc() {
        double mass;

        mass = (inertia*((initRPM/finalRPM) - 1)) / (Math.pow(dist, 2));

        return mass;
    }

    public static void main(String[] args) {
        PotteryWheelClayMass potteryWheelClayMass = new PotteryWheelClayMass(44.53, 43.26, 28.96, 2.13);
        System.out.println(potteryWheelClayMass.calc());
    }
}
