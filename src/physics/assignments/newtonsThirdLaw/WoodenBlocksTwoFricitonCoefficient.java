package physics.assignments.newtonsThirdLaw;

public class WoodenBlocksTwoFricitonCoefficient {

    private double mass;
    private double time;
    private double dist;

    public WoodenBlocksTwoFricitonCoefficient(double mass, double time, double dist) {
        this.mass = mass;
        this.time = time;
        this.dist = dist;
    }

    private double calc() {
        double tension;
        double acceleration;
        double coefficient;

        acceleration = (2*dist) / (Math.pow(time, 2));

        tension = mass*(9.8 - acceleration);

        coefficient = -(((mass*acceleration) - tension) / (mass*9.8));
        return coefficient;
    }

    public static void main(String[] args) {
        WoodenBlocksTwoFricitonCoefficient woodenBlocksTwoFricitonCoefficient = new WoodenBlocksTwoFricitonCoefficient(0.28, 2, 0.8);
        System.out.println(woodenBlocksTwoFricitonCoefficient.calc());
    }
}
