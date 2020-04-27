package physics.assignments.kinematicsInTwoDimension;

public class BoyRockMaxHeightTime {

    private double speed;
    private double angle;

    public BoyRockMaxHeightTime(double speed, double angle) {
        this.speed = speed;
        this.angle = angle;
    }

    private double calc() {
        double time;
        double velocity = (speed)*(Math.sin(angle));

        time = velocity / 9.8;

        return time;
    }

    public static void main(String[] args) {
        BoyRockMaxHeightTime boyRockMaxHeightTime = new BoyRockMaxHeightTime(2.16, 24.9);
        System.out.println(boyRockMaxHeightTime.calc());
    }
}
