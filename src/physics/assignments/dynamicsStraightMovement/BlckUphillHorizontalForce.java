package physics.assignments.dynamicsStraightMovement;

public class BlckUphillHorizontalForce {

    private double mass;
    private double angle;
    private double coefficient;

    public BlckUphillHorizontalForce(double mass, double angle, double coefficient) {
        this.mass = mass;
        this.angle = angle;
        this.coefficient = coefficient;
    }

    private double calc() {
        double force;

        force = (((coefficient*Math.cos(Math.toRadians(angle))) + Math.sin(Math.toRadians(angle))) /(Math.cos(Math.toRadians(angle)) - (coefficient*Math.sin(Math.toRadians(angle))))) *mass*9.8;

        return force;
    }

    public static void main(String[] args) {
        BlckUphillHorizontalForce blckUphillHorizontalForce = new BlckUphillHorizontalForce(3.34, 23.9, 0.523);
        System.out.println(blckUphillHorizontalForce.calc());
    }
}
