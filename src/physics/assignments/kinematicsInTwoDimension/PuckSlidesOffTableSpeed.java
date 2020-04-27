package physics.assignments.kinematicsInTwoDimension;

public class PuckSlidesOffTableSpeed {

    public double initSpeed;
    public double height;

    public PuckSlidesOffTableSpeed(double initSpeed, double height) {
        this.initSpeed = initSpeed;
        this.height = height;
    }

    private double calc() {
        double speed;

        speed = Math.sqrt(Math.pow(initSpeed, 2) + (2*height*9.8));

        return speed;
    }

    public static void main(String[] args) {
        PuckSlidesOffTableSpeed puckSlidesOffTableSpeed = new PuckSlidesOffTableSpeed(11.8, 1.41);
        System.out.println(puckSlidesOffTableSpeed.calc());
    }
}
