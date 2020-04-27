package physics.assignments.impulseAndMomentum;

public class AutomobilesCollisionCarBSpeed {

    private double massA;
    private double massB;
    private double speedA;
    private double angle;

    public AutomobilesCollisionCarBSpeed(double massA, double massB, double speedA, double angle) {
        this.massA = massA;
        this.massB = massB;
        this.speedA = speedA;
        this.angle = angle;
    }

    private double calc() {
        double totalSpeed;
        double speedB;

        totalSpeed = (speedA*massA) / ((massA+massB)*Math.cos(Math.toRadians(angle)));

        speedB = ((massB+massA)*totalSpeed*Math.sin(Math.toRadians(angle))) / massB;

        return speedB;
    }

    public static void main(String[] args) {
        AutomobilesCollisionCarBSpeed automobilesCollisionCarBSpeed = new AutomobilesCollisionCarBSpeed(1018, 1540, 25, 21);
        System.out.println(automobilesCollisionCarBSpeed.calc());
    }
}
