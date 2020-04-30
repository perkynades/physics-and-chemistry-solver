package physics.assignments.workHeatAndTheFirstLawOfThermodynamics;

public class WaterIntoAluminumFinalTemperature {

    private double waterMass;
    private double waterTemp;
    private double aluminumMass;
    private double aluminumTemp;

    public WaterIntoAluminumFinalTemperature(double waterMass, double waterTemp, double aluminumMass, double aluminumTemp) {
        this.waterMass = waterMass;
        this.waterTemp = waterTemp;
        this.aluminumMass = aluminumMass;
        this.aluminumTemp = aluminumTemp;
    }

    private double calc() {
        double water;
        double aluminum;
        double temperature;

        water = (waterMass/100)*4190;

        aluminum = (aluminumMass/100)*900;

        temperature = -(-(aluminum*aluminumTemp)-(water*waterTemp)) / (water+aluminum);

        return temperature;
    }

    public static void main(String[] args) {
        WaterIntoAluminumFinalTemperature waterIntoAluminumFinalTemperature = new WaterIntoAluminumFinalTemperature(237, 42, 778, 7);
        System.out.println(waterIntoAluminumFinalTemperature.calc());
    }
}
