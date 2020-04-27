package physics.assignments.work;

public class BallThrownUpwardsReleaseSpeed {

    private double dist;
    private double speed;

    public BallThrownUpwardsReleaseSpeed(double dist, double speed) {
        this.dist = dist;
        this.speed = speed;
    }

    private double calc() {
        double speedY;
        double initSpeed;

        speedY = Math.sqrt(2*dist*9.8);

        initSpeed = Math.sqrt(Math.pow(speed, 2) + Math.pow(speedY, 2));

        return initSpeed;
    }

    public static void main(String[] args) {
        BallThrownUpwardsReleaseSpeed ballThrownUpwardsReleaseSpeed = new BallThrownUpwardsReleaseSpeed(24.6, 14.7);
        System.out.println(ballThrownUpwardsReleaseSpeed.calc());
    }
}
