package physics.assignments.work;

public class TravelerStrapTension {

    private double angle;
    private double work;
    private double dist;

    public TravelerStrapTension(double angle, double work, double dist) {
        this.angle = angle;
        this.work = work;
        this.dist = dist;
    }

    private double calc() {
        double force;

        force = work / (dist*Math.cos(Math.toRadians(angle)));

        return force;
    }

    public static void main(String[] args) {
        TravelerStrapTension travelerStrapTension = new TravelerStrapTension(20, 686, 12);
        System.out.println(travelerStrapTension.calc());
    }
}
