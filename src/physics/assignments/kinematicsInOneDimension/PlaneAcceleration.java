package physics.assignments.kinematicsInOneDimension;

public class PlaneAcceleration {

    private double initSpeed;
    private double finalSpeed;
    private double dist;

    public PlaneAcceleration(double initSpeed, double finalSpeed, double dist) {
        this.initSpeed = initSpeed;
        this.finalSpeed = finalSpeed;
        this.dist = dist;
    }

    private double calc() {
        double acceleration;

        acceleration = (Math.pow(finalSpeed, 2) - Math.pow(initSpeed, 2)) / (2*dist*1000);

        return acceleration;
    }

    public static void main(String[] args) {
        PlaneAcceleration planeAcceleration = new PlaneAcceleration(194, 301.5, 1.53);
        System.out.println(planeAcceleration.calc());
    }
}
