package physics.assignments.dynamicsMotionInAPlane;

public class CarHilltopLooseContactSpeed {

    private double radius;

    public CarHilltopLooseContactSpeed(double radius) {
        this.radius = radius;
    }

    private double calc() {
        double speed;

        speed = Math.sqrt(9.8*(radius*1000));

        return speed;
    }

    public static void main(String[] args) {
        CarHilltopLooseContactSpeed carHilltopLooseContactSpeed = new CarHilltopLooseContactSpeed(0.167);
        System.out.println(carHilltopLooseContactSpeed.calc());
    }
}
