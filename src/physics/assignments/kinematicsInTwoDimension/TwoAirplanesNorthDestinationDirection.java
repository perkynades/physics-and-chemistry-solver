package physics.assignments.kinematicsInTwoDimension;

public class TwoAirplanesNorthDestinationDirection {

    private double dist;
    private double planeSpeed;
    private double windSpeed;

    public TwoAirplanesNorthDestinationDirection(double dist, double planeSpeed, double windSpeed) {
        this.dist = dist;
        this.planeSpeed = planeSpeed;
        this.windSpeed = windSpeed;
    }

    private double calc() {
        double angle;

        angle = Math.toDegrees(Math.asin(windSpeed/planeSpeed));

        return angle;
    }

    public static void main(String[] args) {
        TwoAirplanesNorthDestinationDirection twoAirplanesNorthDestinationDirection = new TwoAirplanesNorthDestinationDirection(500, 120, 10);
        System.out.println(twoAirplanesNorthDestinationDirection.calc() + " east of north");
    }
}
