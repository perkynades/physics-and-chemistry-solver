package physics.assignments.newtonsThirdLaw;

public class WeightsThreeSmallestTension {

    private double acceleration;
    private double biggestMass;

    public WeightsThreeSmallestTension(double acceleration, double biggestMass) {
        this.acceleration = acceleration;
        this.biggestMass = biggestMass;
    }

    private double calc() {
        double tension;

        tension = biggestMass *(9.8+acceleration);

        return tension;
    }

    public static void main(String[] args) {
        WeightsThreeSmallestTension weightsThreeSmallestTension = new WeightsThreeSmallestTension(4.09, 20);
        System.out.println(weightsThreeSmallestTension.calc());
    }
}
