package physics.assignments.newtonsThirdLaw;

public class TwoRopeRopeOneTension {

    private double mass;
    private double ropeMass;
    private double acceleration;

    public TwoRopeRopeOneTension(double mass, double ropeMass, double acceleration) {
        this.mass = mass;
        this.ropeMass = ropeMass;
        this.acceleration = acceleration;
    }

    private double calc() {
        double force;
        double tension;

        force = (mass+(ropeMass/100)+mass+(ropeMass/100))*(9.8+acceleration);

        tension = force-9.8-acceleration;

        return tension / 2;
    }

    public static void main(String[] args) {
        TwoRopeRopeOneTension twoRopeRopeOneTension = new TwoRopeRopeOneTension(52, 162, 2);
        System.out.println(twoRopeRopeOneTension.calc());
    }
}
