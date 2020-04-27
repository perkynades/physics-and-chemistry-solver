package physics.assignments.kinematicsInOneDimension;

public class PoliceCarAcceleration {

    private double speed;
    private double time;
    private double dist;

    public PoliceCarAcceleration(double speed, double time, double dist) {
        this.speed = speed;
        this.time = time;
        this.dist = dist;
    }

    private double calc() {
        double carTime;
        double policeSpeed;
        double policeAcceleration;

        carTime = (dist / speed) - time;

        policeSpeed = dist / carTime;

        policeAcceleration = Math.pow(policeSpeed, 2)/dist*2;

        return policeAcceleration;
    }

    public static void main(String[] args) {
        PoliceCarAcceleration policeCarAcceleration = new PoliceCarAcceleration(32.7, 0.81, 200);
        System.out.println(policeCarAcceleration.calc());
    }
}
