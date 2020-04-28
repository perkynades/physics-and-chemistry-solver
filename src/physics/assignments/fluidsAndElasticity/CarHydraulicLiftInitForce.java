package physics.assignments.fluidsAndElasticity;

public class CarHydraulicLiftInitForce {

    private double weight;
    private double bigRadius;
    private double smallRadius;

    public CarHydraulicLiftInitForce(double weight, double bigRadius, double smallRadius) {
        this.weight = weight;
        this.bigRadius = bigRadius;
        this.smallRadius = smallRadius;
    }

    private double calc() {
        double force;

        force = Math.pow(smallRadius/100, 2)*(weight/Math.pow(bigRadius/100, 2));

        return force;
    }

    public static void main(String[] args) {
        CarHydraulicLiftInitForce carHydraulicLiftInitForce = new CarHydraulicLiftInitForce(10097, 18.79, 5);
        System.out.println(carHydraulicLiftInitForce.calc());
    }
}
