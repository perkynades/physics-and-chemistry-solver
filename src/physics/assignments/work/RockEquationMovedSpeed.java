package physics.assignments.work;

public class RockEquationMovedSpeed {

    private double mass;
    private double dist;

    public RockEquationMovedSpeed(double mass, double dist) {
        this.mass = mass;
        this.dist = dist;
    }

    private double calc() {
        double speed;
        double work;

        work = (6*dist) - Math.pow(dist, 2) + (2*Math.pow(dist, 3));

        speed = Math.sqrt((2*work) / mass);

        return speed;
    }

    public static void main(String[] args) {
        RockEquationMovedSpeed rockEquationMovedSpeed = new RockEquationMovedSpeed(5.8, 5.9);
        System.out.println(rockEquationMovedSpeed.calc());
    }
}
