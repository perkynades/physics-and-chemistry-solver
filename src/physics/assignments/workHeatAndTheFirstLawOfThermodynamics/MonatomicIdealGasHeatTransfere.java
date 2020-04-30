package physics.assignments.workHeatAndTheFirstLawOfThermodynamics;

public class MonatomicIdealGasHeatTransfere {

    private double temperature;
    private double initVolume;
    private double finalVolume;
    private double pressure;

    public MonatomicIdealGasHeatTransfere(double temperature, double initVolume, double finalVolume, double pressure) {
        this.temperature = temperature;
        this.initVolume = initVolume;
        this.finalVolume = finalVolume;
        this.pressure = pressure;
    }

    private double calc() {
        double heat;

        heat = (pressure)*finalVolume*Math.log(finalVolume/initVolume);

        return heat;
    }

    public static void main(String[] args) {
        MonatomicIdealGasHeatTransfere monatomicIdealGasHeatTransfere = new MonatomicIdealGasHeatTransfere(300, 0.025, 0.055, 157);
        System.out.println(monatomicIdealGasHeatTransfere.calc());
    }
}
