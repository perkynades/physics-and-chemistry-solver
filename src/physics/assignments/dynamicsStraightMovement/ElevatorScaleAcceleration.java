package physics.assignments.dynamicsStraightMovement;

public class ElevatorScaleAcceleration {

    private double mass;
    private double weight;

    public ElevatorScaleAcceleration(double mass, double weight) {
        this.mass = mass;
        this.weight = weight;
    }

    private double calc() {
        double acceleration;

        acceleration = 9.8 - (weight / mass);

        return -acceleration;
    }

    public static void main(String[] args) {
        ElevatorScaleAcceleration elevatorScaleAcceleration = new ElevatorScaleAcceleration(53.6, 217);
        System.out.println(elevatorScaleAcceleration.calc());
    }
}
