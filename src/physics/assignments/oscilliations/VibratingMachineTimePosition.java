package physics.assignments.oscilliations;

public class VibratingMachineTimePosition {

    private double period;
    private double dist;
    private double time;

    public VibratingMachineTimePosition(double period, double dist, double time) {
        this.period = period;
        this.dist = dist;
        this.time = time;
    }

    private double calc() {
        double position;
        double amplitude;

        amplitude = dist/2;

        position = amplitude*(Math.sin((((2*Math.PI) / period)*time)));

        return position;
    }

    public static void main(String[] args) {
        VibratingMachineTimePosition vibratingMachineTimePosition = new VibratingMachineTimePosition(0.29, 4, 35);
        System.out.println(vibratingMachineTimePosition.calc());
    }
}
