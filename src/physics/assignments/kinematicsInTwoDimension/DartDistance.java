package physics.assignments.kinematicsInTwoDimension;

public class DartDistance {

    private double velocity;

    public DartDistance(double velocity) {
        this.velocity = velocity;
    }

    private double calc() {
        double dist;

        dist = Math.pow(velocity, 2) / 9.81;

        return dist;
    }

    public static void main(String[] args) {
        DartDistance dartDistance = new DartDistance(2.64);
        System.out.println(dartDistance.calc());
    }
}
