package physics.assignments.dynamicsStraightMovement;

public class JasonSkiThrustTopSpeed {

    private double mass;
    private double thrust;
    private double frictionCoeffecient;
    private double time;

    public JasonSkiThrustTopSpeed(double mass, double thrust, double frictionCoeffecient, double time) {
        this.mass = mass;
        this.thrust = thrust;
        this.frictionCoeffecient = frictionCoeffecient;
        this.time = time;
    }

    private double calc() {
        double frictionForce;
        double acceleration;
        double topSpeed;

        frictionForce = frictionCoeffecient*mass*9.80;

        acceleration = (thrust - frictionForce) / mass;

        topSpeed = acceleration*time;

        return topSpeed;
    }

    public static void main(String[] args) {
        JasonSkiThrustTopSpeed jasonSkiThrustTopSpeed = new JasonSkiThrustTopSpeed(78, 184, 0.18, 56);
        System.out.println(jasonSkiThrustTopSpeed.calc());
    }
}
