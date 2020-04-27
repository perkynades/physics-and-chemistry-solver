package physics.assignments.newtonsThirdLaw;

public class TwoBlockTwoPulleyOneHangingAcceleration {

    private double massA;
    private double massB;

    public TwoBlockTwoPulleyOneHangingAcceleration(double massA, double massB) {
        this.massA = massA;
        this.massB = massB;
    }

    private double calc() {
        double acceleration;

        acceleration = (2*massB*9.8) / ((4*massB) + massA);

        return acceleration;
    }

    public static void main(String[] args) {
        TwoBlockTwoPulleyOneHangingAcceleration twoBlockTwoPulleyOneHangingAcceleration = new TwoBlockTwoPulleyOneHangingAcceleration(2.4, 6);
        System.out.println(twoBlockTwoPulleyOneHangingAcceleration.calc());
    }
}
