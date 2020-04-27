package physics.assignments.kinematicsInTwoDimension;

public class BallCableRevolutionsAcceleration {

    private double radius;
    private double revolutions;
    private double time;

    public BallCableRevolutionsAcceleration(double radius, double revolutions, double time) {
        this.radius = radius;
        this.revolutions = revolutions;
        this.time = time;
    }

    private double calc() {
        double angleSpeed;
        double acceleration;

        angleSpeed = (2*Math.PI*revolutions) / time;

        acceleration = radius * Math.pow(angleSpeed, 2);

        return acceleration;
    }

    public static void main(String[] args) {
        BallCableRevolutionsAcceleration ballCableRevolutionsAcceleration = new BallCableRevolutionsAcceleration(1.33, 5.23, 7.1);
        System.out.println(ballCableRevolutionsAcceleration.calc());
    }
}
