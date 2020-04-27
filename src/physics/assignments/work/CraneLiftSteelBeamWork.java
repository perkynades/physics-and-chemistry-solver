package physics.assignments.work;

public class CraneLiftSteelBeamWork {

    private double mass;
    private double dist;
    private double acceleration;

    public CraneLiftSteelBeamWork(double mass, double dist, double acceleration) {
        this.mass = mass;
        this.dist = dist;
        this.acceleration = acceleration;
    }

    private double calc() {
        double work;
        double force;

        force = mass*(9.8+acceleration);

        work = force*dist;

        return work / 1000;
    }

    public static void main(String[] args) {
        CraneLiftSteelBeamWork craneLiftSteelBeamWork = new CraneLiftSteelBeamWork(399, 118, 0.8);
        System.out.println(craneLiftSteelBeamWork.calc());
    }
}
