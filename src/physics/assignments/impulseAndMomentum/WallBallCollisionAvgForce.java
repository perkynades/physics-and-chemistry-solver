package physics.assignments.impulseAndMomentum;

public class WallBallCollisionAvgForce {

    private double mass;
    private double initSpeed;
    private double finalSpeed;
    private double time;

    public WallBallCollisionAvgForce(double mass, double initSpeed, double finalSpeed, double time) {
        this.mass = mass;
        this.initSpeed = initSpeed;
        this.finalSpeed = finalSpeed;
        this.time = time;
    }

    private double calc() {
        double momentum;
        double force;

        momentum = mass*(initSpeed+finalSpeed);

        force = momentum / (time/1000);

        return force;
    }

    public static void main(String[] args) {
        WallBallCollisionAvgForce wallBallCollisionAvgForce = new WallBallCollisionAvgForce(0.203, 22.2, 13.1, 70.3);
        System.out.println(wallBallCollisionAvgForce.calc());
    }
}
