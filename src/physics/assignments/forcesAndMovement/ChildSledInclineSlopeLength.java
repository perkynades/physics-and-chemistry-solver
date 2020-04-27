package physics.assignments.forcesAndMovement;

public class ChildSledInclineSlopeLength {

    private double angle;
    private double time;

    public ChildSledInclineSlopeLength(double angle, double time) {
        this.angle = angle;
        this.time = time;
    }

    private double calc() {
        double dist;
        double acceleration;

        acceleration = (9.8)*(Math.sin(Math.toRadians(angle)));

        dist = (0.5)*(acceleration)*(Math.pow(time, 2));

        return dist;
    }

    public static void main(String[] args) {
        ChildSledInclineSlopeLength childSledInclineSlopeLength = new ChildSledInclineSlopeLength(12.4, 16.9);
        System.out.println(childSledInclineSlopeLength.calc());
    }
}
