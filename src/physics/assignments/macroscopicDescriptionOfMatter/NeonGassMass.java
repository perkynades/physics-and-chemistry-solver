package physics.assignments.macroscopicDescriptionOfMatter;

public class NeonGassMass {

    private double volume;
    private double pressure;
    private double temperature;
    private double atomicMass;

    public NeonGassMass(double volume, double pressure, double temperature, double atomicMass) {
        this.volume = volume;
        this.pressure = pressure;
        this.temperature = temperature;
        this.atomicMass = atomicMass;
    }

    private double calc() {
        double mass;

        mass = (pressure*volume*atomicMass) / (0.0821*temperature);

        return mass;
    }

    public static void main(String[] args) {
        NeonGassMass neonGassMass = new NeonGassMass(2.19, 2.33, 353.8, 20.2);
        System.out.println(neonGassMass.calc());
    }
}
