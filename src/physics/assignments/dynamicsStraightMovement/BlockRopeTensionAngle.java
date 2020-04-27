package physics.assignments.dynamicsStraightMovement;

public class BlockRopeTensionAngle {

    private double horizontalTension;
    private double ceilingTension;

    public BlockRopeTensionAngle(double horizontalTension, double ceilingTension) {
        this.horizontalTension = horizontalTension;
        this.ceilingTension = ceilingTension;
    }

    private double calc() {
        double angle;

        angle = Math.toDegrees(Math.acos(horizontalTension/ceilingTension));

        return angle;
    }

    public static void main(String[] args) {
        BlockRopeTensionAngle blockRopeTensionAngle = new BlockRopeTensionAngle(64, 85);
        System.out.println(blockRopeTensionAngle.calc());
    }
}
