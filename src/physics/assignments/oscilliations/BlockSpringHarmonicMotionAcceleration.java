package physics.assignments.oscilliations;

public class BlockSpringHarmonicMotionAcceleration {

    private double mass;
    private double springConstant;
    private double dist;
    private double distPoint;

    public BlockSpringHarmonicMotionAcceleration(double mass, double springConstant, double dist, double distPoint) {
        this.mass = mass;
        this.springConstant = springConstant;
        this.dist = dist;
        this.distPoint = distPoint;
    }

    private double calc() {
        double acceleration;

        acceleration = (-springConstant/mass)*distPoint;

        return acceleration;
    }

    public static void main(String[] args) {
        BlockSpringHarmonicMotionAcceleration blockSpringHarmonicMotionAcceleration = new BlockSpringHarmonicMotionAcceleration(0.23, 475.39, 0.07, -0.048);
        System.out.println(blockSpringHarmonicMotionAcceleration.calc());
    }
}
