package physics.assignments.TODOfix;

/**
 * TODO: FIX AND PUT IN KINEMATICS TWO DIMENSION
 */
public class BallThrownAirTime {

    private double angle;
    private double height;
    private double speed;

    public BallThrownAirTime(double angle, double height, double speed) {
        this.angle = angle;
        this.height = height;
        this.speed = speed;
    }

    private double calc() {
        double time;
        double v;

        v = speed*Math.sin(angle);

        time = (v + Math.sqrt(Math.pow(v, 2) + (4*4.9*height))) / 9.8;

        return time;
    }

    public static void main(String[] args) {
        BallThrownAirTime ballThrownAirTime = new BallThrownAirTime(51, 1.59, 12.6);
        System.out.println(ballThrownAirTime.calc());
    }
}
