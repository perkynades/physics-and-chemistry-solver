package physics.assignments.kinematicsInOneDimension;

public class InstananeosAccelerationAtTime {

    private double a;
    private double b;

    private double time;

    public InstananeosAccelerationAtTime(double a, double b, double time) {
        this.a = a;
        this.b = b;
        this.time = time;
    }

    private double calc() {
        double instAcceleration;

        instAcceleration = (6*a*time) - (2*b);

        return instAcceleration;
    }

    public static void main(String[] args) {
        InstananeosAccelerationAtTime instananeosAccelerationAtTime = new InstananeosAccelerationAtTime(2.4, 3.3, 2.2);
        System.out.println(instananeosAccelerationAtTime.calc());
    }
}
