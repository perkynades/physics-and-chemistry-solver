package physics.assignments.rotationOfRigidBody;

public class RefrigiratorTipMaxDist {

    private double mass;
    private double tall;
    private double wide;
    private double coefficient;

    public RefrigiratorTipMaxDist(double mass, double tall, double wide, double coefficient) {
        this.mass = mass;
        this.tall = tall;
        this.wide = wide;
        this.coefficient = coefficient;
    }

    private double calc() {
        double height;

        height = (wide/100) / (tall*coefficient);

        return height;
    }

    public static void main(String[] args) {
        RefrigiratorTipMaxDist refrigiratorTipMaxDist = new RefrigiratorTipMaxDist(115.16, 1.96, 89.16, 0.26);
        System.out.println(refrigiratorTipMaxDist.calc());
    }
}
