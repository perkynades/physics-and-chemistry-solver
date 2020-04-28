package physics.assignments.macroscopicDescriptionOfMatter;

public class ExperimentPureGasFinalPressure {

    private double volume;
    private double pressure;
    private double chamberVolume;

    public ExperimentPureGasFinalPressure(double volume, double pressure, double chamberVolume) {
        this.volume = volume;
        this.pressure = pressure;
        this.chamberVolume = chamberVolume;
    }

    private double calc() {
        double finalPressure;

        finalPressure = (pressure*volume) / (volume+chamberVolume);

        return finalPressure*100;
    }

    public static void main(String[] args) {
        ExperimentPureGasFinalPressure experimentPureGasFinalPressure = new ExperimentPureGasFinalPressure(1.3, 1.6, 2.8);
        System.out.println(experimentPureGasFinalPressure.calc());
    }
}
