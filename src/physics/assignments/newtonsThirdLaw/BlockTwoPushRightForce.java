package physics.assignments.newtonsThirdLaw;

public class BlockTwoPushRightForce {

    private double biggestMass;
    private double smallestMass;
    private double force;

    public BlockTwoPushRightForce(double biggestMass, double smallestMass, double force) {
        this.biggestMass = biggestMass;
        this.smallestMass = smallestMass;
        this.force = force;
    }

    private double calc() {
        double forceApplied;
        double acceleration;

        acceleration = force / (smallestMass+biggestMass);

        forceApplied = smallestMass*acceleration;

        return forceApplied;
    }

    public static void main(String[] args) {
        BlockTwoPushRightForce blockTwoPushRightForce = new BlockTwoPushRightForce(6, 4, 20);
        System.out.println(blockTwoPushRightForce.calc());
    }
}
