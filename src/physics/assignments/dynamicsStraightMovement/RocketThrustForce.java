package physics.assignments.dynamicsStraightMovement;

public class RocketThrustForce {

    private double mass;
    private double acceleration;

    public RocketThrustForce(double mass, double acceleration) {
        this.mass = mass;
        this.acceleration = acceleration;
    }

    private double calc() {
        double thrust;

        thrust = mass*(9.8+acceleration);

        return thrust / 1000;
    }

    public static void main(String[] args) {
        RocketThrustForce rocketThrustForce = new RocketThrustForce(10123, 2.16);
        System.out.println(rocketThrustForce.calc());
    }
}
