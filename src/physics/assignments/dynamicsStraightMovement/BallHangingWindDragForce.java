package physics.assignments.dynamicsStraightMovement;

public class BallHangingWindDragForce {

    private double mass;
    private double angle;
    private double speed;

    public BallHangingWindDragForce(double mass, double angle, double speed) {
        this.mass = mass;
        this.angle = angle;
        this.speed = speed;
    }

    private double calc() {
        double force;
        double acceleration;

        acceleration = 9.8*Math.tan(Math.toRadians(angle));

        force = (mass*acceleration);

        return force;
    }

    public static void main(String[] args) {
        BallHangingWindDragForce ballHangingWindDragForce = new BallHangingWindDragForce(1.2, 22, 24.6);
        System.out.println(ballHangingWindDragForce.calc());
    }
}
