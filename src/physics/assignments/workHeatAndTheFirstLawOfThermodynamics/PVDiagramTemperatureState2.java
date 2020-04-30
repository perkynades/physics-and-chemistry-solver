package physics.assignments.workHeatAndTheFirstLawOfThermodynamics;

public class PVDiagramTemperatureState2 {

    private double mass;
    private double temperature1;

    public PVDiagramTemperatureState2(double mass, double temperature1) {
        this.mass = mass;
        this.temperature1 = temperature1;
    }

    private double calc() {
        double temperature2;

        temperature2 = 2*(temperature1 + 273);

        return temperature2;
    }

    public static void main(String[] args) {
        PVDiagramTemperatureState2 pvDiagramTemperatureState2 = new PVDiagramTemperatureState2(6.7, 69.4);
        System.out.println(pvDiagramTemperatureState2.calc());
    }
}
