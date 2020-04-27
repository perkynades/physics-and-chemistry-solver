package physics.assignments.dynamicsStraightMovement;

public class BumberCarStopCarForce {

    private double mass;
    private double speed;
    private double dist;

    public BumberCarStopCarForce(double mass, double speed, double dist) {
        this.mass = mass;
        this.speed = speed;
        this.dist = dist;
    }

    private double calc() {
        double acceleration;
        double force;

        acceleration = (Math.pow(speed, 2)) / (2*(dist));

        force = mass*acceleration;

        return force / 10;
    }

    public static void main(String[] args) {
        BumberCarStopCarForce bumberCarStopCarForce = new BumberCarStopCarForce(1263, 1, 0.13);
        System.out.println(bumberCarStopCarForce.calc());
    }
}
