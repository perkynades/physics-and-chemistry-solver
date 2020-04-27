package physics.assignments.kinematicsInOneDimension;

public class RollingBallInitialSpeed {

    private double acceleration;
    private double velocity;
    private double dist;

    public RollingBallInitialSpeed(double acceleration, double velocity, double dist) {
        this.acceleration = acceleration;
        this.velocity = velocity;
        this.dist = dist;
    }

    private double calc() {
        double initSpeed;

        initSpeed = Math.sqrt(Math.pow(velocity, 2) + (2*acceleration*dist));

        return initSpeed;
    }

    public static void main(String[] args) {
        RollingBallInitialSpeed rollingBallInitialSpeed = new RollingBallInitialSpeed(0.064, 4.22, 6.4);
        System.out.println("When inserting acceleration, remember to not include the '-' in the field");
        System.out.println(rollingBallInitialSpeed.calc());
    }
}
