package physics.assignments.dynamicsStraightMovement;

public class BoxHorizontalRightForce {

    private double mass;
    private double time;
    private double dist;

    public BoxHorizontalRightForce(double mass, double time, double dist) {
        this.mass = mass;
        this.time = time;
        this.dist = dist;
    }

    private double calc() {
        double acceleration;
        double force;

        acceleration = dist / (0.5*Math.pow(time, 2));

        force = mass*acceleration;

        return force;
    }

    public static void main(String[] args) {
        BoxHorizontalRightForce boxHorizontalRightForce = new BoxHorizontalRightForce(48, 6.4, 18);
        System.out.println(boxHorizontalRightForce.calc());
    }
}
