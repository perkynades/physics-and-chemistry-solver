package physics.assignments.newtonsThirdLaw;

public class OnePulleyTwoBlockHangingMass {

    private double mass;
    private double dist;
    private double time;

    public OnePulleyTwoBlockHangingMass(double mass, double dist, double time) {
        this.mass = mass;
        this.dist = dist;
        this.time = time;
    }

    private double calc() {
        double massSmall;
        double acceleration;

        acceleration = (2*dist) / Math.pow(time, 2);

        massSmall = (mass*(9.8-acceleration)) / (acceleration+9.8);

        return massSmall;
    }

    public static void main(String[] args) {
        OnePulleyTwoBlockHangingMass onePulleyTwoBlockHangingMass = new OnePulleyTwoBlockHangingMass(100, 1, 0.9);
        System.out.println(onePulleyTwoBlockHangingMass.calc());
    }
}
