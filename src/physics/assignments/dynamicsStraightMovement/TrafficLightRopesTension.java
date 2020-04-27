package physics.assignments.dynamicsStraightMovement;

public class TrafficLightRopesTension {

    private double weight;
    private double angle;

    public TrafficLightRopesTension(double weight, double angle) {
        this.weight = weight;
        this.angle = angle;
    }

    private double calc() {
        double tension;

        tension = weight / (2*Math.sin(Math.toRadians(angle)));

        return tension;
    }

    public static void main(String[] args) {
        TrafficLightRopesTension trafficLightRopesTension = new TrafficLightRopesTension(136, 37);
        System.out.println(trafficLightRopesTension.calc());
    }
}
