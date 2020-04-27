package physics.assignments.forcesAndMovement;

public class TwoForcesEquilibrium {

    private double force1;
    private double force2;

    public TwoForcesEquilibrium(double force1, double force2) {
        this.force1 = force1;
        this.force2 = force2;
    }

    private double calc() {
        double force3;

        force3 = -(force1 - force2);

        return force3;
    }

    public static void main(String[] args) {
        TwoForcesEquilibrium twoForcesEquilibrium = new TwoForcesEquilibrium(83, 24);
        System.out.println(twoForcesEquilibrium.calc());
    }
}
