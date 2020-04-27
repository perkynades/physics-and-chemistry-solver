package physics.assignments.dynamicsStraightMovement;

public class FactoryRobotBeltDistance {

    private double mass;
    private double speed;
    private double kineticCoefficient;

    public FactoryRobotBeltDistance(double mass, double speed, double kineticCoefficient) {
        this.mass = mass;
        this.speed = speed;
        this.kineticCoefficient = kineticCoefficient;
    }

    private double calc() {
        double acceleration;
        double dist;

        acceleration = kineticCoefficient*9.8;

        dist = (Math.pow(speed, 2)) / (2*acceleration);

        return dist;
    }

    public static void main(String[] args) {
        FactoryRobotBeltDistance factoryRobotBeltDistance = new FactoryRobotBeltDistance(11, 3.9, 0.22);
        System.out.println(factoryRobotBeltDistance.calc());
    }
}
