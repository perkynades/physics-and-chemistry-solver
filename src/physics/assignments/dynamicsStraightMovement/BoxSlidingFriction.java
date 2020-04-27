package physics.assignments.dynamicsStraightMovement;

public class BoxSlidingFriction {

    private double weight;
    private double speed;
    private double time;

    public BoxSlidingFriction(double weight, double speed, double time) {
        this.weight = weight;
        this.speed = speed;
        this.time = time;
    }

    private double calc() {
        double friction;
        double acceleration;
        double mass;

        acceleration = speed / time;

        mass = weight / 9.8;

        friction = mass * acceleration;

        return friction;
    }

    public static void main(String[] args) {
        BoxSlidingFriction boxSlidingFriction = new BoxSlidingFriction(42.5, 1.19, 2);
        System.out.println(boxSlidingFriction.calc());
    }
}
