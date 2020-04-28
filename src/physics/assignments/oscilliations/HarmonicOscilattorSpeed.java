package physics.assignments.oscilliations;

public class HarmonicOscilattorSpeed {

    private double amplitude;
    private double maxSpeed;
    private double displacement;

    public HarmonicOscilattorSpeed(double amplitude, double maxSpeed, double displacement) {
        this.amplitude = amplitude;
        this.maxSpeed = maxSpeed;
        this.displacement = displacement;
    }

    private double calc() {
        double speed;
        double angularSpeed;

        angularSpeed = maxSpeed/amplitude;

        speed = angularSpeed*Math.sqrt(Math.pow(amplitude, 2) - Math.pow(displacement, 2));

        return speed;
    }

    public static void main(String[] args) {
        HarmonicOscilattorSpeed harmonicOscilattorSpeed = new HarmonicOscilattorSpeed(3, 25.5, 1.39);
        System.out.println(harmonicOscilattorSpeed.calc());
    }
}
