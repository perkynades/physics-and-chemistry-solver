package physics.assignments.kinematicsInOneDimension;

public class CarAcceleration {

    private double initSpeed;
    private double finalSpeed;
    private double acceleration;

    public CarAcceleration(double initSpeed, double finalSpeed, double acceleration) {
        this.initSpeed = initSpeed;
        this.finalSpeed = finalSpeed;
        this.acceleration = acceleration;
    }

    private double calc() {
        double dist;

        dist = (Math.pow(finalSpeed, 2) - Math.pow(initSpeed, 2)) / (2*acceleration);

        return dist;
    }

    public static void main(String[] args) {
        CarAcceleration carAcceleration = new CarAcceleration(8.2, 33.7, 2.25);
        System.out.println(carAcceleration.calc());
    }
}
