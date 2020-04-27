package physics.assignments.kinematicsInTwoDimension;

public class ElectricalMotorArmatureAcceleration {

    private double spinSpeed;
    private double radius;

    public ElectricalMotorArmatureAcceleration(double spinSpeed, double radius) {
        this.spinSpeed = spinSpeed;
        this.radius = radius;
    }

    private double calc() {
        double acceleration;

        acceleration = (radius*100)*Math.pow(2*Math.PI*(spinSpeed/60), 2);

        return acceleration;
    }

    public static void main(String[] args) {
        ElectricalMotorArmatureAcceleration electricalMotorArmatureAcceleration = new ElectricalMotorArmatureAcceleration(2565.2, 2.375);
        System.out.println(electricalMotorArmatureAcceleration.calc());
    }
}
