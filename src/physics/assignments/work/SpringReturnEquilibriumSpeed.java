package physics.assignments.work;

public class SpringReturnEquilibriumSpeed {

    private double mass;
    private double dist;

    public SpringReturnEquilibriumSpeed(double mass, double dist) {
        this.mass = mass;
        this.dist = dist;
    }

    private double calc() {
        double integral;
        double speed;

        integral = ((2*Math.pow(dist, 2)) / 2) + (Math.pow(dist, 3) / 3);

        speed = Math.sqrt((2*integral) / mass);

        return speed;
    }

    public static void main(String[] args) {
        SpringReturnEquilibriumSpeed springReturnEquilibriumSpeed = new SpringReturnEquilibriumSpeed(2.39, 1.03);
        System.out.println(springReturnEquilibriumSpeed.calc());
    }
}
