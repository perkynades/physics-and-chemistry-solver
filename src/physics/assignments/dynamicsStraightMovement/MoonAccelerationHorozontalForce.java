package physics.assignments.dynamicsStraightMovement;

public class MoonAccelerationHorozontalForce {

    private double acceleration;
    private double earthForce;
    private double moonForce;

    public MoonAccelerationHorozontalForce(double acceleration, double earthForce, double moonForce) {
        this.acceleration = acceleration;
        this.earthForce = earthForce;
        this.moonForce = moonForce;
    }

    private double calc() {
        double mass;
        double moonAcceleration;

        mass = earthForce /acceleration;

        moonAcceleration = moonForce/mass;

        return moonAcceleration;
    }

    public static void main(String[] args) {
        MoonAccelerationHorozontalForce moonAccelerationHorozontalForce = new MoonAccelerationHorozontalForce(3.9, 51, 35);
        System.out.println(moonAccelerationHorozontalForce.calc());
    }
}
