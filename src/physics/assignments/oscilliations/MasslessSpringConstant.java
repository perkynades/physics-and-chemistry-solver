package physics.assignments.oscilliations;

public class MasslessSpringConstant {

    private double weigth;
    private double period;

    public MasslessSpringConstant(double weigth, double period) {
        this.weigth = weigth;
        this.period = period;
    }

    private double calc() {
        double mass;
        double angularSpeed;
        double constant;

        mass = weigth/9.8;

        angularSpeed = (2*Math.PI)/period;

        constant = mass*Math.pow(angularSpeed, 2);

        return constant;
    }

    public static void main(String[] args) {
        MasslessSpringConstant massSpringEquilibriumOscillate = new MasslessSpringConstant(2.729, 0.377);
        System.out.println(massSpringEquilibriumOscillate.calc());
    }
}
