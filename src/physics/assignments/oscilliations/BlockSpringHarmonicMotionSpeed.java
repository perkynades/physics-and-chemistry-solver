package physics.assignments.oscilliations;

public class BlockSpringHarmonicMotionSpeed {

    private double mass;
    private double springConstant;
    private double dist;
    private double time;

    public BlockSpringHarmonicMotionSpeed(double mass, double springConstant, double dist, double time) {
        this.mass = mass;
        this.springConstant = springConstant;
        this.dist = dist;
        this.time = time;
    }

    private double calc() {
        double speed;

        speed = (-dist*Math.sqrt(springConstant/mass))*Math.sin((Math.sqrt(springConstant/mass)*time));

        return speed;
    }

    public static void main(String[] args) {
        BlockSpringHarmonicMotionSpeed blockSpringHarmonicMotionSpeed = new BlockSpringHarmonicMotionSpeed(1.23, 101.58, 0.04, 0.38);
        System.out.println(blockSpringHarmonicMotionSpeed.calc());
    }
}
