package physics.assignments.dynamicsStraightMovement;

public class BlockPulledUpFricitonAcceleration {

    private double mass;
    private double angle;
    private double force;
    private double coefficient;

    public BlockPulledUpFricitonAcceleration(double mass, double angle, double force, double coefficient) {
        this.mass = mass;
        this.angle = angle;
        this.force = force;
        this.coefficient = coefficient;
    }

    private double calc() {
        double acceleration;

        acceleration = (force/mass) - (9.8*(Math.sin(Math.toRadians(angle)) + (coefficient*Math.cos(Math.toRadians(angle)))));

        return acceleration;
    }

    public static void main(String[] args) {
        BlockPulledUpFricitonAcceleration blockPulledUpFricitonAcceleration = new BlockPulledUpFricitonAcceleration(35.4, 12.3, 234, 0.173);
        System.out.println(blockPulledUpFricitonAcceleration.calc());
    }
}
