package physics.assignments.impulseAndMomentum;

public class IceSkatersBiggerMassSpeed {

    private double smallMass;
    private double bigMass;
    private double speed;

    public IceSkatersBiggerMassSpeed(double smallMass, double bigMass, double speed) {
        this.smallMass = smallMass;
        this.bigMass = bigMass;
        this.speed = speed;
    }

    private double calc() {
        double bigSpeed;

        bigSpeed = (-smallMass*speed) / bigMass;

        return -bigSpeed;
    }

    public static void main(String[] args) {
        IceSkatersBiggerMassSpeed iceSkatersBiggerMassSpeed = new IceSkatersBiggerMassSpeed(30, 53, 0.452);
        System.out.println(iceSkatersBiggerMassSpeed.calc());
    }
}
