package physics.assignments.newtonsThirdLaw;

public class BlockRestingOnBlockForce {

    private double massUpper;
    private double massLower;
    private double coefficient;

    public BlockRestingOnBlockForce(double massUpper, double massLower, double coefficient) {
        this.massUpper = massUpper;
        this.massLower = massLower;
        this.coefficient = coefficient;
    }

    private double calc() {
        double force;

        force = (coefficient*massUpper*9.8) + (coefficient*(massUpper+massLower)*9.8);

        return force;
    }

    public static void main(String[] args) {
        BlockRestingOnBlockForce blockRestingOnBlockForce = new BlockRestingOnBlockForce(3, 4, 0.888);
        System.out.println(blockRestingOnBlockForce.calc());
    }
}
