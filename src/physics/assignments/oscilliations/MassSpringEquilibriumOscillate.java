package physics.assignments.oscilliations;

public class MassSpringEquilibriumOscillate {

    private double mass;
    private double dist;

    public MassSpringEquilibriumOscillate(double mass, double dist) {
        this.mass = mass;
        this.dist = dist;
    }

    private double calc() {
        double frequency;

        frequency = (1/(2*Math.PI))*Math.sqrt(9.8/(dist/100));

        return frequency;
    }

    public static void main(String[] args) {
        MassSpringEquilibriumOscillate massSpringEquilibriumOscillate = new MassSpringEquilibriumOscillate(6.4, 2.22);
        System.out.println(massSpringEquilibriumOscillate.calc());
    }
}
