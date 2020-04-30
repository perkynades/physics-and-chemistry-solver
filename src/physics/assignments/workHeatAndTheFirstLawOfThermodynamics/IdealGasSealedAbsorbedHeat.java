package physics.assignments.workHeatAndTheFirstLawOfThermodynamics;

public class IdealGasSealedAbsorbedHeat {

    private double volume;
    private double initTemp;
    private double finalTemp;
    private double pressure;
    private double heatCapacity;

    public IdealGasSealedAbsorbedHeat(double volume, double initTemp, double finalTemp, double pressure, double heatCapacity) {
        this.volume = volume;
        this.initTemp = initTemp;
        this.finalTemp = finalTemp;
        this.pressure = pressure;
        this.heatCapacity = heatCapacity;
    }

    private double calc() {
        double tempChange;
        double moles;
        double heat;

        tempChange = (finalTemp) - (initTemp);

        moles = (pressure*(volume)) / (8.314*(finalTemp));

        heat = moles*heatCapacity*tempChange;

        return heat;
    }

    public static void main(String[] args) {
        IdealGasSealedAbsorbedHeat idealGasSealedAbsorbedHeat = new IdealGasSealedAbsorbedHeat(0.3, 325.8, 288.9, 59.5, 31.2);
        System.out.println(idealGasSealedAbsorbedHeat.calc());
    }
}
