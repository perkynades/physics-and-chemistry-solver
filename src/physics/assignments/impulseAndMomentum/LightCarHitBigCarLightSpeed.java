package physics.assignments.impulseAndMomentum;

public class LightCarHitBigCarLightSpeed {

    private double massLight;
    private double massBig;
    private double lightSpeed;
    private double bigSpeed;
    private double newSpeedBig;

    public LightCarHitBigCarLightSpeed(double massLight, double massBig, double lightSpeed, double bigSpeed, double newSpeedBig) {
        this.massLight = massLight;
        this.massBig = massBig;
        this.lightSpeed = lightSpeed;
        this.bigSpeed = bigSpeed;
        this.newSpeedBig = newSpeedBig;
    }

    private double calc() {
        double speed;

        speed = ((-(newSpeedBig*massBig) + (massLight*lightSpeed)) / massLight) +(bigSpeed*(massBig/massLight));

        return speed;
    }

    public static void main(String[] args) {
        LightCarHitBigCarLightSpeed lightCarHitBigCarLightSpeed = new LightCarHitBigCarLightSpeed(455, 761, 15.6, 14.1, 14);
        System.out.println(lightCarHitBigCarLightSpeed.calc());
    }
}
