package physics.assignments.work;

public class BlockSlideDownBottomSpeed {

    private double angle;
    private double dist;

    public BlockSlideDownBottomSpeed(double angle, double dist) {
        this.angle = angle;
        this.dist = dist;
    }

    private double calc() {
        double acceleration;
        double speed;

        acceleration = 9.8*Math.sin(Math.toRadians(angle));

        speed = Math.sqrt(2*acceleration*dist);

        return speed;
    }

    public static void main(String[] args) {
        BlockSlideDownBottomSpeed blockSlideDownBottomSpeed = new BlockSlideDownBottomSpeed(16.9, 28);
        System.out.println(blockSlideDownBottomSpeed.calc());
    }
}
