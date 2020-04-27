package physics.assignments.dynamicsStraightMovement;

public class ElevatorScaleReading {

    private double mass;
    private double acceleration;

    public ElevatorScaleReading(double mass, double acceleration) {
        this.mass = mass;
        this.acceleration = acceleration;
    }

    private double calc() {
        double reading;

        reading = mass*(9.8+acceleration);

        return reading;
    }

    public static void main(String[] args) {
        ElevatorScaleReading elevatorScaleReading = new ElevatorScaleReading(51.8, 1.62);
        System.out.println(elevatorScaleReading.calc());
    }
}
