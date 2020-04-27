package physics.assignments.rotationOfRigidBody;

public class SlenderUniformRodSecondAxisInertia {

    private double dist;
    private double mark1;
    private double mark2;

    public SlenderUniformRodSecondAxisInertia(double dist, double mark1, double mark2) {
        this.dist = dist;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    private double calc() {
        double ratio;

        ratio = ((Math.pow(dist, 2) / 12) + (Math.pow(mark1-mark2, 2))) / (Math.pow(dist, 2) / 12);

        return ratio;
    }

    public static void main(String[] args) {
        SlenderUniformRodSecondAxisInertia slenderUniformRodSecondAxisInertia = new SlenderUniformRodSecondAxisInertia(100, 50, 26);
        System.out.println(slenderUniformRodSecondAxisInertia.calc());
    }
}
