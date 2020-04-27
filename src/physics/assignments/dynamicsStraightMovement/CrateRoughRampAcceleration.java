package physics.assignments.dynamicsStraightMovement;

public class CrateRoughRampAcceleration {

    private double mass;
    private double angle;
    private double coefficient;
    private double force;

    public CrateRoughRampAcceleration(double mass, double angle, double coefficient, double force) {
        this.mass = mass;
        this.angle = angle;
        this.coefficient = coefficient;
        this.force = force;
    }

    private double calc() {
        double friction;
        double acceleration;
        double normal;

        normal = (Math.sin(Math.toRadians(angle))*force) + (mass*9.8*Math.cos(Math.toRadians(angle)));

        friction = coefficient*normal;

        acceleration = ((force*Math.cos(Math.toRadians(angle))) - (friction + (mass*9.8*Math.sin(Math.toRadians(angle))))) / mass;

        return acceleration;
    }

    public static void main(String[] args) {
        CrateRoughRampAcceleration crateRoughRampAcceleration = new CrateRoughRampAcceleration(327, 26, 0.26, 4133);
        System.out.println(crateRoughRampAcceleration.calc());
    }
}
