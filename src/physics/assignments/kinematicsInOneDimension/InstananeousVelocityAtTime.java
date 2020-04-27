package physics.assignments.kinematicsInOneDimension;

public class InstananeousVelocityAtTime {

    private double b;
    private double c;
    private double time;

    public InstananeousVelocityAtTime(double b, double c, double time) {
        this.b = b;
        this.c = c;
        this.time = time;
    }

    private double calc() {
        double instanteneousVelocity;

        instanteneousVelocity = (2*this.b) * this.time - this.c;

        return instanteneousVelocity;
    }

    public static void main(String[] args) {
        InstananeousVelocityAtTime instananeousVelocityAtTime = new InstananeousVelocityAtTime(1.5, 7, 1.8);
        System.out.println(instananeousVelocityAtTime.calc());

    }
}
