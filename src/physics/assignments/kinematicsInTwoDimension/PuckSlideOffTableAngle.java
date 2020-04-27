package physics.assignments.kinematicsInTwoDimension;

public class PuckSlideOffTableAngle {

    private double velocityX;
    private double height;

    public PuckSlideOffTableAngle(double velocityX, double height) {
        this.velocityX = velocityX;
        this.height = height;
    }

    private double calc() {
        double velocityY;
        double angle;

        velocityY = Math.sqrt(2*9.81*height);

        angle = Math.atan(velocityY/velocityX)*57.29;

        return angle;
    }

    public static void main(String[] args) {
        PuckSlideOffTableAngle puckSlideOffTableAngle = new PuckSlideOffTableAngle(21.5, 3.7);
        System.out.println(puckSlideOffTableAngle.calc());
    }
}
