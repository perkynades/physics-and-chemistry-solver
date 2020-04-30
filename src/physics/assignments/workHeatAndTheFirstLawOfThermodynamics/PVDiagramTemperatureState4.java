package physics.assignments.workHeatAndTheFirstLawOfThermodynamics;

public class PVDiagramTemperatureState4 {

    private double mass;
    private double temperature1;

    public PVDiagramTemperatureState4(double mass, double temperature1) {
        this.mass = mass;
        this.temperature1 = temperature1;
    }

    private double calc() {
        double temperature;

        temperature = ((1.5*150) / 100)*(temperature1+273.15);

        return temperature-273.15;
    }

    public static void main(String[] args) {
        PVDiagramTemperatureState4 pvDiagramTemperatureState4 = new PVDiagramTemperatureState4(4.1, 39.3);
        System.out.println(pvDiagramTemperatureState4.calc());
    }
}
