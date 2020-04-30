package physics.assignments.workHeatAndTheFirstLawOfThermodynamics;

public class PVDiagramTemperatureState3 {

    private double mass;
    private double temperature;

    public PVDiagramTemperatureState3(double mass, double temperature) {
        this.mass = mass;
        this.temperature = temperature;
    }

    private double calc() {
        double temp3;

        temp3 = (((temperature+273)*50)/100)*1.5;

        return temp3-273;
    }

    public static void main(String[] args) {
        PVDiagramTemperatureState3 pvDiagramTemperatureState3 = new PVDiagramTemperatureState3(3.3, 30);
        System.out.println(pvDiagramTemperatureState3.calc());
    }
}
