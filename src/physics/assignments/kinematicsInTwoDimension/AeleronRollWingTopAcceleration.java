package physics.assignments.kinematicsInTwoDimension;

public class AeleronRollWingTopAcceleration {

    private float time;
    private float radius;

    public AeleronRollWingTopAcceleration(float time, float wingspan) {
        this.time = time;
        this.radius = wingspan / 2;
    }

    private double calc() {
        double acceleration;
        double velocity;

        velocity = (2*Math.PI*radius) / time;

        acceleration = velocity/radius;

        return acceleration;
    }

    public static void main(String[] args) {
        AeleronRollWingTopAcceleration aeleronRollWingTopAcceleration = new AeleronRollWingTopAcceleration(33, 11);
        System.out.println(aeleronRollWingTopAcceleration.calc());
    }
}
