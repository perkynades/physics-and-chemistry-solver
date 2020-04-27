package physics.assignments.dynamicsStraightMovement;

public class SuffleboardPuckInitSpeed {

    private double dist;
    private double coefficient;

    public SuffleboardPuckInitSpeed(double dist, double coefficient) {
        this.dist = dist;
        this.coefficient = coefficient;
    }

    private double calc() {
        double speed;

        speed = Math.sqrt(2*coefficient*9.8*dist);

        return speed;
    }

    public static void main(String[] args) {
        SuffleboardPuckInitSpeed suffleboardPuckInitSpeed = new SuffleboardPuckInitSpeed(12, 0.23);
        System.out.println(suffleboardPuckInitSpeed.calc());
    }
}
