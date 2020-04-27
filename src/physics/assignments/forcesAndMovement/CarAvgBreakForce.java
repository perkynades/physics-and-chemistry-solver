package physics.assignments.forcesAndMovement;

public class CarAvgBreakForce {

    private double mass;
    private double initSpeed;
    private double dist;

    public CarAvgBreakForce(double mass, double initSpeed, double dist) {
        this.mass = mass;
        this.initSpeed = initSpeed;
        this.dist = dist;
    }

    private double calc() {
        double force;

        force = ((0.5 * mass * Math.pow(initSpeed, 2)) / dist) / 100;

        return force;
    }

    public static void main(String[] args) {
        CarAvgBreakForce carAvgBreakForce = new CarAvgBreakForce(1088, 283, 597);
        System.out.println(carAvgBreakForce.calc());
    }
}
